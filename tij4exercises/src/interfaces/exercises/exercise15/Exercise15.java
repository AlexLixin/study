package interfaces.exercises.exercise15;

interface Exer14_1 {
    void f1();

    void f2();

}

interface Exer14_2 {
    void f3();

    void f4();

}

interface Exer14_3 {
    void f5();

    void f6();

}

interface Exer14_4 extends Exer14_1, Exer14_2, Exer14_3 {
}

class Exer14_5 {
    void f7() {
        System.out.println("f7()");
    }
}

abstract class Exer15_1 extends Exer14_5 implements Exer14_4 {
    void f7() {
        System.out.println("f7()");
    }
}

class Exer14 extends Exer15_1{
    public void f1() {
        // TODO Auto-generated method stub

    }

    @Override
    public void f2() {
        // TODO Auto-generated method stub

    }

    @Override
    public void f3() {
        // TODO Auto-generated method stub

    }

    @Override
    public void f4() {
        // TODO Auto-generated method stub

    }

    @Override
    public void f5() {
        // TODO Auto-generated method stub

    }

    @Override
    public void f6() {
        // TODO Auto-generated method stub

    }

}

public class Exercise15 {
    static void g1(Exer14_1 e) {
        e.f1();
        e.f2();
    }

    static void g2(Exer14_2 e) {
        e.f3();
        e.f3();
    }

    static void g3(Exer14_3 e) {
        e.f5();
        e.f6();
    }

    static void g4(Exer14_4 e) {
    }

    public static void main(String[] args) {
        Exer14 e = new Exer14();
        g1(e);
        g2(e);
        g3(e);
        g4(e);
    }
}
