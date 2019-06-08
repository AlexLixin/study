/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jan 22, 2019
 *
 ************************************************************************/
package generics;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(""); //$NON-NLS-1$
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
/* Output:
  java.lang.String
  java.lang.Integer
  java.lang.Double
  java.lang.Float
  java.lang.Character
  GenericMethods
  *///:~