package chapter04;

public class IfTest3 {

	public static void main(String[] args) {
		
		
		// 점수가 90점 이상인 경우 “A”를 출력하고
		// 80점 이상이면서 90점 미만인 경우 “B”를 출력
		// 앞의 두 조건에 맞지 않는 이외의 경우에는 “C”를 출력하는 프로그램
		
		int score = 91;
		
		if(score>90 ) { //중첩연습
			System.out.println("A");
			if(score > 96) {
				System.out.println("A+");
			} else if(score >93) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
			
			
		} else if (score >= 80) {
			//90점 미만인 사람들임
			//80~89 => B
			System.out.println("B");
		} else {
			System.out.println("C");
			
		}
		

	}

}
