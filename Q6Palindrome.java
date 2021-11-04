package interviewquestions;

public class Q6Palindrome {

	public static void main(String[] args) {
		/*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome", 
	    For example, "madam" or "nurses run".
	 */
		String s1="lol";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.substring(i,i+2);
					
		}
		if(s1.equals(s2)) {
			System.out.println(s1+" is palindrome");
		}else {System.out.println(s1+" is not palindrome");
		}
	}

}
