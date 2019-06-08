package innerclasses.exercises;
interface Exer13_1 {
    void f();
}


public class Exercise13 {
	Exer13_1 f() {
        return new Exer13_1() {

                @Override
                public void f() {
                    System.out.println("f()");
                }

        };
    }

    public static void main(String[] args) {
        new Exercise9().f().f();;
    }
}
