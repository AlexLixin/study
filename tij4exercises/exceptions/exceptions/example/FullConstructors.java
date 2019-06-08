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
package exceptions.example;

class MyException extends Exception {
    /**
     * COMMENT - Add concise description of the purpose of this field.
     *           Description should go beyond the field's name.
     *
     * Comment for <code>serialVersionUID</code>
     */
    private static final long serialVersionUID = 1L;

    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}

public class FullConstructors {
    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace(System.err);
        }
    }
} /* Output:
  Throwing MyException from f()
  MyException
  at FullConstructors.f(FullConstructors.java:11)
  at FullConstructors.main(FullConstructors.java:19)
  Throwing MyException from g()
  MyException: Originated in g()
  at FullConstructors.g(FullConstructors.java:15)
  at FullConstructors.main(FullConstructors.java:24)
  *///:~
