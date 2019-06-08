/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 17, 2019
 *
 ************************************************************************/
package io.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

import io.BufferedInputFile;

public class Exercise14 {
    static String file = "io/io/BasicFileOutput.out";

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("io/io/BasicFileOutput.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;
        long start = System.nanoTime();
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        long d1 = System.nanoTime() - start;
        //Show the stored file:
        System.out.println(BufferedInputFile.read(file));

        in = new BufferedReader(new StringReader(BufferedInputFile.read("io/io/BasicFileOutput.java")));
        out = new PrintWriter(new FileWriter(file));
        lineCount = 1;
        start = System.nanoTime();
        while ((s = in.readLine()) != null)
            out.println(lineCount++ + ": " + s);
        out.close();
        long d2 = System.nanoTime() - start;
        //Show the stored file:
        System.out.println(BufferedInputFile.read(file));


        System.out.println("\n d1: "+d1);
        System.out.println("\n d2: "+d2);

    }
}
