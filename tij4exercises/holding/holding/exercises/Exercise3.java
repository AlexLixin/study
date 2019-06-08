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
 *    Created on  Dec 21, 2018
 *
 ************************************************************************/
package holding.exercises;

import java.util.ArrayList;
import java.util.List;

import innerclasses.exercises.Exercise2;

interface Selector {

    boolean end();

    Object current();

    void next();
}

class Sequence {
    private List<Object> items = new ArrayList<>();
    private int next = 0;

    public void add(Object x) {
            items.add(next++, x);
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.size() - 1;
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {
            if (i < items.size())
                i++;
        }

        public Sequence getOuter() {
            return Sequence.this;
        }
    }

    public Selector reverseSelector() {
        return new Selector() {
            private int i = items.size() - 1;

            @Override
            public void next() {
                if (i > 0) {
                    i--;
                }
            }

            @Override
            public boolean end() {
                return i == 0;
            }

            @Override
            public Object current() {
                return items.get(i);
            }
        };
    }

    public Selector selector() {
        return new SequenceSelector();
    }

}

public class Exercise3 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        sequence.add(new Exercise2().getExer2());
        sequence.add(new Exercise2().getExer2());
        sequence.add(new Exercise2().getExer2());
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
}