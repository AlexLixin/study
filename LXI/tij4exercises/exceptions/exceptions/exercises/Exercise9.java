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

import static net.mindview.util.Print.print;

class ExceptionA extends Exception {
    private static final long serialVersionUID = 1L;

    ExceptionA(String msg) {
        super(msg);
    }
}

class ExceptionB extends Exception {
    private static final long serialVersionUID = 1L;

    ExceptionB(String msg) {
        super(msg);
    }
}

class ExceptionC extends Exception {
    private static final long serialVersionUID = 1L;

    ExceptionC(String msg) {
        super(msg);
    }
}

public class Exercise9 {
    public static void f(int x) throws ExceptionA, ExceptionB, ExceptionC {
        if (x < 0)
            throw new ExceptionA("x < 0");
        if (x == 0)
            throw new ExceptionB("x == 0");
        if (x > 0)
            throw new ExceptionC("x > 0");
    }

    public static void main(String[] args) {
        try {
            f(0);
            f(1);
            f(-1);
            // will catch any Exception type:
        } catch (Exception e) {
            print("Caught Exception");
            e.printStackTrace(System.out);
        }
    }
}