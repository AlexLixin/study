/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 20, 2019
 *
 ************************************************************************/
package io;

//: io/OSExecuteDemo.java
//Demonstrates standard I/O redirection.
import net.mindview.util.*;

public class OSExecuteDemo {
    public static void main(String[] args) {
        OSExecute.command("javap OSExecuteDemo");// /tij4exercises/io/io/OSExecuteDemo.java

    }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
public OSExecuteDemo();
public static void main(java.lang.String[]);
}
*///:~
