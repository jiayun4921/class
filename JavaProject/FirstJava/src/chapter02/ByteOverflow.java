package chapter02;

public class ByteOverflow {
	public static void main(String[] args) {
		
		
		// 다루어야 하는 데이터의 범위에 따라 타입 설정이 달라져야한다
		// 0~270
		
		
		byte b = 0;
		int i = 0;
		
		// 0에서 1씩 더해서 270까지 증가시키는 코드를 작성해보자
		// for(초기식(초기화); 비교식; 증감식) { 반복해야하는 코드들 } -> 이게 반복문의 문법
		
		for( int x=0; x <=270; x++ ) {
			//System.out.println(x);
			
			//b = b + 1;
			
			
			System.out.println(b+ "\t" + i); //문자열과 어떤 타입any type이든 연산이 들어가면 그건 문자열로 바뀐다 
			b++;
			i++;
			
		
		}
		
	}

}
