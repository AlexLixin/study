package tij4.control;

import java.util.Random;

public class Exercise3 {
	public static void main(String[] args) {
		Random r = new Random();
		for (;;) {
			int a = r.nextInt(10);
			int b = r.nextInt(10);
			if (a > b) {
				System.out.println("a:" + a + ">" + "b:" + b);
			} else if (a < b) {

				System.out.println("a:" + a + "<" + "b:" + b);
			} else {
				System.out.println("a:" + a + "=" + "b:" + b);

			}
		}
	}

}
