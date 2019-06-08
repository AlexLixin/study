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
package generics.exercises;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.Generator;

class Product {
    private int id;
    private String description;
    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ": " + description + ", price: $" + price; //$NON-NLS-1$//$NON-NLS-2$
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Product> generator = new Generator<Product>() {
        private Random rand = new Random(47);

        @Override
        public Product next() {
            return new Product(rand.nextInt(1000), "Test", Math.round(rand.nextDouble() * 1000.0) + 0.99); //$NON-NLS-1$
        }
    };
}

class Container extends ArrayList<Product> {
    private static final long serialVersionUID = 1L;

    public Container(int nProduct) {
        Generators.fill(this, Product.generator, nProduct);
    }

}

class Room {
    //
}

class Worker {
    //
}

class Cargo extends ArrayList<Container> {

    private static final long serialVersionUID = 1L;

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Worker> workers = new ArrayList<>();

    public Cargo(int nContainer, int nProduct) {
        for (int i = 0; i < nContainer; i++) {
            add(new Container(nProduct));
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Container c : this) {
            for (Product p : c) {
                sb.append(p);
                sb.append("\n"); //$NON-NLS-1$
            }
        }
        return sb.toString();
    }

}

public class Exercise19 {
    public static void main(String[] args) {
        System.out.println(new Cargo(3, 2));
    }
}
