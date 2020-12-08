/*

*/

class ReverseString
{
	public static String intToRoman(int n)
	{
		String[] s={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
		int place=0;
		int r=0;
		String roman="";
		while(n>0)
		{
			place++;
			r=n%10;
			for(int i=0;i<place;i++)
			{
			 roman=s[r]+roman;
				
			}
			
			n=n/10;			
		}
		return roman;
	}
	
	
	public static long revereInteger(long n)
	{
		long r=0,reverse=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			reverse=reverse*10+r;
			
		}
		return reverse;
	}
	
	
	public static void main(String[] args)
	{
		String s="the sky is blue";
		String word="",sentence="";
		//Solution 1
		/*
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
			  word=s.charAt(i)+word;
			}
			else
			{
			  sentence=sentence+word+" " ;
		      //System.out.print(word+" ");
			  word="";	
			}
		}
		sentence=sentence+word+" "; 
		System.out.print(sentence);
		*/
		
		String a="Amal";
	    char[] b={'a','b'};
		//System.out.print(b);
		
		//System.out.print(revereInteger(-1234));
		System.out.print(intToRoman(20));
		
		
	}
}