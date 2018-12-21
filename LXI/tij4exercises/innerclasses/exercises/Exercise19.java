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
 *    Created on  Dec 17, 2018
 *
 ************************************************************************/
package exercises;

class Exer19_1 {
    class Exer19_2 {
        public void f() {
            System.out.println("f()"); //$NON-NLS-1$
        }
        private class Exer19_3 {

        }
        public Exer19_3 getExer19_3() {
            return new Exer19_3();
        }
    }
    public Exer19_2 getExer19_2() {
        return new Exer19_2();
    }
}

class Exer19_4 {
    private static class Exer19_5 {
        private static class Exer19_6 {

        }
    }
}

public class Exercise19 {
    public static void main(String[] args) {
        Exer19_1 exer19_1 = new Exer19_1();
        exer19_1.getExer19_2().getExer19_3();

    }
}
/*
 * Exer19_4$Exer19_5$Exer19_6.class
 * Exer19_4$Exer19_5.class
 * Exer19_4.class
 * Exer19_1$Exer19_2$Exer19_3.class
 * Exer19_1$Exer19_2.class
 * Exer19_1.class
*/
