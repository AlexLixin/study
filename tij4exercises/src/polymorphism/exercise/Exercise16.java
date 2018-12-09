package polymorphism.exercise;

class AlertStatus {

}

class AlertStatus1 extends AlertStatus {

	@Override
	public String toString() {
		return "AlertStatus1";
	}

}

class AlertStatus2 extends AlertStatus {
	@Override
	public String toString() {
		return "AlertStatus2";
	}

}

class AlertStatus3 extends AlertStatus {
	@Override
	public String toString() {
		return "AlertStatus3";
	}

}

class StarShip {
	AlertStatus a = new AlertStatus1();
	void chageStatue(int i){
		switch (i) {
		case 1:
			a= new AlertStatus1();
			break;
		case 2:
			a = new AlertStatus2();
			break;
		case 3:
			a = new AlertStatus3();
			break;
		default:
			break;
		}
	}
	void checkStatus() {
		System.out.println(a);
	}
}

public class Exercise16 {
	public static void main(String[] args) {
		StarShip starShip = new StarShip();
		starShip.checkStatus();
		starShip.chageStatue(3);
		starShip.checkStatus();
	}
}
