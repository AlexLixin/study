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
 *    Created on  Jan 22, 2019
 *
 ************************************************************************/
package generics.exercises;

/*
 * Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
 * of which are of a different parameterized type.
 */

public class Exercise9 {
    public static void main(String[] args) {
        GenericMethods_Exer9.f("fdsafdsa", 456, 'c');
    }
}

class GenericMethods_Exer9 {
      static public <T,U,V> void f(T t,U u,V v) {
          System.out.println(t.getClass().getName());
          System.out.println(u.getClass().getName());
          System.out.println(v.getClass().getName());
      }
}