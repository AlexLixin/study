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
 *    Created on  Jan 25, 2019
 *
 ************************************************************************/
package generics;

//: generics/GenericVarargs.java
import java.util.*;

public class GenericVarargs {
    public static <T> List<T> makeList(T... t) {
        List<T> list = new ArrayList<>();
        for (T t2 : t) {
            list.add(t2);
        }
        return list;

    }

    public static void main(String[] args) {
        List<String> ls = makeList("A"); //$NON-NLS-1$
        System.out.println(ls);
        ls = makeList("A", "B", "C"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        System.out.println(ls);
        ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split("")); //$NON-NLS-1$ //$NON-NLS-2$
        System.out.println(ls);
    }
} /* Output:
  [A]
  [A, B, C]
  [, A, B, C, D, E, F, F, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W,
  X, Y, Z]
  *///:~