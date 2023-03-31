package ifSelf;

public class If01 {

	public static void main(String[] args) {
	
		
		int score = 88;
		if (score >=60) {
			System.out.println("Pass");
		}
		
		
		int age = 20;
		if (age >=18) {
			System.out.println("투표가 가능합니다.");
		}
		
		// 점수가 60점 이상인 경우에는 “PASS”를 출력 하고, 60점 미만인 경우 “FAIL”을 출력하는 프로그램 만들기

		int score1 = 89;
		if (score1 >= 60) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
		// - 점수가 90점 이상인 경우 “A”를 출력하고
//		- 80점 이상이면서 90점 미만인 경우 “B”를 출력
//		- 앞의 두 조건에 맞지 않는 이외의 경우에는 “C”를 출력하는 프로그램
		
		int score2 = 99;
		if (score2 >= 90) {
			System.out.println("A");
			} else if (score2 >= 80) {
				System.out.println("B");
		} else {
			System.out.println("C");
		}
	
		
		
		
	}

}
