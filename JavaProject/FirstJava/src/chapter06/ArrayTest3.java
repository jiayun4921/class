package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		//배열의 선언
		int[] scores; // int 타입의 배열 인스턴스 주소를 가지는 변수
		
		// 배열의 생성
		scores = new int[15]; // int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		
		
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
		scores[10] = 98;
		scores[11] = 100;
		scores[12] = 83;
		scores[13] = 72;
		scores[14] = 66;
		
		
		
		resultPrint(scores);
		
		
	}
	
	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균값을 출력하는 메소드
	// 반환타입이 없다. -> void값 사용
	
	static void resultPrint(int[] arr) { // int[] arr = scores; 랑 같은거임
		
		// 전달받은 배열은 : int 타입의 배열이다! size 제약은 없다
		
		int sum = 0; //<-지역변수라서 초기화 시켜준거임
		float avg = 0.0f;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];		
		}
		
		// avg = sum/arr.length;-> int int 값이니까 소수점까지 값이 안나옴. float를 써줘야함
		avg = sum/(float)arr.length;  // -> float를 써줌으로써 소수점 나오게
		 
		System.out.println("==========");
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
	
	
	
	
	

}
