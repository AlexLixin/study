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
package generics.exercises;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import static net.mindview.util.Print.*;

class Building1 {}
class House1 extends Building1 {
    private String location;
    private Integer area;
    public House1() { location = null; }
    public House1(Integer area) { this.area = area; }
    public House1(String location) {
        this.location = location;
    }
    public House1(String location, Integer area) {
        this.location = location;
        this.area = area;
    }
    public String toString() {
        return "House" + ((location == null) ? "" :  " in " + location) +
            ((area != null) ? (", "+ area + " sqft") : "");
    }
}

public class Exercise22<T> {
    Class<?> kind;
    public Exercise22(Class<?> kind) {
        this.kind = kind;
    }
    public Object createNew(String typename)
        throws  IllegalAccessException,
            InstantiationException,
            ClassNotFoundException {
        return Class.forName(typename).newInstance();
    }
    /** To create instance of typename with constructors taking arguments args: */
    public Object createNew(String typename, Object... args)
        throws  IllegalAccessException,
            InstantiationException,
            ClassNotFoundException,
            NoSuchMethodException,
            InvocationTargetException {
        switch(args.length) {
        case 1 : return Class.forName(typename).getConstructor(args[0].getClass()).newInstance(args[0]);
        case 2 : return Class.forName(typename).getConstructor(args[0].getClass(), args[1].getClass()).
            newInstance(args[0], args[1]);
        }
        return null;
    }
    public static void main(String[] args) {
        Exercise22<Building1> ctcb = new Exercise22<Building1>(Building1.class);
        Exercise22<House1> ctch = new Exercise22<House1>(House1.class);
        try {
            Building1 b = (Building1)ctcb.createNew("Building1");
            // To show we can access and print House1 constructors:
            print("House1 constructors:");
            Constructor[] ctors = House1.class.getConstructors();
            for(Constructor ctor : ctors) print(ctor);
            // create 3 new House1 objects:
            House1 h = (House1)ctch.createNew("House1", "Hawaii");
            House1 h2 = (House1)ctch.createNew("House1", 3000);
            House1 h3 = (House1)ctch.createNew("House1", "Manila", 5000);
            print("Constructed House1 objects:");
            print(h);
            print(h2);
            print(h3);
        } catch(IllegalAccessException e) {
            print("IllegalAccessException in main");
        } catch(InstantiationException e) {
            print("InstantiationException in main");
        } catch(ClassNotFoundException e) {
            print("ClassNotFoundException in main");
        } catch(NoSuchMethodException e) {
            print("NoSuchMethodException in main");
        } catch(InvocationTargetException e) {
            print("InvocationTargetException in main");
        }
    }
}
