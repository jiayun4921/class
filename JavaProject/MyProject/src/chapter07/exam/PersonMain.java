package chapter07.exam;

public class PersonMain {

	//① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다
	
	public static void main(String[] args) {
		
		Male m1 = new Male("손흥민", "991111-1000000", "축구선수입니다.");
		m1.printGreeting();
		
		Person p1 = (Person)m1 ;
				p1.printGreeting();
				//p1.hello();
				
		
		Person p2 = new Female("영희", "020571-4000000");
		p2.printGreeting();
	}
	
}
