/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Apr 23, 2019
 *
 ************************************************************************/
package containers;

//: containers/Unsupported.java
//Unsupported operations in Java containers.
import java.util.*;

public class Unsupported {
    static void test(String msg, List<String> list) {
        System.out.println("--- " + msg + " ---"); //$NON-NLS-1$ //$NON-NLS-2$
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        //Copy of the sublist:
        Collection<String> c2 = new ArrayList<String>(subList);
        try {
            c.retainAll(c2);
        } catch (Exception e) {
            System.out.println("retainAll(): " + e); //$NON-NLS-1$
        }
        try {
            c.removeAll(c2);
        } catch (Exception e) {
            System.out.println("removeAll(): " + e); //$NON-NLS-1$
        }
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear(): " + e); //$NON-NLS-1$
        }
        try {
            c.add("X"); //$NON-NLS-1$
        } catch (Exception e) {
            System.out.println("add(): " + e); //$NON-NLS-1$
        }
        try {
            c.addAll(c2);
        } catch (Exception e) {
            System.out.println("addAll(): " + e); //$NON-NLS-1$
        }
        try {
            c.remove("C"); //$NON-NLS-1$
        } catch (Exception e) {
            System.out.println("remove(): " + e); //$NON-NLS-1$
        }
        //The List.set() method modifies the value but
        //doesn’t change the size of the data structure:
        try {
            list.set(0, "X"); //$NON-NLS-1$
        } catch (Exception e) {
            System.out.println("List.set(): " + e); //$NON-NLS-1$
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K L".split(" ")); //$NON-NLS-1$ //$NON-NLS-2$
        test("Modifiable Copy", new ArrayList<String>(list)); //$NON-NLS-1$
        test("Arrays.asList()", list); //$NON-NLS-1$
        test("unmodifiableList()", Collections.unmodifiableList(new ArrayList<String>(list))); //$NON-NLS-1$
    }
} /* Output:
  --- Modifiable Copy ---
  --- Arrays.asList() ---
  retainAll(): java.lang.UnsupportedOperationException
  removeAll(): java.lang.UnsupportedOperationException
  clear(): java.lang.UnsupportedOperationException
  add(): java.lang.UnsupportedOperationException
  addAll(): java.lang.UnsupportedOperationException
  remove(): java.lang.UnsupportedOperationException
  --- unmodifiableList() ---
  retainAll(): java.lang.UnsupportedOperationException
  removeAll(): java.lang.UnsupportedOperationException
  clear(): java.lang.UnsupportedOperationException
  add(): java.lang.UnsupportedOperationException
  addAll(): java.lang.UnsupportedOperationException
  remove(): java.lang.UnsupportedOperationException
  List.set(): java.lang.UnsupportedOperationException
  *///:~
