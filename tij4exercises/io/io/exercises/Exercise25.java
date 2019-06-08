/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 21, 2019
 *
 ************************************************************************/
package io.exercises;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/*
Exercise 25: (6) Experiment with changing the ByteBuffer.allocate( ) statements in
the examples in this chapter to ByteBuffer.allocateDirect( ). Demonstrate performance
differences, but also notice whether the startup time of the programs noticeably changes.
 */

public class Exercise25 {

    static final private int SIZE = 1024;

    public static void main(String[] args) throws Exception {
        t1();
        t2();

    }

    public static void t1() throws Exception {
        long start = System.nanoTime();
        FileChannel fc = new FileOutputStream("d:/e25.txt").getChannel();
        ByteBuffer bb = ByteBuffer.allocate(100000);
        for (int i = 0; i < bb.capacity(); i++) {
            bb.put((byte)'f');
        }
        bb.clear();
        fc.write(bb);
        fc.close();
        long end = System.nanoTime();

        System.out.println(end-start+"");
    }
    public static void t2() throws Exception {
        long start = System.nanoTime();
        FileChannel fc = new FileOutputStream("d:/e25_2.txt").getChannel();
        ByteBuffer bb = ByteBuffer.allocateDirect(100000);
        for (int i = 0; i < bb.capacity(); i++) {
            bb.put((byte)'f');
        }
        bb.clear();
        fc.write(bb);
        fc.close();
        long end = System.nanoTime();

        System.out.println(end-start+"");
    }



}
