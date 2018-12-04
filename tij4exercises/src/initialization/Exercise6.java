package initialization;
class Dog1{
	void bark(){
		System.out.println("no argv");
	}
	void bark(char c){
		System.out.println("char");
	}
	void bark(byte b){
		System.out.println("byte b");
	}
	void bark(short s){
		System.out.println("short");
	}
	void bark(int i){
		System.out.println("int");
	}
	void bark(float f){
		System.out.println("float");
	}
	void bark(double d){
		System.out.println("double");
	}
	void bark(char c,double d){
		System.out.println("char double");
	}
	void bark(double d,char c){
		System.out.println("double char");
	}
}
public class Exercise6 {
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		char c = 0;
		byte b = 0;
		short s = 0;
		int i = 0;
		float f = 0;
		double d = 0;
		dog.bark();
		dog.bark(c);
		dog.bark(b);
		dog.bark(s);
		dog.bark(i);
		dog.bark(f);
		dog.bark(d);
		dog.bark(c,d);
		dog.bark(d,c);
		
		
		
	}

}
