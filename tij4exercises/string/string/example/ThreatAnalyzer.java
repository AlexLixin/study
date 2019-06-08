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

import java.util.regex.*;
import java.util.*;

public class ThreatAnalyzer {
    static String threatData = "58.27.82.161@02/10/2005\n" + "204.45.234.40@02/11/2005\n" + "58.27.82.161@02/11/2005\n" + "58.27.82.161@02/12/2005\n" + "58.27.82.161@02/12/2005\n" + "[Next log section with different data format]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$

    public static void main(String[] args) {
        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@" + "(\\d{2}/\\d{2}/\\d{4})"; //$NON-NLS-1$ //$NON-NLS-2$
        while (scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.format("Threat on %s from %s\n", date, ip); //$NON-NLS-1$
        }
    }
} /* Output:
  Threat on 02/10/2005 from 58.27.82.161
  Threat on 02/11/2005 from 204.45.234.40
  Threat on 02/11/2005 from 58.27.82.161
  Threat on 02/12/2005 from 58.27.82.161
  Threat on 02/12/2005 from 58.27.82.161
  *///:~