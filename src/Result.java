import java.io.*;
public class Result 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the marks of three subjects");
		int sub1 = Integer.parseInt(br.readLine());
		int sub2 = Integer.parseInt(br.readLine());
		int sub3 = Integer.parseInt(br.readLine());
		if(sub1 > 60 && sub2>60 && sub3>60)
		{
			System.out.println("Passed");
		}
		else if(sub1 > 60 && sub2>60 || sub1 > 60 && sub3>60 || sub2 > 60 && sub3>60)
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
