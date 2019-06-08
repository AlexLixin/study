package tij4.control;

public class Exercise9 {
	public static void main(String[] args) {
		F(10);
	}

static void F(int i) {
	if(i==0);
	if(i==1)System.out.println(1);
	if(i==2)System.out.println("1,1");
	else {
		int[]a=new int[i];
		a[0]=1;
		a[1]=1;
		for (int j = 2; j < i; j++) {
			a[j]=a[j-1]+a[j-2];
		}
		int flag=0;
		for (int j : a) {
			if(flag==0) {System.out.print(j);flag=1;}
			System.out.print(","+j);
		}
	}
	
	
}
}
