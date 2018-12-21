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
 *    Created on  Dec 18, 2018
 *
 ************************************************************************/
package exercises;

interface U {
    void f();

    void g();

    void h();
}

class A {
    public U getU() {
        return new U() {

            @Override
            public void h() {
                // TODO Auto-generated method stub

            }

            @Override
            public void g() {
                // TODO Auto-generated method stub

            }

            @Override
            public void f() {
                // TODO Auto-generated method stub

            }
        };
    }
}

class B {
    private U[] u;
    private int i = 0;

    public B(int length) {
        this.u = new U[length];
    }

    public void setU(U u) {
        this.u[i++] = u;
    }

    public void setNull(int i) {
        u[i] = null;
    }

    public void iterateU() {
        for (U u2 : u) {
            u2.f();
            u2.g();
            u2.h();
        }
    }

}

public class Exercise23 {
    public static void main(String[] args) {
        A[] a = new A[10];
        B b = new B(10);
        for (A a2 : a) {
            a2 = new A();
            b.setU(a2.getU());
        }
        b.iterateU();

        b.setNull(5);

    }
}
