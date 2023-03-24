package cal;

import java.util.Scanner;

public class Calcurator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요. >>");
		long num1 = in.nextLong();

		System.out.println("두 번째 숫자를 입력하세요. >>");
		long num2 = in.nextLong();

		System.out.println("연산의 결과 =========");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		
		System.out.println();
		
		System.out.println("반지름의 길이를 입력하세요. >>");
		double r = in.nextDouble();		
	
	
		System.out.println("원의 둘레 : " + cal1(r));
		System.out.println("원의 넓이 : " + cal2(r));
		
		
	}

	// 변경
//	① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
	static void add(long num1, long num2) { // long 타입에는 return이 반드시 필요
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

	}

//	② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
	// 변경
	static void sub(long num1, long num2) {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
	}

//변경
//	③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의

	static void mul(long num1, long num2) {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
	}

//	변경
//	④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
	static void div(float num1, float num2) {
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
	}

//	⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
//	원의 둘레 : 2 x π x r , 원의 넓이 : π x r x r

	// 원의 둘레
	static double cal1(double r) {
		return 2 * Math.PI * r;
	}

	// 원의 넓이
	static double cal2(double r) {
		return Math.PI * r * r;
	}

}
