package youtube;

import java.util.Scanner;

public class NthSmallestEle {

	public static void main(String[] args) 
	{
		 Scanner s = new Scanner (System.in) ;
		 int arr [] = {180,99,274,55,507,222,1000,100,250} ;
		 System.out.print("Enter the Element Which you want smallest : ");
		 int num = s.nextInt();
		 
		 int op[] = sortArray(arr) ;
//		 for (int i = 0; i < op.length; i++) {
//			if(num == op[i])				
//			{
//				System.out.println(op[i]);
//			}
//		}
		 System.out.println(op[num-1]);
		// System.out.println(Arrays.toString(sortArray(arr)));
	}
	
	public static int[]  sortArray(int arr [])
	{
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j+1] = temp ;
				}
			}
		}
		return arr ;
	}

}
