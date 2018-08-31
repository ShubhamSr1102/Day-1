import java.io.*;
public class Square 
{
	void square(int n)
	{
		int sq=n*n;
		System.out.println(n + " * 1 = " + n + ", Square: " + sq);
	}
	public static void main(String args[])throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the value");
	int n=Integer.parseInt(br.readLine());
	Square obj = new Square();
	obj.square(n);
	
	}
}