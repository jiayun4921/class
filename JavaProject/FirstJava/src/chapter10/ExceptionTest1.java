package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수 하나를 입력하세요.");
		
		int num1 =0;
		int num2 =0;
		
		
		
		try {
			num1 = sc.nextInt();
		
			System.out.println("두번째 정수를 입력하세요");
		
		num2 = sc.nextInt();
		
		

		try {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
		} catch (InputMismatchException e) {
			
			// catch 블럭 : 예외 타입에 따라 예외 처리를 해주는 블록
			System.out.println("숫자만 입력하세요!!!.");
		
			
//			System.out.println("프로그램을 종료합니다.");
//			return; // main 메소드 종료 -> 프로그램 종료.
//			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요!!");
		
		}
		System.out.println("프로그램을 종료합니다.");
	
	}

}
}
