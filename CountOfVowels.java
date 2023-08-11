package AssignmentSTRING;

import java.util.Scanner;

public class CountOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in) ;
		
		System.out.print("Enter the data : ");
		String s1 = s.nextLine();
		char ch [] = s1.toCharArray();
		int count = 0 ;
		for (int i = 0; i < ch.length; i++) {
			
			char c1 = ch[i] ;
			
			if(c1=='a' || c1=='e'||c1=='i'||c1=='o'|| c1=='u'||c1=='A'||
					c1=='E' || c1=='I'||c1=='O'||c1=='U')
			{
				count ++ ;
				System.out.println(ch[i]+" = "+count);
			}	
		}
	}
}
