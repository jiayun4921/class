package quiz;

public class quiz06 {

	public static void main(String[] args) {

		
// 문제 6. while 문을 이용해서 1부터 99까지의 합을 구하는 프로그램을 작성.
		
		int num=1;
		int sum=0; //합을 저장하는 변수
		
		while (num <100) { 
			// 반복 처리하는 문장 : 합을 구하는 연산

			//sum = sum+num; (밑에랑 같은 말
			
			sum += num;
			
			num++;
			
		}System.out.println("1~99 까지의 합 : " +sum);
		
		
		

	}

}
