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
 *    Created on  Jan 3, 2019
 *
 ************************************************************************/
package example;

import java.io.*;

public class SimpleRead {
    public static BufferedReader input = new BufferedReader(new StringReader("Sir Robin of Camelot\n22 1.61803")); //$NON-NLS-1$

    public static void main(String[] args) {
        try {
            System.out.println("What is your name?"); //$NON-NLS-1$
            String name = input.readLine();
            System.out.println(name);
            System.out.println("How old are you? What is your favorite double?"); //$NON-NLS-1$
            System.out.println("(input: <age> <double>)"); //$NON-NLS-1$
            String numbers = input.readLine();
            System.out.println(numbers);
            String[] numArray = numbers.split(" "); //$NON-NLS-1$
            int age = Integer.parseInt(numArray[0]);
            double favorite = Double.parseDouble(numArray[1]);
            System.out.format("Hi %s.\n", name); //$NON-NLS-1$
            System.out.format("In 5 years you will be %d.\n", age + 5); //$NON-NLS-1$
            System.out.format("My favorite double is %f.", favorite / 2); //$NON-NLS-1$
        } catch (IOException e) {
            System.err.println("I/O exception"); //$NON-NLS-1$
        }
    }
} /* Output:
  What is your name?
  Sir Robin of Camelot
  How old are you? What is your favorite double?
  (input: <age> <double>)
  22 1.61803
  Hi Sir Robin of Camelot.
  In 5 years you will be 27.
  My favorite double is 0.809015.
  *///:~