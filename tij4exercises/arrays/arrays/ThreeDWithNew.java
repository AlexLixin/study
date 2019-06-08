/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  2019��3��28��
 *
 ************************************************************************/
package arrays;

//: arrays/ThreeDWithNew.java
import java.util.*;

public class ThreeDWithNew {
	public static void main(String[] args) {
		//3-D array with fixed length:
		int[][][] a = new int[2][2][4];
		System.out.println(Arrays.deepToString(a));
	}
} /*
	 * Output: [[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
	 */// :~