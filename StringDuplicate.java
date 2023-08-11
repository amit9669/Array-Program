package AssignmentSTRINGPDF;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in) ; 
		System.out.print("Enter the Size : ");
		
		String s1 [] = new String[s.nextInt()] ;
		for (int i = 0; i < s1.length; i++) {
			s1[i]=s.next();
		}
		for (int i = 0; i < s1.length; i++) {
			int count = 0 ;
			if(s1[i]!=null)
			{
				for (int j = i+1; j < s1.length; j++) {
					if(s1[i].equals(s1[j]))
					{
						count++ ;
						s1[j] = null ;
					}
				}
				if(count !=0)
				{
					System.out.println(s1[i]);
				}
			}
		}
	}
}
