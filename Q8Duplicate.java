package interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8Duplicate {

	public static void main(String[] args) {
	/*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list
	*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of a list..");
		int size=scan.nextInt();
		
		List<String>list=new ArrayList<>();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the " +(i+1)+". element of a list..");
			
			list.add(scan.next());
			
			}
		List<String>list2=new ArrayList<>();
		for(int i=0;i<size;i++) {
		
			if(!list2.contains(list.get(i))) {
				
				list2.add(list.get(i));
			
			}
			
		}
		System.out.println(list);
		System.out.println(list2);
	}

}
