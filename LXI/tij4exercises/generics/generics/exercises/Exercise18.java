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
 *    Created on  Feb 18, 2019
 *
 ************************************************************************/
package generics.exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import net.mindview.util.Generator;

class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    public BigFish() {
    }

    @Override
    public String toString() {
        return "BigFish" + id;
    }

    public static Generator<BigFish> generator() {
        return new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    public LittleFish() {
    }

    @Override
    public String toString() {
        return "LittleFish" + id;
    }

    public static Generator<LittleFish> generator = new Generator<LittleFish>() {
        @Override
        public LittleFish next() {
            return new LittleFish();
        }
    };

}

public class Exercise18 {
    public static void eat(BigFish b, LittleFish l) {
        System.out.println(b + " eat " + l);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<BigFish> qb = new LinkedList<BigFish>();
        Generators.fill(qb, BigFish.generator(), 10);
        List<LittleFish> ql = new LinkedList<LittleFish>();
        Generators.fill(ql, LittleFish.generator, 10);
        for (BigFish bigFish : qb) {
            eat(bigFish, ql.get(rand.nextInt(ql.size())));
        }
    }
}
