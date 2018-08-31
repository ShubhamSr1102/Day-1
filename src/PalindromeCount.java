import java.io.*;
public class PalindromeCount 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[10];
		String pal_str[] = new String[10];
		int j=0;
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Enter String number " + (i+1));
			str[i] = br.readLine();
		}
		PalindromeCount obj = new PalindromeCount();
		for(int i = 0; i < 10; i++)
		{
			
			String str_rev = obj.rev(str[i]);
			if(str[i].equals(str_rev))
			{
				pal_str[j]=str[i];
				j++;
			}
		}
		int pal_str_len = j;
	
		String temp;
		for(int i = 0; i < pal_str_len-1; i++)
		{
			for(j = 0; j < pal_str_len-i-1; j++)
			{
				if(pal_str[j].length() < pal_str[j+1].length())
				{
					temp = pal_str[j];
					pal_str[j] = pal_str[j+1];
					pal_str[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Palindromes in descending order are ");
		for(int i = 0; i < pal_str_len; i++)
		{
			System.out.print(pal_str[i] + " ");
		}
		
	
	}
	String rev(String str)
	{
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}
}
