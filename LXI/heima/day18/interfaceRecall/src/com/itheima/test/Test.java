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
 *    Created on  Jan 9, 2019
 *
 ************************************************************************/
package com.itheima.test;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        int i = 43214321;
        System.out.println(System.nanoTime());

        System.out.println(i);

        System.out.println(System.nanoTime());

        System.out.println(Integer.toString(i));

        System.out.println(System.nanoTime());

    }
}
