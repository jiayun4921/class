package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

		//배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[10]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		
		}
		
		System.out.println("----------------------------");
		
		//↑ 인스턴스 변수의 초기화가 안 되어있음. 기본값으로 초기화
		
		
		
		
		// 배열 요소의 참조
		// 배열이름[index]
		// index = 0 ~ 개수-1
		// 요소의 개수 => 배열변수.length (->내부에서 사용할 수 있도록 자동으로 들어감)
		
		scores[0] = 60;
		scores[1] = 45;
		scores[2] = 98;
		scores[3] = 34;
		scores[4] = 88;
		scores[5] = 90;
		scores[6] = 63;
		scores[7] = 95;
		scores[8] = 71;
		scores[9] = 40;
		
		
		// 총합을 구해보자
		int sum = 0; // 합의 초기값은 0
		// 평균값을 구해보자
		float avg = 0.0f;
		
		//System.out.println(scores[6]);
		//index => 0~9
		for(int i=0; i<scores.length; i++) {            // 반복문 for 사용, 임의의 배열의 개수를 알아낼때는 length 사용
			System.out.println(scores[i]);
			// ↑ 이거는 그냥 결과를 나열해서 프린트한 것이고, 합의 연산이 필요
			sum = sum + scores[i];	
		}
		
		
		avg = sum / (float)scores.length;
		// avg는 float 타입의 값 -> 소수점 계산은 됌. 소수점 자리수까지 계산해주길 원하면 앞에 (float)를 써줘야함
				// float를 써줌으로써 결과값이 68.0였던게 68.4가 나옴
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	
		
	}

}
