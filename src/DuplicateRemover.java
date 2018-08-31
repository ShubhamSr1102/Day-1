import java.io.*;
public class DuplicateRemover 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String str = br.readLine();
		String res="";
		for(int i=0;i < str.length(); i++)
		{
			int flag = 0;
			for(int j=0;j < res.length(); j++)
			{
				if(str.charAt(i)==res.charAt(j))
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				res = res + str.charAt(i);
			}
		}
		System.out.println(res);
	}
}
		

