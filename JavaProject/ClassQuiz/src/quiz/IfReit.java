package quiz;

public class IfReit {

	public static void main(String[] args) {
		
		
		// 문제 1. 
//		아래 예제는 두 개의 if문을 사용하고 있다. 한 개의 if 문만 사용하는 방식으로 변경해보자.

//		class IfReit {
//
//		    public static void main(String[] args) {
//		        int num=120;
//		        if(num>0) {
//		            if((num%2)==0)
//		                System.out.println(“양수이면서 짝수");
//		        }
//		    }
//		}
		
//		int num = 120;
//		if (num>0 && num%2==0) {
//			System.out.println("양수이면서 짝수");
//		}
//	

		// 문제 2.
//		다음과 같이 출력이 이루어지도록 작성해보자.
//
//		num < 0 이라면 “0 미만” 출력
//		0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//		100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//		200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//		300 ≤ num 이라면 “300이상 “ 출력
		
		
		int num=199;
		
		if (num<0) {System.out.println("0미만");
		} 
		
		if (num>=0 && num<100) { System.out.println("0이상 100미만");
		}
		
		if (num>=100 && num<200) {System.out.println("100이상 200미만");
		} 
		
		if (num>=200 && num<300) {System.out.println("200이상 300미만");
		
		} 
		if (num>=300) {System.out.println("300이상");
		} 
		
			
		
	
		
		
	}

}
