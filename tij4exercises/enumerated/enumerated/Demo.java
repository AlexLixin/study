/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 6, 2019
 *
 ************************************************************************/
package enumerated;

public class Demo {
	public static void main(String[] args) {
/*		long l = -1l;
		System.out.println(1254>>>-1);*/
	    ConstantSpecificMethod[] values = ConstantSpecificMethod.values();
	    for (ConstantSpecificMethod constantSpecificMethod : values) {
	            System.out.println(constantSpecificMethod.getInfo());
        }
	}
}
