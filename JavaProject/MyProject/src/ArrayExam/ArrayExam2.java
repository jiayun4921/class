package ArrayExam;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		//① Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Student[] students = new Student[10];
		students[0] = new Student("son01", 100, 90, 70);
		students[1] = new Student("son02", 50, 80, 50);
		students[2] = new Student("son03", 70, 50, 30);
		students[3] = new Student("son04", 30, 60, 90);
		students[4] = new Student("son05", 40, 60, 90);
		students[5] = new Student("son06", 50, 70, 80);
		students[6] = new Student("son07", 60, 40, 40);
		students[7] = new Student("son08", 40, 40, 50);
		students[8] = new Student("son09", 60, 90, 70);
		students[9] = new Student("son10", 60, 100, 80);
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("==========================================");
		
		for(Student student : students) {
			System.out.println(student.result());
		}
		
	}

}
