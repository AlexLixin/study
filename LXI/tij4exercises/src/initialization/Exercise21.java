package initialization;

enum Currency {
	ONE, FIVE, TEN, HUNDRED
}

public class Exercise21 {
	public static void main(String[] args) {
		Currency[] c = Currency.values();
		for (Currency currency : c) {
			System.out.println(currency + " "+currency.ordinal());
		}

	}
}
