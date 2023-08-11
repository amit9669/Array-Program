package AssignmentSTRINGPDF;

import java.util.Scanner;

public class StringCharUnique {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner s = new Scanner(System.in) ;
			System.out.println("Enter the Data : ");
			String s1 = s.nextLine();
			char ch [] = s1.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				int count = 0 ;
				if(ch[i]!='\u0000')
				{
					for (int j = i+1; j < ch.length; j++) {
						if(ch[i]==ch[j])
						{
							count ++ ;
							ch[j]='\u0000';
						}
					}
					if(count == 0)
					{
						System.out.println(ch[i]);
					}
				}
			}
	}

}
