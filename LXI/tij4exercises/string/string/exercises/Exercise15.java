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
package string.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class Exercise15 {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex"); //$NON-NLS-1$
            System.exit(0);
        }

        int flag = 0;
        for (int i = 2; i < args.length; i++) {
            switch (args[i]) {
                case "CANON_EQ": //$NON-NLS-1$
                    flag |= Pattern.CANON_EQ;
                    break;
                case "CASE_INSENSITIVE": //$NON-NLS-1$
                    flag |= Pattern.CASE_INSENSITIVE;
                    break;
                case "COMMENTS": //$NON-NLS-1$
                    flag |= Pattern.COMMENTS;
                    break;
                case "DOTALL": //$NON-NLS-1$
                    flag |= Pattern.DOTALL;
                    break;
                case "LITERAL": //$NON-NLS-1$
                    flag |= Pattern.LITERAL;
                    break;
                case "MULTILINE": //$NON-NLS-1$
                    flag |= Pattern.MULTILINE;
                    break;
                case "UNICODE_CASE": //$NON-NLS-1$
                    flag |= Pattern.UNICODE_CASE;
                    break;
                case "UNIX_LINES": //$NON-NLS-1$
                    flag |= Pattern.UNIX_LINES;
                    break;
                case "UNICODE_CHARACTER_CLASS": //$NON-NLS-1$
                    flag |= Pattern.UNICODE_CHARACTER_CLASS;
                    break;
                default:
                    break;
            }
        }

        Pattern p = Pattern.compile(args[1],flag);
        //Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher(""); //$NON-NLS-1$
        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start()); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

}
