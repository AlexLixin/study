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

public class Rethrowing {
    public static void f() throws Exception {
        System.out.println("originating the exception in f()");
        throw new Exception("thrown from f()");
    }

    public static void g() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside g(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }

    public static void h() throws Exception {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Inside h(),e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
} /* Output:
  originating the exception in f()
  Inside g(),e.printStackTrace()
  java.lang.Exception: thrown from f()
  at Rethrowing.f(Rethrowing.java:7)
  at Rethrowing.g(Rethrowing.java:11)
  at Rethrowing.main(Rethrowing.java:29)
  main: printStackTrace()
  java.lang.Exception: thrown from f()
  at Rethrowing.f(Rethrowing.java:7)
  at Rethrowing.g(Rethrowing.java:11)
  at Rethrowing.main(Rethrowing.java:29)
  originating the exception in f()
  Inside h(),e.printStackTrace()
  java.lang.Exception: thrown from f()
  at Rethrowing.f(Rethrowing.java:7)
  at Rethrowing.h(Rethrowing.java:20)
  at Rethrowing.main(Rethrowing.java:35)
  main: printStackTrace()
  java.lang.Exception: thrown from f()
  at Rethrowing.h(Rethrowing.java:24)
  at Rethrowing.main(Rethrowing.java:35)
  *///:~
