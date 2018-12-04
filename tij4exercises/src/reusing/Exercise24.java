package reusing;

import static net.mindview.util.Print.print;

public class Exercise24 extends Beetle {
	private int l = printInit("Exercise24.l initialized");
	  public Exercise24() {
	    print("l = " + l);
	    print("j = " + j);
	  }
	  private static int x3 =
	    printInit("static Exercise24.x3 initialized");
	  public static void main(String[] args) {
	    print("Exercise24 constructor"); 
	    Exercise24 exercise24 = new Exercise24();
	  }
}
