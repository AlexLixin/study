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
 *    Created on  Jan 21, 2019
 *
 ************************************************************************/
package generics.exercises;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class Exercise8 {
    public static void main(String[] args) {
        StoryCharactersGenerator storyCharactersGenerator = new StoryCharactersGenerator();
        for (int i = 0; i < 10  ; i++) {
            System.out.print(storyCharactersGenerator.next()+" ");
        }
        System.out.println();
        for (StoryCharacters s : new StoryCharactersGenerator(10)) {
            System.out.print(s+" ");
        }
    }

}

class StoryCharacters {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id; //$NON-NLS-1$
    }
}

class GoodGuys extends StoryCharacters {

}

class BadGuys extends StoryCharacters {

}

class TimRobbins extends GoodGuys {

}

class MorganFreeman extends GoodGuys {

}

class WilliamSadler extends GoodGuys {

}

class BobGunton extends BadGuys {

}

class ClancyBrown extends BadGuys {

}

class StoryCharactersGenerator implements Generator<StoryCharacters> ,Iterable<StoryCharacters>{

    private static final Class[] types = {TimRobbins.class, MorganFreeman.class, WilliamSadler.class, BobGunton.class, ClancyBrown.class};
    private Random r = new Random();
    private int size = 0;


    public StoryCharactersGenerator(int size) {
        this.size = size;
    }
    public StoryCharactersGenerator() {
    }
    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters)types[r.nextInt(5)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    class StoryCharacterIterator implements Iterator<StoryCharacters> {
        int count = size;
        public boolean hasNext() { return count > 0; }
        public StoryCharacters next() {
            count--;
            return StoryCharactersGenerator.this.next();
        }
        public void remove() { // Not implemented
            throw new UnsupportedOperationException();
        }
    }

    public Iterator<StoryCharacters> iterator() {
        return new StoryCharacterIterator();
    }

}