package tij4.control;

import java.util.Random;

public class Exercise8 {
	public static void main(String[] args) {
		Random r = new Random();
		int i;
		for (;;) {
			i = r.nextInt(10);
			System.out.println("i:" + i);
			switch (i) {
			case 1:
				System.out.println("1");
			case 2:
				System.out.println("2");
			case 3:
				System.out.println("3");
			case 4:
				System.out.println("4");
			case 5:
				System.out.println("5");
			default:
				System.out.println("default");
				break;
			}
		}
	}
}
