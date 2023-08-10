package array.nasarsir;

import java.util.Scanner;

public class ExchangeFirstToLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in) ;
		System.out.print("Enter The Size : ");
		
	    int	a[] = new int[s.nextInt()] ;
	    
	    for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();   	
		}
	    
	    int temp = a[0] ;
	    a[0] = a[a.length-1] ;
	    a[a.length-1] = temp ;
	    
	    for (int i = 0; i < a.length; i++) {
			
	    	System.out.println(a[i]);
		}
	}
}
