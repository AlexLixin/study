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

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

import generics.watercolors.Watercolors;
import static generics.watercolors.Watercolors.*;
import static net.mindview.util.Print.*;


public class Exercise17 {
    public static <T extends Enum<T>> Set<T> union(Set<T> a, Set<T> b) {
        try {
            if (a instanceof EnumSet) {
                Set<T> result = ((EnumSet<T>)a).clone();
                result.addAll(b);
                return result;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Set<T> result = new HashSet<T>(a);
        result.addAll(b);
        return result;
    }

    public static <T extends Enum<T>> Set<T> intersection(Set<T> a, Set<T> b) {
        try {
            if (a instanceof EnumSet) {
                Set<T> result = ((EnumSet<T>)a).clone();
                result.retainAll(b);
                return result;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Set<T> result = new HashSet<T>(a);
        result.retainAll(b);
        return result;
    }

    // Subtract subset from superset:
    public static <T extends Enum<T>> Set<T> difference(Set<T> superset, Set<T> subset) {
        try {
            if (superset instanceof EnumSet) {
                Set<T> result = ((EnumSet<T>)superset).clone();
                result.removeAll(subset);
                return result;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Set<T> result = new HashSet<T>(superset);
        result.removeAll(subset);
        return result;
    }

    // Reflexive--everything not in the intersection:
    public static <T extends Enum<T>> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }

    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        print("set1: " + set1);
        print("set2: " + set2);
        print("union(set1, set2): " + union(set1, set2));
        Set<Watercolors> subset = intersection(set1, set2);
        print("intersection(set1, set2): " + subset);
        print("difference(set1, set2): " + difference(set1, set2));
        print("difference(set2, subset): " + difference(set2, subset));
        print("complement(set1, set2): " + complement(set1, set2));
    }
}
