package array.nasarsir;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in) ;
		
		int a[] = new int[s.nextInt()] ;
		
		for (int i = 0; i < a.length; i++) 
		{ 	
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) 
		{
		   if(isAuto(a[i])) 
		   {
			   System.out.println(a[i]+" is the Automorphic Number");
		   }
		}
	}
	
	public static boolean isAuto(int a)
	{
		int sqr = a*a ;
		int temp = a ;
		
		while(a>0)
		{
			if (a%10 == sqr%10)
			{
				return true ;
			}
			a/= 10 ;
			sqr/= 10 ; 
		}
		return false ; 
	}
}
