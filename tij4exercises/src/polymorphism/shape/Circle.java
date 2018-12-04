//: polymorphism/shape/Circle.java
package polymorphism.shape;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
	@Override
	public void draw() {
		print("Circle.draw()");
	}

	@Override
	public void erase() {
		print("Circle.erase()");
	}

	@Override
	public void f() {
		System.out.println("Circle!!!");
	}

} /// :~
