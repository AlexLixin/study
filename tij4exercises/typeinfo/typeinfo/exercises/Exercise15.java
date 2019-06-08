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
 *    Created on  Jan 8, 2019
 *
 ************************************************************************/
package typeinfo.exercises;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.mindview.util.TypeCounter;
import typeinfo.pets.Cat;
import typeinfo.pets.Cymric;
import typeinfo.pets.Dog;
import typeinfo.pets.EgyptianMau;
import typeinfo.pets.Gerbil;
import typeinfo.pets.Hamster;
import typeinfo.pets.Manx;
import typeinfo.pets.Mouse;
import typeinfo.pets.Mutt;
import typeinfo.pets.Pet;
import typeinfo.pets.PetCreator;
import typeinfo.pets.Pets;
import typeinfo.pets.Pug;
import typeinfo.pets.Rat;
import typeinfo.pets.Rodent;

public class Exercise15 extends PetCreator {
    static List<Class<? extends Pet>> petFactories = new ArrayList<Class<? extends Pet>>();
    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        Collections.addAll(petFactories, Pet.class, Dog.class, Cat.class, Rodent.class, Mutt.class, Pug.class, EgyptianMau.class, Manx.class, Cymric.class, Rat.class, Mouse.class, Hamster.class, Gerbil.class);
    }
    private static Random rand = new Random(47);

    public static Pet createRandom() {
        int n = rand.nextInt(petFactories.size());
        try {
            return petFactories.get(n).newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return null;
    }

    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Pet.class);
        for (Pet pet : Pets.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            counter.count(pet);
        }
        print();
        print(counter);
    }
}
