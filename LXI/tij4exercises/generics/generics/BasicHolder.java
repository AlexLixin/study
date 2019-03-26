/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 26, 2019
 *
 ************************************************************************/
package generics;

//: generics/BasicHolder.java
public class BasicHolder<T> {
    T element;

    void set(T arg) {
        element = arg;
    }

    T get() {
        return element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
} ///:~