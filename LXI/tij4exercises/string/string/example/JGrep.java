/************************************************************************
 *                                                                      *
 *  DDDD     SSSS    AAA        Daten- und Systemtechnik Aachen GmbH    *
 *  D   D   SS      A   A       Pascalstrasse 28                        *
 *  D   D    SSS    AAAAA       52076 Aachen-Oberforstbach, Germany     *
 *  D   D      SS   A   A       Telefon: +49 (0)2408 / 9492-0           *
 *  DDDD    SSSS    A   A       Telefax: +49 (0)2408 / 9492-92          *
 *                                                                      *
 *                                                                      *
 *  (c) Copyright by DSA - all rights reserved                          *
 *                                                                      *
 ************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jan 3, 2019
 *
 ************************************************************************/
package string.example;

//A very simple version of the "grep" program.
//{Args: JGrep.java "\\b[Ssct]\\w+"}
import java.util.regex.*;
import net.mindview.util.*;

public class JGrep {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex"); //$NON-NLS-1$
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        //Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); //$NON-NLS-1$
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start()); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }
} /* Output: (Sample)
  0: strings: 4
  1: simple: 10
  2: the: 28
  3: Ssct: 26
  4: class: 7
  5: static: 9
  6: String: 26
  7: throws: 41
  8: System: 6
  9: System: 6
  10: compile: 24
  11: through: 15
  12: the: 23
  13: the: 36
  14: String: 8
  15: System: 8
  16: start: 31
  *///:~