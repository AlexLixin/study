/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 20, 2019
 *
 ************************************************************************/
package io;

//: io/Echo.java
//How to read from standard input.
//{RunByHand}
import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s=bf.readLine())!=null) {
            System.out.println(s);
        }

    }
} ///:~