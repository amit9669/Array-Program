package array.nasarsir;

import java.util.Scanner;

public class AsciiToValue {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in) ;
		
		System.out.print("Enter the Number of Characters : ");
		
		int count = s.nextInt() ;
		
		char ch[] = new char[count] ;
		int ascii[] = new int[count] ;
		
		for (int i = 0; i < count; i++) 
		{ 
			System.out.println("Enter Characters "+i+": ");
			ch[i] = s.next().charAt(0) ;
			ascii[i] = (int) ch[i] ;
		}
		
		for (int i = 0; i < count ; i++) 
		{
			System.out.println(ch[i] +"=="+ ascii[i]);
		}
	}
}