package youtube;

public class NotPresentCharEle { 

	public static void main(String[] args) 
	{
		char a [] = {'a','b','c','d','f','g'};
		char b [] = {'a','b','e','d','g','k'};
		
		for(int i = 0 ;i < a.length; i++)
		{
			int count = 0 ;
			if(a[i]!='\u0000')
			{
				for(int j = 0 ; j< b.length ; j++)
				{
					if(a[i]==b[j])
					{
						count ++ ;
						b[j] = '\u0000' ;
						break ;
					}
				}
				if(count == 0)
				{
				   System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println();
		for(int i = 0 ;i < b.length; i++)
		{
			int count = 0 ;
			if(b[i]!='\u0000')
			{
				for(int j = 0 ; j< a.length ; j++)
				{
					if(b[i]==a[j])
					{
						count ++ ;
						a[j] = '\u0000' ;
						break ;
					}
				}
				if(count == 0)
				{
			       System.out.print(b[i]+" ");
				}
			}
		}
	}

}
