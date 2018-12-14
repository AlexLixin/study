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
 *    Created on  Dec 13, 2018
 *
 ************************************************************************/
package interfaces.exercises;

interface Cycle {
    void f();

    void g();
}

interface Factory {
    Cycle getCycle();

}

class Unicycle implements Cycle {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

}

class UnicycleFactory implements Factory {

    @Override
    public Cycle getCycle() {
        // TODO Auto-generated method stub
        return new Unicycle();
    }

}

class Bicycle implements Cycle {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

}

class BicycleFactory implements Factory {

    @Override
    public Cycle getCycle() {
        // TODO Auto-generated method stub
        return new Bicycle();
    }

}

class Tricycle implements Cycle {

    @Override
    public void f() {

    }

    @Override
    public void g() {

    }

}

class TricycleFactory implements Factory {

    @Override
    public Cycle getCycle() {
        // TODO Auto-generated method stub
        return new Tricycle();
    }

}

public class Exercise18 {
    public static void main(String[] args) {
        Cycle cycle = new BicycleFactory().getCycle();
        cycle.f();
        cycle.g();
        cycle = new BicycleFactory().getCycle();
        cycle.f();
        cycle.g();
        cycle = new TricycleFactory().getCycle();
        cycle.f();
        cycle.g();
    }
}
