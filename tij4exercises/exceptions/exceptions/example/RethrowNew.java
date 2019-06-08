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
 *    Created on  Dec 26, 2018
 *
 ************************************************************************/
package exceptions.example;

class OneException extends Exception {
    private static final long serialVersionUID = 1L;

    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    private static final long serialVersionUID = 1L;

    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try, e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
  originating the exception in f()
  Caught in inner try, e.printStackTrace()
  OneException: thrown from f()
  at RethrowNew.f(RethrowNew.java:15)
  at RethrowNew.main(RethrowNew.java:20)
  Caught in outer try, e.printStackTrace()
  TwoException: from inner try
  at RethrowNew.main(RethrowNew.java:25)
  *///:~
