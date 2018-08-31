import java.io.*; 
public class CUI 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String uid = "ShubhamSr";
		String pwd = "Srivastava";
		int ct=0;
		System.out.println("Enter the username and password");
		do
		{
		
		String str_uid = br.readLine();
		String str_pwd = br.readLine();
		if(uid.equals(str_uid)==true && pwd.equals(str_pwd)== true)
		{
			System.out.println("Welcome "+uid);
			System.exit(0);
		}
		else
		{
			ct++;
			if(ct<3)
			System.out.println("Wrong! Enter the username and password");
		}
		}while(ct<3);
			System.out.println("Contact Admin");
		
	}
}
