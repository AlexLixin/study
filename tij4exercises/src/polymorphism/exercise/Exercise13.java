package polymorphism.exercise;

//Cleaning up shared member objects.
import static net.mindview.util.Print.*;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;

	public Shared() {
		print("Creating " + this);
	}

	public void addRef() {
		refcount++;
	}

	protected void dispose() {
		if (--refcount == 0)
			print("Disposing " + this);
	}

	public String toString() {
		return "Shared " + id;
	}

	@Override
	protected void finalize() throws Throwable {
		if(refcount > 0)
			print("Error: " + refcount + " Shared " + id + " objects in use");
	}
	
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	private boolean disposed = false;

	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}

	protected void dispose() {
		print("disposing " + this);
		disposed = true;
		shared.dispose();
	}


	public String toString() {
		return "Composing " + id;
	}
}

public class Exercise13 {
	public static void main(String[] args) throws Throwable {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		System.gc();
		for (Composing c : composing)
			c.dispose();
		Composing compTest = new Composing(shared);
		Composing compTest2 = new Composing(shared);
		// Test finalize():
		shared.finalize();
		Shared sharedTest = new Shared();
		Composing compTest3 = new Composing(sharedTest);
		// Test sharedTest finalize():
		sharedTest.finalize();
	}
} /*
	 * Output: Creating Shared 0 Creating Composing 0 Creating Composing 1 Creating
	 * Composing 2 Creating Composing 3 Creating Composing 4 disposing Composing 0
	 * disposing Composing 1 disposing Composing 2 disposing Composing 3 disposing
	 * Composing 4 Disposing Shared 0
	 */// :~
