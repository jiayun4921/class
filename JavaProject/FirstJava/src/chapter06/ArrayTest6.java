package chapter06;

public class ArrayTest6 {

	public static void main(String[] args) {

		int[][] scores = { { 100, 90, 80 }, { 98, 76, 65 }, { 46, 95, 69 }, { 81, 60, 55 }

		};

		// 행을 반복
		for (int i = 0; i < scores.length; i++) { // for(초기식; 조건식; 증가식) <-for문 문법
			// scores[i] => 반복하면서 각각의 1차원 배열이 나타남

			// 열의 반복 : 각 1차원 배열의 요소를 출력
			for (int j = 0; j < scores[i].length; j++) { // 같은 블럭 안에서 i를 썼으니까 j로 설정
				System.out.print("numbers[" + i + "][" + j + "] => " + scores[i][j] + " \t");

			}
			System.out.println();
		}

	}
}
