package chapter08;

public class SmartPhone extends Phone {

	String model;
	
	public SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	
	
	@Override
	void turnOn() {
		System.out.println(model + "모델에 맞게 전원을 켰습니다.");
	
	}

	public static void main(String[] args) {
		
		// Phone phone = new Phone(); <- 작동안함
		
		Phone smartPhone = new SmartPhone("010-3333-777 7", "IOS");
		smartPhone.turnOn();
		
	}
	
}
