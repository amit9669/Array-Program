package Stringarray.nasarsir;

import java.util.Scanner;

public class ReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in) ;
		System.out.print("Enter The Data : "); 
		
		String s1 = s.nextLine();
		for (int i = s1.length()-1; i >= 0; i--) {
			
			System.out.print(s1.charAt(i)+" ");
		}
	}

}
