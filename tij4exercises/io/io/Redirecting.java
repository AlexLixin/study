/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 20, 2019
 *
 ************************************************************************/
package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

//: io/Redirecting.java
//Demonstrates standard I/O redirection
public class Redirecting {
    public static void main(String[] args) throws Exception {
        PrintStream ps = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("io/io/Redirecting.java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        out.println("12312");
        out.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s=br.readLine())!=null) {
            System.out.println(s);
        }
        out.close();
        System.setOut(ps);



    }
}
