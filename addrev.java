import java.io.*;

class main{

	public static void main(String args[])
	{
		int T=0;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			T = Integer.parseInt(read.readLine());
		}
		catch(IOException ioexcep)
		{
			System.out.println("Exception Caught");
		}

		for(int i=0;i<T;i++)
		{	
			try
			{
				String[] data = read.readLine().split(" ");
				int a = Integer.parseInt(data[0]);
				int b = Integer.parseInt(data[1]);

				// http://stackoverflow.com/questions/2800739/how-to-remove-leading-zeros-from-alphanumeric-text
				String A = data[0].replaceFirst("^0+(?!$)", "");
				String B = data[1].replaceFirst("^0+(?!$)", "");

				// http://stackoverflow.com/questions/7569335/reverse-a-string-in-java
				int a_rev = Integer.parseInt(new StringBuilder(A).reverse().toString());
				int b_rev = Integer.parseInt(new StringBuilder(B).reverse().toString());

				a_rev = a_rev + b_rev;

				System.out.println(Integer.parseInt(new StringBuilder(Integer.toString(a_rev)).reverse().toString()));

			}
			catch(IOException ioexcep)
			{
				System.out.println("Here");
			}
		}

	}
}