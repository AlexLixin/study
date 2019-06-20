/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 20, 2019
 *
 ************************************************************************/
//: annotations/AtUnitExternalTest.java
// Creating non-embedded tests.
package annotations;

import net.mindview.atunit.*;
import net.mindview.util.*;

public class AtUnitExternalTest extends AtUnitExample1 {
    @Test
    boolean _methodOne() {
        return methodOne().equals("This is methodOne");
    }

    @Test
    boolean _methodTwo() {
        return methodTwo() == 2;
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java -cp D:\\workspace\\study\\tij4exercises\\bin net.mindview.atunit.AtUnit bin/annotations/AtUnitExternalTest");
    }
} /* Output:
  annotations.AtUnitExternalTest
  . _methodOne
  . _methodTwo This is methodTwo
  OK (2 tests)
  *///:~