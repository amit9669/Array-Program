package array.nasarsir;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagMerge {

	public static void main(String[] args) {
		
       Scanner s = new Scanner (System.in);
		
		System.out.print("Enter the 1st Size : ");
		
		int a[] = new int [s.nextInt()] ;
		
		for (int i = 0 ;i<a.length ; i++)
		{
			a[i] = s.nextInt() ;
		}
		
		System.out.print("Enter the 2nd size : ");
		
		int b[] = new int [s.nextInt()];
		
		for (int i = 0; i< b.length ; i++)
		{
		   b[i] = s.nextInt();	 
		}
		
		int res[] = merge(a,b) ;
		
		System.out.println(Arrays.toString(res));
		
	}
	
	public static int[] merge(int a[], int b[])
	{
		int []c = new int[a.length + b.length] ;
		
		int index = 0 ;
		
		for (int i =0 ; i<(a.length>b.length?a.length:b.length) ; i++)
		{
			if (i<a.length)
			{
				c[index++] = a[i] ;
			}
			
			if (i<b.length)
			{
				c[index++] = b[i] ;
			}
		}
		
		return c ;
	}

}
