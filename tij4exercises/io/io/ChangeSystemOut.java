/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 20, 2019
 *
 ************************************************************************/
package io;

import java.io.PrintWriter;

public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("fdsfdsa");
        pw.flush();
    }
}
