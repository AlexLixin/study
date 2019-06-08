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
package exceptions.example;

import static net.mindview.util.Print.*;

public class MultipleReturns {
    public static void f(int i) {
        print("Initialization that requires cleanup");
        try {
            print("Point 1");
            if (i == 1)
                return;
            print("Point 2");
            if (i == 2)
                return;
            print("Point 3");
            if (i == 3)
                return;
            print("End");
            return;
        } finally {
            print("Performing cleanup");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
            f(i);
    }
} /* Output:
  Initialization that requires cleanup
  Point 1
  Performing cleanup
  Initialization that requires cleanup
  Point 1
  Point 2
  Performing cleanup
  Initialization that requires cleanup
  Point 1
  Point 2
  Point 3
  Performing cleanup
  Initialization that requires cleanup
  Point 1
  Point 2
  Point 3
  End
  Performing cleanup
  *///:~