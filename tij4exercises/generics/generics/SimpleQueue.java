/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 27, 2019
 *
 ************************************************************************/
package generics;

//: generics/SimpleQueue.java
//A different kind of container that is Iterable
import java.util.*;

public class SimpleQueue<T> implements Iterable<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void add(T t) {
        storage.offer(t);
    }

    public T get() {
        return storage.poll();
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
} ///:~