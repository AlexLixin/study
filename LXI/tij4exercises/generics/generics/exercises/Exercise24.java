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

import java.util.HashMap;
import java.util.Map;


interface Factory<T> {
    T create();
}


class BuildingFactory implements Factory<Building> {
    public Building create() {
        return new Building();
    }
}

class HouseFactory implements Factory<House> {
    public House create() {
        return new House();
    }
}

class ClassTypeCapture24<T> {

    Class<?> kind;

    public ClassTypeCapture24(Class<?> kind) {
        this.kind = kind;
    }

    Map<String, Factory> map;

    public ClassTypeCapture24(Class<?> kind, Map<String, Factory> map) {
        this.kind = kind;
        this.map = map;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public void addType(String typename, Factory factory) {
        map.put(typename, factory);
    }

    public Object createNew(String typename) throws IllegalAccessException, InstantiationException {
        if (map.containsKey(typename))
            return map.get(typename).create();
        System.out.println(typename + " class not available");
        return null;
    }

}

public class Exercise24 {
    public static void main(String[] args) {
        ClassTypeCapture24<Building> ctt1 = new ClassTypeCapture24<Building>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture24<House> ctt2 = new ClassTypeCapture24<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
        ClassTypeCapture24<Building> ct = new ClassTypeCapture24<Building>(Building.class, new HashMap<String, Factory>());
        ct.addType("House", new HouseFactory());
        ct.addType("Building", new BuildingFactory());
        System.out.println("ct.map = " + ct.map);
        try {
            Building b = (Building)ct.createNew("Building");
            House h = (House)ct.createNew("House");
            System.out.print("b.getClass().getName(): ");
            System.out.println(b.getClass().getName());
            System.out.print("h.getClass().getName(): ");
            System.out.println(h.getClass().getName());
            System.out.print("House h is instance House: ");
            System.out.println(h instanceof House);
            System.out.print("House h is instance of Building: ");
            System.out.println(h instanceof Building);
            System.out.print("Building b is instance of House: ");
            System.out.println(b instanceof House);
            ct.createNew("String"); // String class not available
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException in main");
        } catch (InstantiationException e) {
            System.out.println("InstantiationException in main");
        }
    }
}
