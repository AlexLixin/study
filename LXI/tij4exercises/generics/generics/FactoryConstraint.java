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
 *    Created on  Feb 20, 2019
 *
 ************************************************************************/
package generics;

interface Factory<T> {
    T c();
}

class Foo<T> {
    private T t;

    public <F extends Factory<T>> Foo(F f) {
        this.t = f.c();
    }

}

class IntegerFactory implements Factory<Integer> {

    @Override
    public Integer c() {
        return new Integer(0);
    }

}

class Wiget {

    public static class FactoryW implements Factory<Wiget> {

        @Override
        public Wiget c() {
            return new Wiget();
        }

    }
}

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo<Integer>(new IntegerFactory());
        new Foo<Wiget>(new Wiget.FactoryW());
    }
}



