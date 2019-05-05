/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 6, 2019
 *
 ************************************************************************/
package containers.exercises;
//containers/Ex31.java

//TIJ4 Chapter Containers, Exercise 31, page 870
/* Create a container that encapsulates an array of String, and only
* allows adding Strings and getting Strings, so that there are no 
* casting issues during use. If the internal array isn't big enough
* for the next add, your container should automatically resize it. 
* In main(), compare the performance of your container with an 
* ArrayList<String>.
*/

/* My solution to one of the exercises in 
* Thinking in Java 4th Edition (by Bruce Eckel).
* Compiles and runs correctly using JDK 1.6.0
* @author Greg Gordon
* @author www.greggordon.org
* December, 2007
*/

import java.util.*;
import static net.mindview.util.Print.*;

class StringsHolder {
	private int size = 0;
	private String[] sArray = new String[size];

	// Can add only Strings:
	// (Resizing and copying will degrade performance)
	public void add(String s) {
		size += 1;
		String[] temp = new String[size];
		for (int i = 0; i < sArray.length; i++)
			temp[i] = sArray[i];
		temp[size - 1] = s;
		sArray = temp;
	}

	// get() returns only Strings:
	public String get(int i) {
		if (-1 < i && i < size)
			return sArray[i];
		else
			throw new ArrayIndexOutOfBoundsException(i);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sArray.length; i++)
			sb.append((sArray[i] + " "));
		return sb.toString();
	}
}

//Alternate to eliminate resizing time for fixed size StringsHolder2:
class StringsHolder2 {
	private int size = 1000;
	private int index = 0;
	private String[] sArray = new String[size];

	// Can add only Strings:
	public void add(String s) {
		if (index < size)
			sArray[index++] = s;
	}

	// get() returns only Strings:
	public String get(int i) {
		if (-1 < i && i < size)
			return sArray[i];
		else
			throw new ArrayIndexOutOfBoundsException(i);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sArray.length; i++)
			sb.append((sArray[i] + " "));
		return sb.toString();
	}
}

public class Exercise31 {
	static long addTimeTest(StringsHolder sh, int reps) {
		long start = System.nanoTime();
		for (int i = 0; i < reps; i++)
			sh.add("hi");
		long stop = System.nanoTime();
		return (stop - start) / reps;
	}

	static long addTimeTest(ArrayList<String> list, int reps) {
		long start = System.nanoTime();
		for (int i = 0; i < reps; i++)
			list.add("hi");
		long stop = System.nanoTime();
		return (stop - start) / reps;
	}

	static long getTimeTest(StringsHolder sh, int reps) {
		long start = System.nanoTime();
		for (int i = 0; i < reps; i++)
			sh.get(i);
		long stop = System.nanoTime();
		return (stop - start) / reps;
	}

	static long getTimeTest(ArrayList<String> list, int reps) {
		long start = System.nanoTime();
		for (int i = 0; i < reps; i++)
			list.get(i);
		long stop = System.nanoTime();
		return (stop - start) / reps;
	}

	static long addTimeTest(StringsHolder2 sh, int reps) {
		long start = System.nanoTime();
		for (int i = 0; i < reps; i++)
			sh.add("hi");
		long stop = System.nanoTime();
		return (stop - start) / reps;
	}

	static long getTimeTest(StringsHolder2 sh, int reps) {
		long start = System.nanoTime();
		for (int i = 0; i < reps; i++)
			sh.get(i);
		long stop = System.nanoTime();
		return (stop - start) / reps;
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		StringsHolder sh = new StringsHolder();
		print("Add times (nanoseconds):");
		print("Mean of 1000:");
		print("ArrayList add(): " + addTimeTest(list, 1000));
		print("StringsHolder add(): " + addTimeTest(sh, 1000));
		print("Mean of 10000:");
		print("ArrayList add(): " + addTimeTest(list, 10000));
		print("StringsHolder add(): " + addTimeTest(sh, 10000));
		print();
		print("Get times (nanoseconds):");
		print("Mean of 10000:");
		print("ArrayList get(): " + getTimeTest(list, 10000));
		print("StringsHolder get(): " + getTimeTest(sh, 10000));
		print();
		print("Using alternate fixed size (1000) StringsHolder2");
		print("eliminates resizing and copying:");
		ArrayList<String> list2 = new ArrayList<String>();
		StringsHolder2 sh2 = new StringsHolder2();
		print("Add times (nanoseconds):");
		print("Mean of 1000:");
		print("ArrayList add(): " + addTimeTest(list2, 1000));
		print("StringsHolder2 add(): " + addTimeTest(sh2, 1000));
		print();
		print("Get times (nanoseconds):");
		print("Mean of 1000:");
		print("ArrayList get(): " + getTimeTest(list2, 1000));
		print("StringsHolder2 get(): " + getTimeTest(sh2, 1000));
	}
}