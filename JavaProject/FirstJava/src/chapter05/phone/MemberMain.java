package chapter05.phone;

public class MemberMain {

	public static void main(String[] args) {
	
		
		Member member1 = new Member("손흥민", "sonny@gmail", 20, "010-1111-2222");
		Member member2 = new Member("박지성", "jisung@gmail");
		
		
		member1.showData();
		System.out.println();
		member2.showData();

	}

}
