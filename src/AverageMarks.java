import java.io.*;
public class AverageMarks 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int marks[][] = new int[3][3];
		for(int i = 0 ;i < 3; i++)
		{
			System.out.println( "Enter the marks for Student " + (i+1));
			for(int j = 0 ;j < 3; j++)
			{
				marks[i][j] = Integer.parseInt(br.readLine());
			}
		}
		int subAverage[] =  new int[3];
		int subTotal[] =  new int[3];
		int totalAverage[] =  new int[3];
		int studentTotal[] =  new int[3];
		for(int i = 0 ;i < 3; i++)
		{
			for(int j = 0 ;j < 3; j++)
			{
				subTotal[j] += marks[i][j];
			}
		}
		
		for(int i = 0 ;i < 3; i++)
		{
			System.out.println("The total marks in Subject " + (i+1) + " is " + subTotal[i]);
			subAverage[i] = subTotal[i]/3;
			System.out.println("The Average marks in Subject " + (i+1) + " is " + subAverage[i]);
		}
		for(int i = 0 ;i < 3; i++)
		{
			for(int j = 0 ;j < 3; j++)
			{
				studentTotal[i] += marks[i][j];
			}
		}
		for(int i = 0 ;i < 3; i++)
		{
			System.out.println("The total marks of Student " + (i+1) + " is " + studentTotal[i]);
			totalAverage[i] = studentTotal[i]/3;
			System.out.println("The Average marks in Student " + (i+1) + " is " + totalAverage[i]);
		}
	}
}
