import java.io.*;
public class Tax 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the CTC");
		int n = Integer.parseInt(br.readLine());
		double tax=0;
		int temp;
		if(n > 0 && n <= 180000)
		{
			System.out.println("Nil");
		}
		else if(n > 180000 && n <= 300000)
		{
			temp = n - 180000;
			tax= temp * 0.1;
			System.out.println("The calculated tax is " + tax);
		}
		else if(n > 300000 && n <= 500000)
		{
			temp = n - 300000;
			tax= temp * 0.2 + 120000 * 0.1;
			System.out.println("The calculated tax is " + tax);
		}
		else if(n > 500000 && n <= 1000000)
		{
			temp = n - 500000;
			tax= temp * 0.3 + 120000 * 0.1 + 200000 * 0.2;
			System.out.println("The calculated tax is " + tax);
		}
		else
		{
			System.out.println("Enter a positive value");
		}
	}
}
