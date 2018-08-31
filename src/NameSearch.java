import java.io.*;
public class NameSearch 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String db[] = {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam",
				"Ayan","Dev","Kity","Meery","Smith","Johnson","Bil","Williams","Jones",
				"Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson","Dave"};
		System.out.println("Enter the name to search");
		String str = br.readLine();
		int ct=0;
		for(int i=0;i < db.length; i++)
		{
			if(str.equalsIgnoreCase(db[i]))
			{
				ct++;
			}
		}
		if(ct>0)
		{
			System.out.println("Name found");
			System.out.println("Number of occurences " + ct);
		}
		else
			System.out.println("Name not found");
	}
}
