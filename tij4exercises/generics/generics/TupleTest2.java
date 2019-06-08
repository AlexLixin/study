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
 *    Created on  Jan 30, 2019
 *
 ************************************************************************/
package generics;

import net.mindview.util.*;
import static net.mindview.util.Tuple.*;

public class TupleTest2 {
    static TwoTuple <String,Integer>f() {
        return tuple("hi",47);
    }

    static TwoTuple f2() {
        return tuple("hi",47); //$NON-NLS-1$
    }

    static ThreeTuple<Amphibian,String,Integer> g(){
        return tuple(new Amphibian(),"hi",47); //$NON-NLS-1$
    }
    static FourTuple<Vehicle,Amphibian,String,Integer> h(){
        return tuple(new Vehicle(),new Amphibian(),"hi",47); //$NON-NLS-1$
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k(){
        return tuple(new Vehicle(),new Amphibian(),"hi",47,11.1); //$NON-NLS-1$
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
} /* Output: (80% match)
  (hi, 47)
  (hi, 47)
  (Amphibian@7d772e, hi, 47)
  (Vehicle@757aef, Amphibian@d9f9c3, hi, 47)
  (Vehicle@1a46e30, Amphibian@3e25a5, hi, 47, 11.1)
  *///:~