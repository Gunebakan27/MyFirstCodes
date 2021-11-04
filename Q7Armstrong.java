package interviewquestions;

import java.util.Scanner;

public class Q7Armstrong {

	public static void main(String[] args) {
		/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number..");
		int arm=scan.nextInt();
		String sum="";
		
		
		for(int i=arm;i>0;i/=10) {
			
			sum=sum+((i%10));
			System.out.println(sum);
					}
//		if(arm==sum) {
//			System.out.println(arm+" is an Armstrong number");
//		}else {System.out.println(arm+" is not an Armstrong number");
//		
//		}
	}

}
