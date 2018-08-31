import java.io.*;
public class Armstrong 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		int sum=0;
		while(temp>0)
		{
			int d = temp%10;
			sum = sum + d*d*d;
			temp=temp/10;
		}
		if(sum == n)
		{
			System.out.println(n + " is an Armstrong Number");
		}
		else
		{
			System.out.println(n + " is not an Armstrong Number");
		}
	}
}
