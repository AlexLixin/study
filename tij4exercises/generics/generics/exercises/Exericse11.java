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
 *    Created on  Jan 22, 2019
 *
 ************************************************************************/
package generics.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import net.mindview.util.New;
import static net.mindview.util.Print.*;

/* Exercise 11: (1) Test New.java by creating your own classes and ensuring that New will
 * work properly with them.
 */

class A { public String toString() { return "A"; } }

class B { public String toString() { return "B"; } }

class C extends B {
    public String toString() { return "C"; }
}

public class Exericse11 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        List<C> lc = New.list();
        lc.add(new C());
        Map<A,List<? extends B>> mab = New.map();
        mab.put(a,lc);
        mab.put(new A(), new ArrayList<>());
        LinkedList<B> llb = New.lList();
        llb.add(new B());
        Set<A> sa = New.set();
        sa.add(new A());
        Queue<B> qb = New.queue();
        qb.add(new B());
        print(lc);
        print(mab);
        print(llb);
        print(sa);
        print(qb);

    }
}
