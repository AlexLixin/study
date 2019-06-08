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
 * Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is non-
 * parameterized.
 */
public class Exercise10 {

    public static <T,U>void f(T t,U u,String s){
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(s);
    }

    public static void main(String[] args) {
        f('c',432.6f,"fdsafdsafdsafdsa"); //$NON-NLS-1$
    }


}
