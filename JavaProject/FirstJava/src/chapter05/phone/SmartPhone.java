package chapter05.phone;

public class SmartPhone {

	// 인스턴스 변수
	String color;
	float size;
	int volume;
	
	// 생성자 : 초기화 메소드, 인스턴스 변수의 초기화 작업을 한다.
	// 아무 초기화 작업이 없는 경우, 생략 가능.
	// 아래와 같은 생성자를 기본 생성자라고 한다
//	SmartPhone() {
//		System.out.println("인스턴스 생성");
//		}
	
	// 초기화를 위한 생성자 정의
	SmartPhone(String color, float size, int volume) {
		this.color = color;
		this.size = size;
		this.volume = volume;
		
		this(color, size, 0); // this() => 다른 생성자 호출
		
		SmartPhone() {
			this("white", 4.5f, 5);
		}
	
		
	}
	
	SmartPhone() {
		color = "White";
		size = 4.5f;
		volume = 5;
		
	}
	
	
	SmartPhone(String color, float size) {
		this.color = color;
		this.size = size;
		this.volume = volume;
		
	}
	
	
	
	void call() {
		System.out.println("전화 걸기");
	}
	void voulmeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
		
	}
	
	
	
}
