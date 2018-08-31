import java.io.*;
public class CalcDisc 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the price of the Item");
		int newItem = Integer.parseInt(br.readLine());
		double discount = (0.35) * newItem;
		double newItemPrice = newItem - discount;
		System.out.println("The original price of the Item : " + newItem);
		System.out.println("The discount on the Item : " + discount);
		System.out.println("The new price of the Item : " + newItemPrice);
	}
}
