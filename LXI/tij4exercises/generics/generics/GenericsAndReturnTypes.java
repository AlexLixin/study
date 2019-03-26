/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 26, 2019
 *
 ************************************************************************/
package generics;

//: generics/GenericsAndReturnTypes.java
interface GenericGetter<T extends GenericGetter<T>> {
    T get();
}

interface Getter extends GenericGetter<Getter> {
}

public class GenericsAndReturnTypes {
    void test(Getter g) {
        Getter result = g.get();
        GenericGetter gg = g.get(); // Also the base type
    }
} ///:~