package quiz;

public class quiz05 {

	public static void main(String[] args) {

		// 문제 5. 문제 2의 답안 코드를 switch 문으로 변경하여 보자.
		// num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경하세요.

//		int num = 259;
//
//		if (num < 0) {
//			System.out.println("0미만");
//		}
//		if (num >= 0 && num < 100) {
//			System.out.println("0이상 100미만");
//		}
//		switch (num / 100) {
//		case 1:
//			System.out.println("100이상 200미만");
//			break;
//
//		case 2:
//			System.out.println("200이상 300미만");
//
//			break;
//		case 3:
//			System.out.println("300이상");
//			break;

//---------쌤과 풀이---------
			int num = 120;

			// num < 0 이라면 “0 미만” 출력 부분은 if문을 사용

			if (num < 0) {
				System.out.println("0미만");
			} else {

				// num/100 값을 주는게 중요!
				switch (num/100) {
				case 0: // 0~99
					System.out.println("0이상 100미만");
					break;
				case 1: // 100~199
					System.out.println("100이상 200미만");
					break;
				case 2: // 200~299
					System.out.println("200이상 300미만");
					break;
				default:
					System.out.println("300이상");
				}

			}

		}

	}


