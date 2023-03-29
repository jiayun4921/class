package chapter05.phone;

public class SmartPhoneMain {

	public static void main(String[] args) {

		SmartPhone sp1 = new SmartPhone("Red", 5.0f, 10);
		SmartPhone sp2 = new SmartPhone("Gold", 4.0f);
		SmartPhone sp3 = new SmartPhone();
		
		// new SmartPhone
		// SmartPhone("Red", 5.0f, 10)


//		sp.color = "White";
//		sp.size = 4.5f;
//		sp.volume = 5;

		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp1.volume);

		System.out.println(sp2.color);
		System.out.println(sp2.size);
		System.out.println(sp2.volume);
	
		System.out.println(sp3.color);
		System.out.println(sp3.size);
		System.out.println(sp3.volume);
		
		Member member = new Member("king", "king@gmail", 20, "010-5555-6666" ,26);
				
				printinfo(member);
	}
	
	static void printInfo(Member member); {
		member.showData();
	}

}
