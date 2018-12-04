package tij4.control;

public class Exercise6 {
public static void main(String[] args) {
	System.out.println(test(3,2,5));
}
static String test(int i,int j,int k) {
	if(i>=j&&i<=k)return "Between and including"+j+"and"+"k";
	else return "not";
}
}
