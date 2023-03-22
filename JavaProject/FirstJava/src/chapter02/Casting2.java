package chapter02;

public class Casting2 {

	public static void main(String[] args) {

		byte b = 10;
		int i = (int)b; //(int)는 생략가능
		
		System.out.println("i = " + i);
		System.out.println("b = " + b);
		
		
		int i2 = 300;
		byte b2 = (byte)i2; //역방향(큰->작은)으로 갈때에는 주의해야한다. 왜곡이 생길 수 있음
		
		System.out.println("i2 =" +i2);
		System.out.println("b2 =" +b2);
		
		
		
		
		
		
		
		
		
	}

}
