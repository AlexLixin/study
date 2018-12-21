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
 *    Created on  Dec 13, 2018
 *
 ************************************************************************/
package exercises;

public class Exercise3 {

}

/*
package exercises;

import exercises.Outer.Inner;

class Outer {

    private String s;

    public Outer() {
    }
    public Outer(String s) {
        this.s = s;
    }
    class Inner {

        @Override
        public String toString() {
            return s;
        }

    }

    Inner f(){
        return new Inner();
    }
    void ship(){
        Inner i = f();
    }
    public static void main(String[] args) {
        Outer o = new Outer("fdsaffdsadfs");
        o.ship();
        Inner f = o.f();
        System.out.println(f);
        //Inner f = f();

    }
}

public class Exericse1 {

    public static void main(String[] args) {
        Inner f = new Outer().f();
        System.out.println(f);
    }
}*/
