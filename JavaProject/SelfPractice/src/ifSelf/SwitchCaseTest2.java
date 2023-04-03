package ifSelf;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		
		// 스캐너를 사용해서 입력해보기
	
		System.out.println("메뉴를 선택하시오 1~4");
		Scanner scan = new Scanner(System.in);
	
		int food = scan.nextInt();
		
		switch (food) {
		case 1 :
			System.out.println("한식");
			
			break;
		case 2 :
			System.out.println("중식");
			break;
			
		case 3: 
			System.out.println("양식");
			break;
			
		case 4 : 
			System.out.println("일식");
			break;
			
		default :
			System.out.println("선택의 범위를 벗어났습니다");		
		}
		
		
		
		
		
		
		

	}

}
