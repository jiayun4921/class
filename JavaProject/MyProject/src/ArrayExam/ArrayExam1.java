package ArrayExam;

public class ArrayExam1 {

	public static void main(String[] args) {

//		1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
//		평균 점수를 출력하는 프로그램을 작성해봅시다. 

//		int[] korScore = { 30, 20, 40, 50, 60, 70, 80, 60, 90, 50 };
//		int[] engScore = { 30, 25, 55, 98, 65, 75, 65, 14, 100, 50 };
//		int[] mathScore = { 20, 80, 90, 86, 88, 42, 56, 64, 78, 98 };

		System.out.println("국어 \t 영어 \t 수학 \t 총점 \t 평균");
//		for (int i = 0; i < 10; i++) {
//			int sum = korScore[i] + engScore[i] + mathScore[i];
//			float avg = sum / 3f;
//			System.out.println(korScore[i] + "\t" + engScore[i] + "\t" + mathScore[i] + "\t" + sum + "\t" + avg);
//		}

		
		int [][] scores = {
				{100, 90, 80},
				{50, 90, 90},
				{70, 90, 100},
				{60, 70, 60},
				{20, 80, 30},
				{60, 90, 40},
				{80, 60, 50},
				{80, 90, 70},
				{50, 90, 90},
				{100, 70, 80}
			};
		
		for (int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
				sum += scores[i][j];
				
				
				
			}
			System.out.print(sum + "\t");
			System.out.print(sum/(float)scores[i].length);
			System.out.println();
		}
		
	}

}
