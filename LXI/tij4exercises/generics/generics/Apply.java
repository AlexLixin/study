/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 27, 2019
 *
 ************************************************************************/
package generics;

//: generics/Apply.java
//{main: ApplyTest}
import java.lang.reflect.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class Apply {
    public static <T, S extends Iterable<? extends T>> void apply(S seq, Method f, Object... args) {
        try {
            for (T t : seq)
                f.invoke(t, args);
        } catch (Exception e) {
            //Failures are programmer errors
            throw new RuntimeException(e);
        }
    }
}

class Shape {
    public void rotate() {
        print(this + " rotate"); //$NON-NLS-1$
    }

    public void resize(int newSize) {
        print(this + " resize " + newSize); //$NON-NLS-1$
    }
}

class Square extends Shape {
//todo
}

class FilledList<T> extends ArrayList<T> {
    private static final long serialVersionUID = 1L;

    public FilledList(Class<? extends T> type, int size) {
        try {
            for (int i = 0; i < size; i++)
                // Assumes default constructor:
                add(type.newInstance());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class ApplyTest {
    public static void main(String[] args) throws Exception {
        List<Shape> shapes = new ArrayList<Shape>();
        for (int i = 0; i < 10; i++)
            shapes.add(new Shape());
        Apply.apply(shapes, Shape.class.getMethod("rotate")); //$NON-NLS-1$
        Apply.apply(shapes, Shape.class.getMethod("resize", int.class), 5); //$NON-NLS-1$
        List<Square> squares = new ArrayList<Square>();
        for (int i = 0; i < 10; i++)
            squares.add(new Square());
        Apply.apply(squares, Shape.class.getMethod("rotate")); //$NON-NLS-1$
        Apply.apply(squares, Shape.class.getMethod("resize", int.class), 5); //$NON-NLS-1$
        Apply.apply(new FilledList<Shape>(Shape.class, 10), Shape.class.getMethod("rotate")); //$NON-NLS-1$
        Apply.apply(new FilledList<Shape>(Square.class, 10), Shape.class.getMethod("rotate")); //$NON-NLS-1$
        SimpleQueue<Shape> shapeQ = new SimpleQueue<Shape>();
        for (int i = 0; i < 5; i++) {
            shapeQ.add(new Shape());
            shapeQ.add(new Square());
        }
        Apply.apply(shapeQ, Shape.class.getMethod("rotate")); //$NON-NLS-1$
    }
} /* (Execute to see output) *///:~