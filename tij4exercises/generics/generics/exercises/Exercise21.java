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

class Building {

    @Override
    public String toString() {
        return "Building"; //$NON-NLS-1$
    }

}

class House extends Building {
    @Override
    public String toString() {
        return "House"; //$NON-NLS-1$
    }
}

class ClassTypeCapture<T> {

    private Map<String, Class<?>> map = new HashMap<String, Class<?>>();

    Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public void addType(String typename, Class<?> kink) {
        map.put(typename, kink);
    }

    public Object createNew(String typename) {
        try {
            return map.get(typename).newInstance();
        } catch (Exception e) {
            System.out.println("Error!"); //$NON-NLS-1$
        }
        return null;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

}

public class Exercise21 {
    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        ctt1.addType("Building", Building.class); //$NON-NLS-1$
        ctt1.addType("House", House.class); //$NON-NLS-1$
        Building building = (Building)ctt1.createNew("Building"); //$NON-NLS-1$
        House house = (House)ctt1.createNew("House"); //$NON-NLS-1$

        System.out.println(building);
        System.out.println(house);

    }
}
