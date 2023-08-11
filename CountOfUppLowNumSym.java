package AssignmentSTRING;

import java.util.Scanner;

public class CountOfUppLowNumSym {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in) ;
		System.out.println("Enter the Data : ");
		
		String s1 = s.next();//hellohello
		char ch [] = s1.toCharArray();
		int upperCaseCount = 0 ;
		int lowerCaseCount = 0 ;
		int numberCount = 0 ;
		int symbolCount = 0 ;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				upperCaseCount++ ;
			}
			else if(ch[i]>='a'&& ch[i]<='z')
			{
				lowerCaseCount++ ;
			}
			else if(ch[i]>='0'&& ch[i]<='9')
			{
				numberCount++ ;
			}
			else
			{
				symbolCount++ ;
			}
		}
		System.out.println("Upper Case = "+upperCaseCount);
		System.out.println("Lower Case = "+lowerCaseCount);
		System.out.println("Number = "+numberCount);
		System.out.println("Symbol = "+symbolCount);
		
	}
}
