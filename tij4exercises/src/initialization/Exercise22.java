package initialization;

public class Exercise22 {
	public static void main(String[] args) {
		for (Currency currency : Currency.values()) {
			switch (currency) {
			case ONE:
				System.out.println("1 yuan");
				break;
			case FIVE:
				System.out.println("5 yuan");
				break;
			case TEN:
				System.out.println("10 yuan");
				break;
			case HUNDRED:
				System.out.println("100 yuan");
				break;
			default:
				break;
			}
			
		}
	}
}
