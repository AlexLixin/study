/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Aug 5, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.concurrent.*;
import java.util.*;
import static net.mindview.util.Print.*;

class Car {
	private final int id;
	private boolean engine = false, driveTrain = false, wheels = false, exhaust = false, body = false, fenders = false;

	public Car(int idn) {
		id = idn;
	}

	// Empty Car object:
	public Car() {
		id = -1;
	}

	public synchronized int getId() {
		return id;
	}

	public synchronized void addEngine() {
		engine = true;
	}

	public synchronized void addDriveTrain() {
		driveTrain = true;
	}

	public synchronized void addWheels() {
		wheels = true;
	}

	public synchronized void addExhaustSystem() {
		exhaust = true;
	}

	public synchronized void addBody() {
		body = true;
	}

	public synchronized void addFenders() {
		fenders = true;
	}

	@Override
	public synchronized String toString() {
		return "Car " + id + " [" + " engine: " + engine + " driveTrain: " + driveTrain + " wheels: " + wheels
				+ " exhaust: " + exhaust + " body: " + body + " fenders: " + fenders + " ]";
	}

}

class CarQueue extends LinkedBlockingQueue<Car> {
	private static final long serialVersionUID = 1L;
}

class ChassisBuilder implements Runnable {
	private CarQueue carQueue;
	private int counter = 0;

	public ChassisBuilder(CarQueue cq) {
		carQueue = cq;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				TimeUnit.MILLISECONDS.sleep(500);
				// Make chassis:
				Car c = new Car(counter++);
				print("ChassisBuilder created " + c);
				// Insert into queue
				carQueue.put(c);
			}
		} catch (InterruptedException e) {
			print("Interrupted: ChassisBuilder");
		}
		print("ChassisBuilder off");
	}
}

class Assembler implements Runnable {
	private CarQueue chassisQueue, finishingQueue;
	private Car car;
	private CyclicBarrier barrier = new CyclicBarrier(7);
	private RobotPool robotPool;

	public Assembler(CarQueue cq, CarQueue fq, RobotPool rp) {
		chassisQueue = cq;
		finishingQueue = fq;
		robotPool = rp;
	}

	public Car car() {
		return car;
	}

	public CyclicBarrier barrier() {
		return barrier;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				// Blocks until chassis is available:
				car = chassisQueue.take();
				// Hire robots to perform work:
				robotPool.hire(EngineRobot.class, this);
				robotPool.hire(DriveTrainRobot.class, this);
				robotPool.hire(WheelRobot.class, this);
				robotPool.hire(ExhaustRobot.class, this);
				robotPool.hire(BodyRobot.class, this);
				robotPool.hire(FendersRobot.class, this);
				barrier.await(); // Until the robots finish
				// Put car into finishingQueue for further work
				finishingQueue.put(car);
			}
		} catch (InterruptedException e) {
			print("Exiting Assembler via interrupt");
		} catch (BrokenBarrierException e) {
			// This one we want to know about
			throw new RuntimeException(e);
		}
		print("Assembler off");
	}
}

class Reporter implements Runnable {
	private CarQueue carQueue;

	public Reporter(CarQueue cq) {
		carQueue = cq;
	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
				print(carQueue.take());
			}
		} catch (InterruptedException e) {
			print("Exiting Reporter via interrupt");
		}
		print("Reporter off");
	}
}

abstract class Robot implements Runnable {
	private RobotPool pool;

	public Robot(RobotPool p) {
		pool = p;
	}

	protected Assembler assembler;

	public Robot assignAssembler(Assembler assembler) {
		this.assembler = assembler;
		return this;
	}

	private boolean engage = false;

	public synchronized void engage() {
		engage = true;
		notifyAll();
	}

	// The part of run() that��s different for each robot:
	abstract protected void performService();

	@Override
	public void run() {
		try {
			powerDown(); // Wait until needed
			while (!Thread.interrupted()) {
				performService();
				assembler.barrier().await(); // Synchronize
				// We��re done with that job...
				powerDown();
			}
		} catch (InterruptedException e) {
			print("Exiting " + this + " via interrupt");
		} catch (BrokenBarrierException e) {
			// This one we want to know about
			throw new RuntimeException(e);
		}
		print(this + " off");
	}

	private synchronized void powerDown() throws InterruptedException {
		engage = false;
		assembler = null; // Disconnect from the Assembler
		// Put ourselves back in the available pool:
		pool.release(this);
		while (engage == false) // Power down
			wait();
	}

	@Override
	public String toString() {
		return getClass().getName();
	}
}

class EngineRobot extends Robot {
	public EngineRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		print(this + " installing engine");
		assembler.car().addEngine();
	}
}

class DriveTrainRobot extends Robot {
	public DriveTrainRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		print(this + " installing DriveTrain");
		assembler.car().addDriveTrain();
	}
}

class WheelRobot extends Robot {
	public WheelRobot(RobotPool pool) {
		super(pool);
	}

	@Override
	protected void performService() {
		print(this + " installing Wheels");
		assembler.car().addWheels();
	}
}

class ExhaustRobot extends Robot {

	public ExhaustRobot(RobotPool p) {
		super(p);
	}

	@Override
	protected void performService() {
		print(this + " installing Exhaust system");
		assembler.car().addExhaustSystem();
	}
}

class BodyRobot extends Robot {

	public BodyRobot(RobotPool p) {
		super(p);
	}

	@Override
	protected void performService() {
		print(this + " installing Body");
		assembler.car().addBody();
	}
}

class FendersRobot extends Robot {

	public FendersRobot(RobotPool p) {
		super(p);
	}

	@Override
	protected void performService() {
		print(this + " installing fenders");
		assembler.car().addFenders();
	}
}

class RobotPool {
	// Quietly prevents identical entries:
	private Set<Robot> pool = new HashSet<Robot>();

	public synchronized void add(Robot r) {
		pool.add(r);
		notifyAll();
	}

	public synchronized void hire(Class<? extends Robot> robotType, Assembler d) throws InterruptedException {
		for (Robot r : pool)
			if (r.getClass().equals(robotType)) {
				pool.remove(r);
				r.assignAssembler(d);
				r.engage(); // Power it up to do the task
				return;
			}
		wait(); // None available
		hire(robotType, d); // Try again, recursively
	}

	public synchronized void release(Robot r) {
		add(r);
	}
}


public class Exercise37 {
	public static void main(String[] args) throws Exception {
		CarQueue chassisQueue = new CarQueue(), finishingQueue = new CarQueue();
		ExecutorService exec = Executors.newCachedThreadPool();
		RobotPool robotPool = new RobotPool();
		exec.execute(new EngineRobot(robotPool));
		exec.execute(new DriveTrainRobot(robotPool));
		exec.execute(new WheelRobot(robotPool));
		exec.execute(new ExhaustRobot(robotPool));
		exec.execute(new BodyRobot(robotPool));
		exec.execute(new FendersRobot(robotPool));
		exec.execute(new Assembler(chassisQueue, finishingQueue, robotPool));
		exec.execute(new Reporter(finishingQueue));
		// Start everything running by producing chassis:
		exec.execute(new ChassisBuilder(chassisQueue));
		TimeUnit.SECONDS.sleep(7);
		exec.shutdownNow();
	}
}
