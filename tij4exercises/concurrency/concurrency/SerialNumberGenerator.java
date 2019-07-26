/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jul 26, 2019
 *
 ************************************************************************/
package concurrency;

//: concurrency/SerialNumberGenerator.java
public class SerialNumberGenerator {
	private static volatile int serialNumber = 0;

	public static int nextSerialNumber() {
		return serialNumber++; // Not thread-safe
	}
} /// :~
