package interviewquestions;

import java.util.Scanner;

public class Q4PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer to check if it is prime or not");
		int num=scan.nextInt();
		
		//1,2,3,5,7,11,13...
		int count=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count==0||num==1) {
				System.out.println(num+" is prime");
			}else {System.out.println(num+" is not prime");
			
			
		}
	
		
		
		
	

	}}
