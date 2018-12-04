package initialization;

class Tank {
	boolean isfilled;

	public Tank() {
		this(true);
	}

	public Tank(boolean isfilled) {
		this.isfilled = isfilled;
	}

	void filled() {
		isfilled = true;
		System.out.println("filled");
	}

	void emptied() {
		isfilled = false;
		System.out.println("emptied");
	}

	@Override
	protected void finalize() throws Throwable {
		if (isfilled)
			System.out.println("error,tank is filled!");
		super.finalize();
	}

}

public class Exercise12 {
	public static void main(String[] args) {
		Tank tank = new Tank(true);
		tank.filled();
		tank.emptied();
		new Tank(true);
		System.gc();
	}
}
