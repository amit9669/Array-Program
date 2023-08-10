package array.nasarsir;

import java.util.Scanner;

public class CountEvenNum {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the Size : ");
		
		int a[] = new int [s.nextInt()];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			
			int count = 0 ;
			
			if(a[i]%2==0)
			{
				count ++ ;
				System.out.println("Count Of even Number : "+"'"+a[i]+"'");
			}
		}
	}

}
