/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  2019Äê4ÔÂ25ÈÕ
 *
 ************************************************************************/
package containers;

//: containers/StringHashCode.java
public class StringHashCode {
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
} /*
	 * Output: (Sample) 69609650 69609650
	 */// :~