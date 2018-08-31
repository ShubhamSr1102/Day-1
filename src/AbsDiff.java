import java.io.*;
public class AbsDiff 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		int size = Integer.parseInt(br.readLine());
		int arr[] = new int [size];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i < size; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the value of k");
		int k = Integer.parseInt(br.readLine());
		for(int i = 0; i < size-1; i++)
		{
			for(int j = i+1; j < size; j++)
			{
				if(Math.abs(i-j) <= k)
				{
					if(arr[i]==arr[j])
					{
						System.out.println("Such a pair exists at " + (i+1) + "and " + (j+1));
					}
				}
			}
		}
	}
}
