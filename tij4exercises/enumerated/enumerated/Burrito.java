/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 29, 2019
 *
 ************************************************************************/
package enumerated;

//: enumerated/Burrito.java

import static enumerated.Spiciness.*;

public class Burrito {
    Spiciness degree;

    public Burrito(Spiciness degree) {
        this.degree = degree;
    }

    public String toString() {
        return "Burrito is " + degree;
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }
} /* Output:
  Burrito is NOT
  Burrito is MEDIUM
  Burrito is HOT
  *///:~