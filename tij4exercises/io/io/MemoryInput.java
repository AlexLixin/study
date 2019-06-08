/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 17, 2019
 *
 ************************************************************************/
package io;

//: io/MemoryInput.java
import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("io/io/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char)c);
    }
} /* (Execute to see output) *///:~