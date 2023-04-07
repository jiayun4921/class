package chapter05;

public class SmartPhoneMain {

	public static void main(String[] args) {
	
		// SmartPhone 클래스의 인스턴스를 만들어서 프로그램을 완성. SmartPhone 클래스에서 정보를 가져옴.
		SmartPhone sp1 = new SmartPhone(); // 새로운 인스턴스를 생성, 새로운 메모리 저장소가 만들어진것.
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		//
		
		SmartPhone sp2 = new SmartPhone();
		sp2.color = "RED"; // 변수값을 따로 입력해줌으로써 새로운 정보를 입력할 수 있음
		sp2.size = 4.0f;
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
		// sp1, sp2 = 참조변수 => 메모리 주소값을 가지는 변수
		
		sp1 = sp2; // => 결국 sp2의 값을 가리키는 것.
		System.out.println();
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp2.color);
		System.out.println(sp2.size);
	}

}
