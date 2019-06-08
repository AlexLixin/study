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

import static net.mindview.util.Print.*;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception"); //$NON-NLS-1$
        } catch (Exception e) {
            print("Caught Exception"); //$NON-NLS-1$
            print("getMessage():" + e.getMessage()); //$NON-NLS-1$
            print("getLocalizedMessage():" + e.getLocalizedMessage()); //$NON-NLS-1$
            print("toString():" + e); //$NON-NLS-1$
            print("printStackTrace():"); //$NON-NLS-1$
            e.printStackTrace(System.out);
        }
    }
} /* Output:
  Caught Exception
  getMessage():My Exception
  getLocalizedMessage():My Exception
  toString():java.lang.Exception: My Exception
  printStackTrace():
  java.lang.Exception: My Exception
  at ExceptionMethods.main(ExceptionMethods.java:8)
  *///:~