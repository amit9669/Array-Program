package Stringarray.nasarsir;

import java.util.Scanner;

public final class LengthOfStringEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in) ;
		System.out.print("Enter the Data : "); 
		
		String s1 = s.nextLine();
		
		String s2[] = s1.split(" ") ;
		
		for (int i = 0; i < s2.length; i++) {
			
			m1(s2[i]) ;
		}
	}
	
	public static void m1(String a)
	{
		System.out.println("Length of "+a+" is = "+a.length());
	}

}
