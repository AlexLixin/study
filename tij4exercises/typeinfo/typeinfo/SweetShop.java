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
 *    Created on  Jan 4, 2019
 *
 ************************************************************************/
package typeinfo;

//Examination of the way the class loader works.
import static net.mindview.util.Print.*;

class Candy {
    static {
        print("Loading Candy"); //$NON-NLS-1$
    }
}

class Gum {
    static {
        print("Loading Gum"); //$NON-NLS-1$
    }
}

class Cookie {
    static {
        print("Loading Cookie"); //$NON-NLS-1$
    }
}

public class SweetShop {
    public static void main(String[] args) {
        print("inside main"); //$NON-NLS-1$
        new Candy();
        print("After creating Candy"); //$NON-NLS-1$
        try {
            Class.forName("Gum"); //$NON-NLS-1$
        } catch (ClassNotFoundException e) {
            print("Couldn’t find Gum"); //$NON-NLS-1$
        }
        print("After Class.forName(\"Gum\")"); //$NON-NLS-1$
        new Cookie();
        print("After creating Cookie"); //$NON-NLS-1$
    }
} /* Output:
  inside main
  Loading Candy
  After creating Candy
  Loading Gum
  After Class.forName("Gum")
  Loading Cookie
  After creating Cookie
  *///:~