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
package example;

import java.util.regex.*;
import net.mindview.util.*;
import static net.mindview.util.Print.*;

/*! Here’s a block of text to use as input to
the regular expression matcher. Note that we’ll
first extract the block of text by looking for
the special delimiters, then process the
extracted block. !*/
public class TheReplacements {
    public static void main(String[] args) throws Exception {
        String s = TextFile.read("C:\\Users\\LXI\\git\\study\\LXI\\tij4exercises\\string\\example\\TheReplacements.java"); //$NON-NLS-1$
        // Match the specially commented block of text above:
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s); //$NON-NLS-1$
        if (mInput.find())
            s = mInput.group(1); // Captured by parentheses
        // Replace two or more spaces with a single space:
        s = s.replaceAll(" {2,}", " "); //$NON-NLS-1$ //$NON-NLS-2$
        // Replace one or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode:
        s = s.replaceAll("(?m)^ +", ""); //$NON-NLS-1$ //$NON-NLS-2$
        print(s);
        s = s.replaceFirst("[aeiou]", "(VOWEL1)"); //$NON-NLS-1$ //$NON-NLS-2$
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]"); //$NON-NLS-1$
        Matcher m = p.matcher(s);
        // Process the find information as you
        //perform the replacements:
        while (m.find())
            m.appendReplacement(sbuf, m.group().toUpperCase());
        //Put in the remainder of the text:
        m.appendTail(sbuf);
        print(sbuf);
    }
} /* Output:
  Here’s a block of text to use as input to
  the regular expression matcher. Note that we’ll
  first extract the block of text by looking for
  the special delimiters, then process the
  extracted block.
  H(VOWEL1)rE’s A blOck Of tExt tO UsE As InpUt tO
  thE rEgUlAr ExprEssIOn mAtchEr. NOtE thAt wE’ll
  fIrst ExtrAct thE blOck Of tExt by lOOkIng fOr
  thE spEcIAl dElImItErs, thEn prOcEss thE
  ExtrActEd blOck.
  *///:~