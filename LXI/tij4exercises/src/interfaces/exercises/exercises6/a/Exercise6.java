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
 *    Created on  Dec 11, 2018
 *
 ************************************************************************/
package interfaces.exercises.exercises6.a;

import interfaces.exercises.exercises6.b.Exer6;

class Exer6_ implements Exer6 {

    @Override
    public void a() {
        // TODO Auto-generated method stub

    }

    @Override
    public void b() {
        // TODO Auto-generated method stub

    }

    @Override
    public void c() {
        // TODO Auto-generated method stub

    }
    // Error: cannot assign weaker access to public methods:
    // void sayOne() { System.out.println("one"); } // implies package *                            // access
    // protected void sayTwo() { System.out.println("two"); }
    // private void sayThree() { System.out.println("three"); }
    // must be maintained public:
    /*    @Override
    private void a() {
    }

    @Override
    package void b() {

    }

    @Override
    protect void c() {
    }
    */
}

public class Exercise6 {

}
