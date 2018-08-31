import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator 
{
	 void add(int val1, int val2)
	 {
		 int sum = val1 + val2;
		 System.out.println("The sum of the two digits is "+ sum);
	 }
	 void diff(int val1, int val2)
	 {
		 int difference = val1 - val2;
		 System.out.println("The difference of the two digits is "+ difference);
	 }
	 void product(int val1, int val2)
	 {
		 int prod = val1 * val2;
		 System.out.println("The product of the two digits is "+ prod);
	 }
	 void division(int val1, int val2)
	 {
		 int quot = val1 / val2;
		 System.out.println("The quotient after dividing the two digits is "+ quot);
	 }
	 public static void main(String args[])throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Calculator obj = new Calculator();
	System.out.println("Enter the two values");
	int val1= Integer.parseInt(br.readLine());
	int val2= Integer.parseInt(br.readLine());
	obj.add(val1, val2);
	obj.diff(val1, val2);
	obj.product(val1, val2);
	obj.division(val1, val2);
	}
}
