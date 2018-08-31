public class Sort
{
	public static void main(String args[])
	{
	
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temp;
		for(int i = 0; i < 14; i++)
		{
			for(int j = 0; j < 15-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array is ");
		for(int i = 0; i < 15; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
