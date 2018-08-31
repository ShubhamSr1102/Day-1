import java.io.*;
public class Interest 
{	
	void simple(double p, double r, double t)
	{
		double i=(p*r*t)/100;
		System.out.println("The Simple Interest is " + i);
	}
	void compound(double p, double r, double t)
	{
		double i=p * Math.pow((1 + r*0.01), t); // ((P*(1+r/100)^t) - P)
		i=i-p;
		System.out.println("The Compound Interest is " + i);
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the principal");
		int p=Integer.parseInt(br.readLine());
		System.out.println("Enter the rate of interest");
		int r=Integer.parseInt(br.readLine());
		System.out.println("Enter the time");
		int t=Integer.parseInt(br.readLine());
		Interest obj = new Interest();
		obj.simple(p,r,t);
		obj.compound(p,r,t);
	}
}
