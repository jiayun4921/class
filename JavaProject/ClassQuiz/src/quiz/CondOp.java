package quiz;

public class CondOp {

	public static void main(String[] args) {

// 문제 3.
		int num1=50, num2=100;
        int big, diff;
        big = (num1>num2)? num1:num2;
        System.out.println(big);
        
        diff = (num1>num2)? num1-num2: num2-num1;
        System.out.println(diff);

        
        
        
       if(num1>num2) {
    	   big =num1;
    	   diff = num1-num2;
       } else {
    	   big = num2;
    	   diff = num2-num1;
       }
       	System.out.println(big);
       	System.out.println(diff);
        

	}

}
