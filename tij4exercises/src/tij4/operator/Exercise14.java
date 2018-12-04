package tij4.operator;

public class Exercise14 {
public static void compare(String a,String b) {
	//System.out.println(a>b);
	System.out.println(a==b);
	System.out.println(a!=b);
	System.out.println(a.equals(b));
}
public static void main(String[] args) {
	compare(new String("fda"),"fda");
}
}
