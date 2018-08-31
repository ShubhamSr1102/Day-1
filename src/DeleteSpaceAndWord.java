import java.io.*;
public class DeleteSpaceAndWord
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		String res="";
		int i;
		for(i=0; i < str.length()-1; i++)
		{
			if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==' ')
			{
				
			}
			else
			{
				res = res + str.charAt(i);
			}
		}
		res = res + str.charAt(i);
		str = res;
		res = "";
		System.out.print("Word to be deleted : ");
		String word = br.readLine();
//		System.out.println();
		System.out.print("Word position in the sentence : ");
		int pos = Integer.parseInt(br.readLine());
		int ct=0;
		for(i = 0; i < str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				ct++;
				if(ct==(pos-1))
				{
					res = str.substring(0, i+1) + str.substring(i+2+word.length());
				}
			}
		}
		System.out.println(res);
	}
}
