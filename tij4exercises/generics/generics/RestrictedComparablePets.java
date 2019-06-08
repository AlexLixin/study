/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 26, 2019
 *
 ************************************************************************/
package generics;

//: generics/RestrictedComparablePets.java
class Hamster extends ComparablePet implements Comparable<ComparablePet> {
    public int compareTo(ComparablePet arg) {
        return 0;
    }
}

// Or just:
class Gecko extends ComparablePet {
    public int compareTo(ComparablePet arg) {
        return 0;
    }
} ///:~