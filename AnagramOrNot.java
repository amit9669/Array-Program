package AssignmentSTRING;

import java.util.Scanner;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in) ;
		System.err.print("Enter the 1st Data : ");
		
		String s1 = s.next();
		
		System.err.print("Enter the 2nd Data : ");
		
		String s2 = s.next();
		
		char c1 [] = s1.toCharArray();//k,e,e,p
		char c2 [] = s2.toCharArray();//p,e,e,k
		int count = 0 ;
		
		if(c1.length==c2.length)
		{
			for (int i = 0; i < c1.length; i++) {
				for (int j = 0; j < c2.length; j++) {
					
					if(c1[i]==c2[j])
					{
						count ++ ;
						c2[i]='\u0000' ;
					}
				}
			}
			if(count==c1.length)
			{
				System.out.println("is Anagram");
			}
			else
			{
				System.out.println("is Not Anagram");
			}
		}
		else
		{
			System.out.println("is Not Anagram");
		}
	}

}
