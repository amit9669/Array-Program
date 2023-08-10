package array.nasarsir;

import java.util.Scanner;

public class LastDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in) ;
		System.out.println("Eter the Size: ");
		int a [] = new int[s.nextInt()] ;
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = s.nextInt() ;
	    }
		
		for (int i = a.length-1; i < a.length; i--) {
			
			int count = 0 ;
			if(a[i] != 0 ) {
				
				for (int j = i+1; j < a.length; j++) {
					
					if (a[i] == a[j]) {
						
						count++ ;
						a[j] = 0 ;
					}
				}
				if(count!=0)
				{
					System.out.println("Last Duplicate Number is : "+a[i]);
					break ;
				}
			}
		} 
	}

}
