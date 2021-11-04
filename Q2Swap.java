package interviewquestions;

public class Q2Swap {

	public static void main(String[] args) {
		//Write a Java Program to swap two numbers
		
//		1.Way:
		int x=5;
		int y=7;
		
//		int temp=0;
//		temp=x;
//		x=y;
//		y=temp;
//		
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("x is: "+ x+" y is: "+y);
		
	}

}
