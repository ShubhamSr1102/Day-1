import java.io.*;
public class MultiDimArray 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println( "Enter the number of rows");
		int m = Integer.parseInt(br.readLine());
		System.out.println( "Enter the number of columns");
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[m][n];
		System.out.println( "Enter the elements of the array");
		for(int i = 0 ;i < m; i++)
		{
			for(int j = 0 ;j < n; j++)
			{
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		System.out.println("Enter the value to be searched");
		int ele=Integer.parseInt(br.readLine());
		for(int i = 0 ;i < m; i++)
		{
			for(int j = 0 ;j < n; j++)
			{
				if(ele==arr[i][j])
				{
					System.out.println("Element found at index = " + i + "," + j);
					System.exit(0);
				}
			}
		}
		System.out.println("Number not found");
		}
}

