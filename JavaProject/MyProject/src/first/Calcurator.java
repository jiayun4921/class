package first;

public class Calcurator {

	public static void main(String[] args) {

		System.out.println(add(20, 10));
		System.out.println(sub(20, 10));
		System.out.println(mul(10, 5));
		System.out.println(div(10f, 3f));

	}

//		① 숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
//		   ->반환타입 정의, 메소드 이름, 매개변수,반환이 있다면 return
	static long add(long num1, long num2) { // long 타입에는 return이 반드시 필요

		// long result =num1 + num2;
		// return result;

		return num1 + num2;

	}

//		② 숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	static long sub(long num1, long num2) {
		return num1 - num2;
	}

//		③ 숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	static long mul(long num1, long num2) {
		return num1 * num2;
	}

//		④ 숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	static float div(float num1, float num2) {
		return num1 / num2;
	}

}
