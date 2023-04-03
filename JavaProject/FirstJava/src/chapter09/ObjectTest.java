package chapter09;

public class ObjectTest {

	public static void main(String[] args) {
		Car c1 = new Car ();
		Car c2 = new Car();
		Car c3 = c1;
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));


	}

}



class Car {}
