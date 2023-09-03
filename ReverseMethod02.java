package Stringarray.nasarsir;

import java.util.Scanner;

public class ReverseMethod02 {//---->>>>>o/p---->>>>>olleh syug

		public static void main(String[] args) {//----i/p---->>>hello guys
			// TODO Auto-generated method stub
		
			Scanner s = new Scanner (System.in) ;
			
			System.out.print("Enter the Data : ");
			
			String s1 = s.nextLine(); 
			String s2[] = s1.split(" ") ;
			
			for (int i = 0; i < s2.length; i++) {
				
				r1(s2[i]+" ");
			}
		}
		public static void r1(String a)
		{
			for (int i = a.length()-1; i>=0; i--) {
				System.out.print(a.charAt(i));
			}
		}
}
