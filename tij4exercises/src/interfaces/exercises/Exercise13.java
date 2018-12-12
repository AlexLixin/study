package interfaces.exercises;

interface E131{
    void f1();
}
interface E132 extends E131{
    void f2();
}
interface E133 extends E131{
    void f3();
}
interface E134 extends E132,E133{
    void f4();
}
public class Exercise13 implements E134{

    @Override
    public void f2() {

    }

    @Override
    public void f1() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

}
