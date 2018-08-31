import java.io.*;
public class Rectangle 
{
	void area(int l,int b)
	{
		int area = l*b;
		System.out.println("The area of the rectangle is " + area);
	}
	void perimeter(int l, int b)
	{
		int per = 2 * ( l + b );
		System.out.println("The perimeter of the rectangle is " + per);
	}
	public static int main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length and breadth of the rectangle");
		int len = Integer.parseInt(br.readLine());
		int breadth = Integer.parseInt(br.readLine());
		Rectangle rec = new Rectangle();
		rec.area(len,breadth);
		rec.perimeter(len,breadth);
		return 0;
		
	}
}
