package ifSelf;

public class SwitchCaseTest {

	public static void main(String[] args) {
		
		
//		int month = 3;
//		switch (month) {
//		case 1 : System.out.println("생일인 월입니다.");
//		break;
//		
//		case 2 : System.out.println("생일인 월이 아닙니다.");
//		break;
//		
//		case 3 : System.out.println("생일인 월이 아닙니다.");
//		break;
//		
//		default : System.out.println("다른 달을 입력하세요.");
//		
//		}
		
		
		String grade = "방장"; // 타입을 변수에 맞게 입력할 것!!
		switch (grade) {
		
		case "비회원" : System.out.println("읽기만 가능합니다.");
		break;
		
		case "정회원" : System.out.println("읽기 및 쓰기가 가능합니다.");
		break;
		
		case "매니저" : System.out.println("읽기,쓰기,게시물 삭제가 가능합니다.");
		break;
		
		case "방장" : System.out.println("읽기,쓰기,삭제 및 회원 강퇴가 가능합니다.");
		break;
		
		default : System.out.println("등급을 입력해주세요.");
		
	
		}
		
		
		
	}

}
