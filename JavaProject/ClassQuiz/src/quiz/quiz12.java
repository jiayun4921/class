package quiz;

public class quiz12 {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;

		while (true) {
			// 모든 홀수와 (또는 이거나 )3의 배수인 짝수를 찾는다.(&& 연산이 우선)
			
//			if (num % 2 == 1 || num % 3 == 0 && num % 2 == 0) {
//				sum += num;
//			}

			if(num % 2 == 1) {
				sum += num;
			}else if( num % 3 == 0) { // 짝수 =2의 배수
				sum += num; //코드가 중복되는건 X
			}
			
			
			
			
			if (sum > 1000) {
	
				System.out.println(num + "값을 더했을 때 1000이 넘어갑니다");
				System.out.println("최초로 1000이 넘어간 숫자 : " + sum);
				break;

		}
		}

		num++;

	}

}
