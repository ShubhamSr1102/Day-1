import java.io.*;
public class Distinct 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int temp;
		System.out.println("Enter the elements of the array");
		for(int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < n-1; i++)
		{
			for(int j = 0; j < n-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i =0; i < n; i++)
		{
			if(arr[i]!=i)
			{
				System.out.println("The missing element is " + i);
				break;
			}
		}
	}
}
