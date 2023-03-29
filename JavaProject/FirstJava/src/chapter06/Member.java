package chapter06;

public class Member {

		int memberNo;
		String memberId;
		String memberName;

		
		
 // alt+shift+s	+ 밑에서 세번째 클릭.생성자 만드는거
		public Member(int memberNo, String memberId, String memberName) {
			super();
			this.memberNo = memberNo;
			this.memberId = memberId;
			this.memberName = memberName;
		}


// alt+shift+s	+ 밑에서 네번째 클릭.오버라이드 만드는거
		@Override
		public String toString() {
			return "회원 [회원번호=" + memberNo + ", 아이디=" + memberId + ", 이름=" + memberName + "]";
		}


}
