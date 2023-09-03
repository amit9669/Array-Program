package Stringarray.nasarsir;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in) ;
		System.out.print("Enter The Data : "); 
		
		String s1 = s.next();
		char []  ch = s1.toCharArray()  ;
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
