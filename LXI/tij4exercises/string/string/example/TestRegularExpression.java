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
package string.example;

import java.util.regex.*;
import static net.mindview.util.Print.*;

public class TestRegularExpression {
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
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1)); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            }
        }
    }
} /* Output:
  Input: "abcabcabcdefabc"
  Regular expression: "abcabcabcdefabc"
  Match "abcabcabcdefabc" at positions 0-14
  Regular expression: "abc+"
  Match "abc" at positions 0-2
  Match "abc" at positions 3-5
  Match "abc" at positions 6-8
  Match "abc" at positions 12-14
  Regular expression: "(abc)+"
  Match "abcabcabc" at positions 0-8
  Match "abc" at positions 12-14
  Regular expression: "(abc){2,}"
  Match "abcabcabc" at positions 0-8
  *///:~

/*
abcabcabcdefabc
abcabcabcdefabc
abc+
(abc)+
(abc){2,}
 */

/*
"Java now has regular expressions"
"^Java"
"\Breg.*"
"n.w\s+h(a|i)s"
"s?"
"s*"
"s+"
"s{4}"
"S{1}."
"s{0,3}"
 */
