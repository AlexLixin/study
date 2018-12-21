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
 *    Created on  Dec 14, 2018
 *
 ************************************************************************/
package exercises;

class Exer71 {
    private String s;

    public Exer71(String s) {
        this.s = s;
    }

    private void f() {
        System.out.println("f()"); //$NON-NLS-1$
    }

    class Exer72 {
        void run() {
            System.out.println("Exer72.run()"); //$NON-NLS-1$
            s = "fdsafdsa"; //$NON-NLS-1$
            f();
        }
    }

    void g() {
        System.out.println("g()"); //$NON-NLS-1$
        new Exer72().run();
    }
    void show() {
        System.out.println(s);
    }
}

public class Exercise7 {
public static void main(String[] args) {
    Exer71 e = new Exer71("xixix"); //$NON-NLS-1$
    e.show();
    e.g();
    e.show();
}
}
