package chapter06;

public class ArrayTest5 {

	public static void main(String[] args) {

		// 2차원 배열의 선언과 초기화
		int [][] arr = {
				{1,3,5},
				{2,4,8},
				{1,5,9},
				{3,5,7}
			
		};
		
		System.out.println(arr.length); // 개수를 print out 한다. (arr.length는 arr의 개수를 뜻함)
		System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2]);
		System.out.println(arr[1][0] + "\t" + arr[1][1] + "\t" + arr[1][2]);
		System.out.println(arr[2][0] + "\t" + arr[2][1] + "\t" + arr[2][2]);
		System.out.println(arr[3][0] + "\t" + arr[3][1] + "\t" + arr[3][2]);
		

	}

}
