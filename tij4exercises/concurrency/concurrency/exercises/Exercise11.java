/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 26, 2019
 *
 ************************************************************************/
package concurrency.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Exercise11 {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		Person11 p = new Person11("monica", 21);
		for (int i = 0; i < 3; i++) {
			es.execute(new Runnable() {
				@Override
				public void run() {
					while (true) {
						try {
							TimeUnit.SECONDS.sleep(1);
							p.changePerson();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
		}
		es.execute(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						TimeUnit.SECONDS.sleep(1);
						System.out.println(p);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		es.shutdown();

	}
}

class Person11 {
	static private int count = 0;
	private final int id = count++;
	private String name;
	private int age;

	public Person11(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public synchronized void changePerson() {
		name = "monica" + (age+1);
		age++;
	}

	@Override
	public  String toString() {
		return "Person11 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}