package interviewquestions;

public class Q1ReverseString {

	public static void main(String[] args) {
		//Write a Java Program to reverse a string
		
		String str="Ali Can";
		
		String reverse="";
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
