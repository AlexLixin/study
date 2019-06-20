/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 20, 2019
 *
 ************************************************************************/
//: annotations/HashSetTest.java
package annotations;

import java.util.*;
import net.mindview.atunit.*;
import net.mindview.util.*;

public class HashSetTest {
    HashSet<String> testObject = new HashSet<String>();

    @Test
    void initialization() {
        testObject.add("fdsafdsa");
        assert testObject.isEmpty();
    }

    @Test
    void _contains() {
        testObject.add("one");
        System.out.println(testObject);
        assert testObject.contains("one");
    }

    @Test
    void _remove() {
        System.out.println(testObject);
        testObject.add("one");
        testObject.remove("one");
        assert testObject.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java -cp D:\\workspace\\study\\tij4exercises\\bin net.mindview.atunit.AtUnit bin/annotations/HashSetTest");
    }
} /* Output:
  annotations.HashSetTest
  . initialization
  . _remove
  . _contains
  OK (3 tests)
  *///:~