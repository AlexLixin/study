/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Apr 9, 2019
 *
 ************************************************************************/
package demo.lsis;

public interface DemoA {
    static String a = "12456463";

    public static String test() {
        return "静态方法test()";
    }
}

class DemoB implements DemoA {

    public static void main(String[] args) {
        DemoB demoB = new DemoB();
        System.out.println(a); //实现类的实例可以调用接口中的静态变量
        System.out.println(DemoB.a); //实现类可以直接调用接口中的静态变量
//                System.out.println(demoB.test()); //实现类的实例不可以调用接口中的静态方法
//                System.out.println(DemoB.test()); //实现类不可以直接调用接口的静态方法
    }

}

interface DemoC {
    static String a = "456";
}

class DemoD implements DemoA, DemoC {
    public static void main(String[] args) {
        DemoD demoD = new DemoD();
        //当实现类实现了两个接口，两个接口有一样的成员变量的时候，此时实现类和实现类的实例都无法调用接口的静态变量了，因为编译器无法选择
        //        System.out.println(demoD.a);
        //        System.out.println(DemoD.a);
    }
}