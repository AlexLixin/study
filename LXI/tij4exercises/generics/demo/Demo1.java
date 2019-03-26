/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 26, 2019
 *
 ************************************************************************/
package demo;

public class Demo1<T extends Demo1<T>> implements Comparable<T> {

    @Override
    public int compareTo(T o) {
        // TODO Auto-generated method stub
        return 0;
    }

}

class subtype1 extends Demo1<subtype1> {

}