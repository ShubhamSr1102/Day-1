import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle 
{
	void area(float r)
	{
		float area = (float) (3.14 * r * r);
		System.out.println("The area of the circle is " + area);
	}
	void perimeter(float r)
	{
		float per = (float) (2 * 3.14 * r);
		System.out.println("The perimeter of the rectangle is " + per);
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of the circle");
		float rad = Float.parseFloat(br.readLine());
		Circle cir = new Circle();
		cir.area(rad);
		cir.perimeter(rad);
	}
} 