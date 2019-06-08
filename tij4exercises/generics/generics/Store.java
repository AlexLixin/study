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
 *    Created on  Feb 19, 2019
 *
 ************************************************************************/
package generics;

import java.util.ArrayList;
import java.util.Random;

import javax.jws.soap.SOAPBinding;

import net.mindview.util.Generator;

class Product {
    private final int id;
    private String description;
    private double price;

    public Product(int IDnumber, String descr, double price) {
        id = IDnumber;
        description = descr;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price; //$NON-NLS-1$ //$NON-NLS-2$
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        private Random rand = new Random(47);

        @Override
        public Product next() {
            return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000.0) + 0.99);
        }
    };

}

class Shelf extends ArrayList<Product> {

    private static final long serialVersionUID = 1L;

    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }

}

class Aisle extends ArrayList<Shelf> {

    private static final long serialVersionUID = 1L;

    public Aisle(int nShelves, int nProducts) {
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProducts));
        }
    }
}

class CheckoutStand {
}

class Office {
}

public class Store extends ArrayList<Aisle> {

    private static final long serialVersionUID = 1L;

    private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
    private Office office = new Office();

    public Store(int nAiles, int nShelves, int nProducts) {
        for (int i = 0; i < nAiles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Aisle a : this) {
            for (Shelf s : a) {
                for (Product p : s) {
                    sb.append(p);
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(14, 5, 10));
    }
}
