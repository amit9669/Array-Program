package array.nasarsir;

import java.util.Scanner;

public class ArmStrongNumber {

public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int a[] = new int[s.nextInt()];
		
		for (int i = 0; i < a.length; i++) 
		{
			
			a[i] = s.nextInt();
			
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if (isArmStrong(a[i]))
			{
				System.out.println("Its Strong Number : "+a[i]);
			}
		}
	}
	
		public static int isCount(int num)
		{
			int count = 0 ;
			while(num!=0) {
			num = num/10 ;
			count ++ ;
			}
			return count ;
		}
		
		public static int isPower(int base , int raise)
		{
			int pow = 1 ;
			for (int i = 0; i <raise; i++) {
				
				pow = pow * base ;
				
			}
			return pow ; 
		}
		
		public static boolean isArmStrong(int num)
		{
			int sum = 0 ;
			int temp = num ;
			int ct = isCount(num);
			while (num!=0) {
				
				int rem = num%10 ;
				
				sum = sum+isPower(rem,ct);
				
				num/=10 ;
				
			}
			if (temp == sum)
			{
				return true ;
			}
			return false ; 
		}
}