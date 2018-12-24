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
 *    Created on  Dec 24, 2018
 *
 ************************************************************************/
package holding.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class Exercise21 {
    public static void main(String[] args) {
        //1.get words list from file
        List<String> wordsList = new ArrayList<String>(new TextFile("C:\\Users\\LXI\\git\\study\\LXI\\tij4exercises\\holding\\example\\SetOperations.java", "\\W+")); //$NON-NLS-1$ //$NON-NLS-2$

        //2.sort words using Collections.sort()
        System.out.println(wordsList);
        Collections.sort(wordsList, String.CASE_INSENSITIVE_ORDER);
        System.out.println(wordsList);

        //3.list to map,count occurrence of words.
        Map<String, Integer> wordsMap = new LinkedHashMap<>();
        for (String string : wordsList) {
            Integer freq = wordsMap.get(string);
            wordsMap.put(string, freq == null ? 1 : freq + 1);
        }
        System.out.println(wordsMap);





    }
}
