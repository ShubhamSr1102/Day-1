public class ArmstrongRange 
{
	public static void main(String args[])
	{
		for(int i=100 ; i<999 ; i++)
		{
			
		int temp = i;
		int sum=0;
		while(temp>0)
		{
			int d = temp%10;
			sum = sum + d*d*d;
			temp=temp/10;
		}
		if(sum == i)
		{
			System.out.println(i + " is an Armsrtrong Number");
		}
		else
		{
			
		}
		}
	}
}