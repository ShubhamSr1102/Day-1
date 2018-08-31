
import java.io.*;

public class Temperature 
{
	float celsiusToFahrenheit(float temp)
	{
		float fahrenheit = (( temp - 32) * 5)/9;
		return fahrenheit;
	}
	float fahrenheitToCelsius(float temp)
	{
		float celsius = (temp * 5)/9 +32;
		return celsius;
	}
	public static void main(String args[])throws IOException 
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Temperature obj = new Temperature();
	System.out.println("Enter 1 to change the temp to Celsius or Enter 2 to change the temp to Fahrenheit");
	int ch = Integer.parseInt(br.readLine());
	float temp;
	float result=0;
	switch(ch)
	{
	case 1:
		System.out.println("Enter the temp in Fahrenheit");
		temp = Float.parseFloat(br.readLine());
		result = obj.celsiusToFahrenheit(temp);
		break;
	case 2:
		System.out.println("Enter the temp in Celsius");
		temp = Float.parseFloat(br.readLine());
		result = obj.fahrenheitToCelsius(temp);
	}
	System.out.println(result);
	}
}
