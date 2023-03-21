package test;

/*주석을 달 때,
 * 어떤 파일
 * 어떤 목적
 * 누가 작성
 * 언제 수정
*/

public class FirstJava {
	
	// 주석은 컴파일 시에 코드로 인식하지 않는다
	// 변수들 정의
	// 함수들 (메소드) 정의
	
	// ↓메인 메소드 -> 클래스 실행시 시작 시점, 이 시점으로 위에서 아래으로 실행됨
	public static void main(String[] args) {
		
		
		
	
		//System.out.println("First JAVA1");
		/* System.out.println("First JAVA2"); */
//		System.out.println("First JAVA3");
//		System.out.println("First JAVA4");
		
		
		//변수 : 메모리 공간 할당, 메모리 주소의 역할(주소의 역할이라는건 찾아갈 수 있도록 해준다는 것)
		//선언방법
		//자료형타입 변수이름 ;
		
		//나이를 저장하는 변수를 선언해보자 -> 이게 목적
		//int-정수값을 선언하는 것
		int age; //변수선언 : 나이 값을 저장할 수 있는 변수 선언
		age = 20; // 변수의 최초값. 변수의 초기화 : 변수 선언 후 값을 처음 대입하는 것!
		
		// 원주율 : pi - 3.141592... <- 소수점이 있는 실수
//		double-실수를 표현하는 것
		double pi ;
		pi = 3.141592;
		
		System.out.println(age);
		System.out.println(pi);
		
		
		
		int resultValue = add(10,20);
		System.out.println(resultValue);
		
		
		hello();
		
		
		hello2("손흥민");
		
		
	
	
	}
	
	// 정수 두개를 받아 -> 매개변수 선언
	// 더하기 연산한 -> 내부 처리
	// 결과를 반환하는 메소드 -> return 결과값;
	
	static int add(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		
		// 결과값 반환
		return result;
	}
	// ↑ 이게 구조 및 절차
	
	
	
	
	// 기능 : 인사말을 출력하는 기능을 가지는 메소드
	// 매개변수 : 데이터 받는 정의 -> 데이터 필요없다!
	// (데이터를 받아서 처리해야하는가 말아야하는가.를 판단해야함)
	// 결과 반환: 반환이 없다
	// 반환타입 메소드이름 (매개변수){} <- 이게 메소드 구조
	// void :  반환 값이 없을 때 사용 -> return이 없다
	static void hello() {
		System.out.println("안녕하세요!");
		System.out.println("반갑습니다.");
	}
	
	
	
	
	// 이름을 전달받아 이름과 인사말을 출력하는 메소드
	// 매개변수 : 이름 ( 문자열 )
	// 반환 : 없다!
	static void hello2(String name) {
		
		System.out.println(name);
		System.out.println("안녕하세요");
		
	}
	
	
	
	
	
	
	
	
	

}
