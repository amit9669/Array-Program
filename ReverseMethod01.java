package Stringarray.nasarsir;

import java.util.Scanner;

public class ReverseMethod01 {//------>>>>syug olleh

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner (System.in) ;
		
		System.out.print("Enter the Data : "); 
		
		String s1 = s.nextLine();
		//String s2[] = s1.split(" ") ;
		
		for (int i = s1.length()-1; i >=0 ; i--) {
			System.out.print(s1.charAt(i));
		}
	}
}
