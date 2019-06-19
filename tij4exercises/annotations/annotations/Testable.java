/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 19, 2019
 *
 ************************************************************************/
package annotations;

//: annotations/Testable.java

import net.mindview.atunit.*;

public class Testable {
    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
} ///:~