package Stringarray.nasarsir;

import java.util.Scanner;

public class ReverseMethod03 {//--------->>>>O/p--->>>>you thank guys hello

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in) ;
		
		System.out.print("Enter The Data : ");//hello guys thank you
		
		String s1 = s.nextLine();
		String s2 [] = s1.split(" ") ;
		
		for (int i = s2.length-1; i >=0 ; i--) {
			System.out.print(s2[i]+" ");
		}
	}
}
