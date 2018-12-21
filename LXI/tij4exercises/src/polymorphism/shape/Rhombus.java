package polymorphism.shape;

import static net.mindview.util.Print.print;

public class Rhombus extends Shape{

	@Override
	public void f() {
		print("Rhombus.f()");
	}

	@Override
	public void draw() {
		print("Rhombus.draw()");
	}

	@Override
	public void erase() {
		print("Rhombus.erase()");
	}

}
