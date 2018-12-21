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
 *    Created on  Dec 17, 2018
 *
 ************************************************************************/
package exercises;

interface Cycle {
    void f();

    void g();
}

interface Factory {
    Cycle getCycle();

}

class Unicycle implements Cycle {
    public static Factory factory = new Factory() {

        @Override
        public Cycle getCycle() {
            System.out.println("Generate Unicycle object!");
            return new Unicycle();
        }
    };

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

}

class Bicycle implements Cycle {
    public static Factory factory = new Factory() {

        @Override
        public Cycle getCycle() {
            System.out.println("Generate Bicycle object!");
            return new Bicycle();
        }
    };

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

}

class Tricycle implements Cycle {
    public static Factory factory = new Factory() {

        @Override
        public Cycle getCycle() {
            System.out.println("Generate Tricycle object!");
            return new Tricycle();
        }
    };

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

}

public class Exercise16 {

    public static Cycle getCycle(Factory f) {
        return f.getCycle();
    }

    public static void main(String[] args) {
        Cycle cycle = getCycle(Unicycle.factory);
        cycle.f();
        cycle.g();
        cycle = getCycle(Bicycle.factory);
        cycle.f();
        cycle.g();
        cycle = getCycle(Tricycle.factory);
        cycle.f();
        cycle.g();
    }
}
