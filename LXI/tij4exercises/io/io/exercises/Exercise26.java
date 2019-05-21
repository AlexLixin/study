/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 21, 2019
 *
 ************************************************************************/
package io.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Exercise26 {

    public static void main(String[] args) throws Exception {
        j();
    }
    public static void j() throws Exception {
        FileChannel fc = new FileInputStream("string/string/example/JGrep.java").getChannel();
        CharBuffer cb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()).asCharBuffer();

        String regex = ".*";
        String name = "string/string/example/JGrep.java";
        Pattern p = Pattern.compile(regex);
        //Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); //$NON-NLS-1$
        for (String line : new TextFile(name)) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start()); //$NON-NLS-1$ //$NON-NLS-2$
        }

    }
}
