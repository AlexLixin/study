/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 17, 2019
 *
 ************************************************************************/
package io;

//: io/FormattedMemoryInput.java
import java.io.*;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("io/io/FormattedMemoryInput.java").getBytes()));
            while (true)
                System.out.print((char)in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
} /* (Execute to see output) *///:~