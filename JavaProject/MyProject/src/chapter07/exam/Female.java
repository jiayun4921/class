package chapter07.exam;

public class Female extends Person {

	String msg;

	public Female(String name, String personNum) {
		super(name, personNum);
		this.msg = "안녕!";

	}

	/**
	 * @param name
	 * @param personNum
	 * @param msg
	 */
	public Female(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
	}

	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
	}

}
