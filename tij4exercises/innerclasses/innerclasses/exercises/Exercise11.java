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
 *    Created on  Dec 14, 2018
 *
 ************************************************************************/
package innerclasses.exercises;

interface Exer11_1{
    void f();
}

class Exer11_2{
    private class Exer11_3 implements Exer11_1{

        @Override
        public void f() {
            System.out.println("f()");
        }

        public void g() {
            System.out.println("g()");
        }

    }
    Exer11_1 getExer11_3(){
        return new Exer11_3();
    }
}
public class Exercise11 {
    public static void main(String[] args) {
        Exer11_2 exer11_2 = new Exer11_2();
        Exer11_1 exer11_1 = exer11_2.getExer11_3();
        exer11_1.f();
        //(Exer11_3)exer11_1.g();

    }

}
