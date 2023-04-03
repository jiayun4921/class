package ifSelf;

import java.util.Scanner;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		
//		각 나라와 수도를 매칭하는 문제를 풀고 있다. 나라이름과 수도는 각각 "대한민국"과 "서울"이다
//
//		예) 나라 이름 : 대한민국
//		수도 : 서울
//		올바르게 적었습니다.
//
//		나라 이름 : 대한민국
//		수도 : 도쿄
//		수도를 틀렸습니다.
//
//		나라 이름 : 프랑스
//		수도 : 파리
//		등록하지 않은 나라이름과 수도입니다. 다시 확인하세요
//		
		
		System.out.println("대한민국의 수도를 매칭해주세요");
		
		Scanner scan = new Scanner(System.in);
		int country = scan.nextInt();
		
		switch (country) { 
		
		case 1 : 
			
			System.out.println("서울");
			System.out.println("올바르게 적었습니다");
			break;
		
		
		case 2 :
			System.out.println("도쿄");
			System.out.println("수도를 틀렸습니다.");
			break;
		
		case 3 : 
			System.out.println("파리");
			System.out.println("등록하지 않은 나라이름과 수도입니다. 다시 확인하세요.");
			break;
			
		}
		
		
		
		
		
		
	}
	
	
}
