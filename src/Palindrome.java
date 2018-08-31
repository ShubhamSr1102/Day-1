import java.io.*;
public class Palindrome 
{
	String rev(String str)
	{
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		Palindrome obj = new Palindrome();
		String str_rev = obj.rev(str);
		//System.out.println(str_rev);
		if(str.equals(str_rev))
		{
			System.out.println("Palindrome String");
		}
		else
			System.out.println("Not a Palindrome string");
	}
}
