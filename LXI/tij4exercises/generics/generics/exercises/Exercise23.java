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
 *    Created on  Mar 18, 2019
 *
 ************************************************************************/
package generics.exercises;

interface FactoryI<T> {
    T create(Integer i);
}

class Foo2<T> {
    private T x;

    public void get() {
        System.out.println(x);
    }

    public <F extends FactoryI<T>> Foo2(F factory, Integer i) {
        x = factory.create(i);
    }
}

class IntegerFactory implements FactoryI<Integer> {

    @Override
    public Integer create(Integer i) {
        return new Integer(i);
    }

}

class Widget {
    int i;

    public static class Factory implements FactoryI<Widget> {

        @Override
        public Widget create(Integer i) {
            Widget w = new Widget();
            w.i = i;
            return w;
        }

    }

    public String toString() {
        return "Widget " + i;
    }
}

public class Exercise23 {
    public static void main(String[] args) {
        Foo2 f1 = new Foo2<Integer>(new IntegerFactory(), 1);
        Foo2 f2 = new Foo2<Widget>(new Widget.Factory(), 2);
    }
}
