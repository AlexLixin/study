package tij4.control;

import java.util.Random;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Random r = new Random(47);
		int j;
		for (int i = 0; i < 26; i++) {
			j = 'a' + r.nextInt(26);
			switch (j) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(j+" "+(char) j + " is vowel");
				break;
			case 'y':
			case 'w':
				System.out.println(j+" "+(char) j + " sometimes is vowel");
				break;

			default:
				System.out.println(j+" "+(char) j + " is consonant");
				break;
			}
		}
	}
}
