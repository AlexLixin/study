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
 *    Created on  Jan 2, 2019
 *
 ************************************************************************/
package exercises;

import java.util.regex.*;
import static net.mindview.util.Print.*;

public class Exercise11 {

    public static void main(String[] args) {
        if (args.length < 2) {
            print("Usage:\njava TestRegularExpression " + "characterSequence regularExpression+"); //$NON-NLS-1$ //$NON-NLS-2$
            System.exit(0);
        }
        print("Input: \"" + args[0] + "\""); //$NON-NLS-1$ //$NON-NLS-2$
        for (String arg : args) {
            print("Regular expression: \"" + arg + "\""); //$NON-NLS-1$ //$NON-NLS-2$
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            if (!m.find())
                print("No match found for " + "\"" + arg + "\""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            m.reset();
            while (m.find()) {
                print("Match \"" + m.group() + "\" at position " + m.start() + ((m.end() - m.start() < 2) ? "" : ("-" + (m.end() - 1)))); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
            }
        }

        System.out.println(args[0].matches(args[1]));
    }
}
