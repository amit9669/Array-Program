package array.nasarsir;

import java.util.Scanner;

public class FirstAndSecondMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in) ;
		System.out.print("Enter the Size : ");
		
		int a[] = new int [s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			
			a[i]  = s.nextInt();
		}
		int firstmax = a[0] ;
		int secondmax = a[0];
		
		for (int i = 1; i < a.length; i++) {
		
			if(a[i]>firstmax)
			{
				firstmax=a[i] ;
			}
		}
		
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]>secondmax && a[i] != firstmax)
			{
				secondmax = a[i] ;
			}
		}
		System.out.println("First Maximum Element : "+firstmax);
		System.out.println("Second Maximum Element : "+secondmax);
	}
}
