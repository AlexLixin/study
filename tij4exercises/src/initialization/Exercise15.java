package initialization;
class Class1{
	String s1;
	{
		s1 = "non-static initialization";
		System.out.println(s1);
	}
	public Class1(String s1) {
		super();
		this.s1 = s1;
	}
	public Class1() {
		System.out.println("Class1");
	}
	
	
}
public class Exercise15 {
	public static void main(String[] args) {
		System.out.println("main");
		Class1 class1 = new Class1();
	}

}
