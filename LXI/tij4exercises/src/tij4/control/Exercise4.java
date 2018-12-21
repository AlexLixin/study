package tij4.control;

public class Exercise4 {
	public static void main(String[] args) {
		int flag=1;
		for (int i = 1; i <= 100; i++) {
			if (i == 1) {
				continue;
			} else if (i == 2) {
				System.out.println(i);
			} else {
				flag =1;
				for (int j = 2; j < i; j++) {
					if(i%j==0)flag=0;
				}
				if(flag==1) {
					System.out.println(i);
				}
			}
		}

	}
}
