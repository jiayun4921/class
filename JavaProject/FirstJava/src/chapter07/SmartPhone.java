package chapter07;

public class SmartPhone extends Phone {

	// 자식클래스 : 좁은의미, 기능의 확장, 세분화

	String model;

	public SmartPhone() {
		super();

	}

	void game() {
		System.out.println(model + " 게임을 합니다.");
	}

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();

		sp.phoneNumber = "010-2222-3333";
		sp.call();

		sp.model = "google";
		sp.game();

	}

}
