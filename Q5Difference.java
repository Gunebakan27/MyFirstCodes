package interviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q5Difference {

	public static void main(String[] args) {
	    /*
		 	Create a function that takes an array and 
		 	returns the difference between the biggest and the smallest numbers.
		    Ask user to enter array elements.
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length=scan.nextInt();
		int arr[]=new int[length];
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter an "+(i+1)+". element..");
			arr[i]=scan.nextInt();
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
