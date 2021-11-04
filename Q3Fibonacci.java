package interviewquestions;

public class Q3Fibonacci {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13...
		
		int first=0;
		int second=1;
		int fib=0;
		
		for(int i=0; i<=10;i++) {
			
			System.out.print(first+" ");
			
			fib=first+second;
			first=second;
			fib=second;
		
			
		}
	}

}
