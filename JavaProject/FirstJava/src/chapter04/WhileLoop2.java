package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {

		// 구구단 만들기
		int num = 1;
		
		while(num<10) { // 행(세로)을 표현
			
			int n = 2;
			while(n<10) {  //열(가로)을 표현
				System.out.print(n + " X " + num + " = " + n*num + "\t");
				n++;
				
			}
			
			
			
			//System.out.println("2 X " + num + " = " + num*2);
			
			//System.out.print("2 X " + num + " = " + num*2);
			//System.out.print("\t 3 X " + num + " = " + num*3);
			//System.out.print("\t 4 X " + num + " = " + num*4);
			//System.out.print("\t 5 X " + num + " = " + num*5);
			//System.out.print("\t 6 X " + num + " = " + num*6);
			//System.out.print("\t 7 X " + num + " = " + num*7);
			
			System.out.println();
			num++;
			
		}
		
		
		
		
		 
	}

}
