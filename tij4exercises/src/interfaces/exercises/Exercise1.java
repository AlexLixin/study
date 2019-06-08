package interfaces.exercises;

import java.util.Random;

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

    public void showRefocunt() {
        print("refcount = " + refcount);
    }

    @Override
    protected void finalize() throws Throwable {
        if (refcount > 0)
            print("Error: " + refcount + " Shared " + id + " objects in use");
    }

}

class Description {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private String s;

    Description(String s, Shared shared) {
        this.s = s;
        this.shared = shared;
        this.shared.addRef();
        print("Creating " + this); //$NON-NLS-1$
    }

    protected void dispose() {
        print("disposing " + this); //$NON-NLS-1$
        shared.dispose();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + s + " " + id; //$NON-NLS-1$
    }

}

abstract class Rodent {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description1 d; //$NON-NLS-1$

    public Rodent() {
        print("Rodent()"); //$NON-NLS-1$
    }

    public Rodent(Shared s) {
        this.shared = s;
        d = new Description1("rodent description", this.shared);
        print("Creating " + this); //$NON-NLS-1$
        this.shared.addRef();
    }

    abstract void run();

    abstract void eat();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

class Mouse extends Rodent {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description1 d; //$NON-NLS-1$

    public Mouse(Shared s2) {
        print("Creating " + this); //$NON-NLS-1$
        this.shared = s2;
        d = new Description1("Mouse description", this.shared);
        this.shared.addRef();
    }

    public Mouse() {
        print("Mouse()"); //$NON-NLS-1$
    }

    void run() {
        System.out.println("Mouse.run()"); //$NON-NLS-1$
    }

    void eat() {
        System.out.println("Mouse.eat()"); //$NON-NLS-1$
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

class Gerbil extends Rodent {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description1 d; //$NON-NLS-1$

    public Gerbil(Shared s2) {
        print("Creating " + this); //$NON-NLS-1$
        this.shared = s2;
        d = new Description1("Gerbil description", this.shared);
        this.shared.addRef();
    }

    public Gerbil() {
        print("Gerbil()"); //$NON-NLS-1$
    }

    void run() {
        System.out.println("Gerbil.run()"); //$NON-NLS-1$
    }

    void eat() {
        System.out.println("Gerbil.eat()"); //$NON-NLS-1$
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

class Hamster extends Rodent {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    private Description1 d; //$NON-NLS-1$

    public Hamster() {
        print("Hamster()"); //$NON-NLS-1$
    }

    public Hamster(Shared s2) {
        print("Creating " + this); //$NON-NLS-1$
        this.shared = s2;
        d = new Description1("Hamster description", this.shared);
        this.shared.addRef();
    }

    void run() {
        System.out.println("Hamster.run()"); //$NON-NLS-1$
    }

    void eat() {
        System.out.println("Hamster.eat()"); //$NON-NLS-1$
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + id;
    }
}

public class Exercise1 {
    private static Random rand = new Random();

    public static Rodent1 next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Mouse1();
            case 1:
                return new Gerbil1();
            case 2:
                return new Hamster1();
        }
    }

    static public void f(Rodent1[] r) {
        for (Rodent1 rodent : r) {
            rodent.eat();
            rodent.run();
        }
    }

    public static void main(String[] args) {
        Rodent1[] r = new Rodent1[3];
        for (int i = 0; i < r.length; i++) {
            r[i] = next();
        }
        f(r);
    }

}
