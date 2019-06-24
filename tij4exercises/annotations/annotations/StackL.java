/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 24, 2019
 *
 ************************************************************************/
//: annotations/StackL.java
// A stack built on a linkedList.
package annotations;

import java.util.*;

public class StackL<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void push(T v) {
        list.addFirst(v);
    }

    public T top() {
        return list.getFirst();
    }

    public T pop() {
        return list.removeFirst();
    }
} ///:~