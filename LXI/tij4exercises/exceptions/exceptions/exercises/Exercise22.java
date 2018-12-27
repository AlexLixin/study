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
 *    Created on  Dec 27, 2018
 *
 ************************************************************************/
package exceptions.exercises;

class FailingConstructor {

    public FailingConstructor() throws Exception{
    }

}

public class Exercise22 {
    public static void main(String[] args) {
        try {
            FailingConstructor f = new FailingConstructor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
