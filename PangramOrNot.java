package AssignmentSTRING;

public class PangramOrNot {//---->>>>>i/p--->>>>pack my box with five dozen liquor jugs.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Pack my Box With five dozen liquor jugs.".toLowerCase();
		char ch [] = s1.toCharArray();
		int count = 0 ;
		
		for (int i = 'a'; i <='z'; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(i==ch[j])
				{
					count ++;
					break ;
				}
			}
		}
		System.out.println(count);
		if(count==26)
		{
			System.out.println("Pangram");
		}
		else
		{
			System.out.println("Not Pangram");
		}
	}
}
