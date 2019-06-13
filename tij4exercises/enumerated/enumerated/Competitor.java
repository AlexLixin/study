/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 13, 2019
 *
 ************************************************************************/
package enumerated;

//: enumerated/Competitor.java
//Switching one enum on another.
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
} ///:~