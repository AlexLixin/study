package initialization;

public class Exercise1 {
	static class NullDemo{
		String a;
	}

	public static void main(String[] args) {
		NullDemo nd = new NullDemo();
		if(null==nd.a)System.out.println(nd.a);
	}
}
