package tij4.control;

public class Exercise5 {
	static void printBinary(int i) {
		StringBuilder sb = new StringBuilder();
		int j;
		while (i!=0) {
			j=i&1;
			sb.append(j==1?1:0);
			i>>=1;
		}
		System.out.println(sb.reverse());
	}
	public static void main(String[] args) {
		System.out.print("printBinary:");
		printBinary(26000);
		System.out.println("integer.to: "+Integer.toBinaryString(26000));
	}
}
