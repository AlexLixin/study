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
 *    Created on  Dec 25, 2018
 *
 ************************************************************************/
package exceptions.exercises;

public class Exercise5 {
    public static void main(String[] args) {
        String[] s = new String[10];
        while (true) {
            try {
                System.out.println(s[10]);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                s = new String[11];
            }
        }
        System.out.println("Out of while()");
    }
}
