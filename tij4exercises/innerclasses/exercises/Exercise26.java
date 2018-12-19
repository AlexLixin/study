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
 *    Created on  Dec 19, 2018
 *
 ************************************************************************/
package exercises;

class Exer26_1 {
    class Exer26_2 {
        private String s;

        public Exer26_2(String s) {
            super();
            this.s = s;
        }
    };
}


public class Exercise26 {
    class Exer26_3 extends Exer26_1.Exer26_2{

        public Exer26_3(Exer26_1 exer26_1, String s) {
            exer26_1.super(s);
        }

    }

    public static void main(String[] args) {
        Exercise26 e = new Exercise26();
        Exer26_3 exer26_3 = e.new Exer26_3(new Exer26_1(), "fdsafdsa");
    }
}
