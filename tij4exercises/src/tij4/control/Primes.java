package tij4.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Primes {

	@Test
	void test() {

		for (int i = 1; i < 1000; i++) {
			int factors = 0;
			for (int j = 1; j < (i + 2) / 2; j++) {
				if ((i % j) == 0)
					factors++;
			}
			if (factors < 2)
				System.out.println(i + " is prime");
		}
	}
	
	@Test
	void test1() {
		int flag=1;
		for (int i = 1; i <= 1000; i++) {
			if (i == 1) {
				continue;
			} else if (i == 2) {
				System.out.println(i);
			} else {
				flag =1;
				for (int j = 2; j < (i+1)/2; j++) {
					if(i%j==0)flag=0;
				}
				if(flag==1) {
					System.out.println(i);
				}
			}
		}

	}

}
