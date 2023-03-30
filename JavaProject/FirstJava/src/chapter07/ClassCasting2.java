package chapter07;

public class ClassCasting2 {
 
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone("010-111-2222");
		Iphone iPhone = new Iphone ("010-222-3333");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
		
		
	}
	
	// 매개변수에 다형성을 적용 => 추가적인 메소드 생성이 필요없어진다!
	public static void callByPhone(Phone p) {
		p.call();
	}
	
	
	public static void callByPhone(AndroidPhone p) {
		p.call();
	}
	
	public static void callByPhone(Iphone p) {
		p.call();
	}
	
}
