package tij4.control;

public class Exercise10 {
	public static void main(String[] args) {
		int[] a = new int[4];
		boolean flag=false;
		for (int i = 1000; i < 10000; i++) {
			a[0] = i / 1000;
			a[1] = (i / 100) % 10;
			a[2] = (i / 10) % 10;
			a[3] = i % 10;
			if (a[2] == 0 && a[3] == 0)
				continue;
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if(k==j)continue;
					for (int l = 0; l < 4; l++) {
						if(l==k||l==j)continue;
						for (int m = 0; m < 4; m++) {
							if(m==j||m==k||m==l)continue;
							if((a[j]*10+a[k])*(a[l]*10+a[m])==i) {
								System.out.println(""+a[j]+a[k]+"*"+a[l]+a[m]+"="+i);
							}
						}
					}
				}
			}
			if(flag)System.out.println(i);
		}
	}
}
