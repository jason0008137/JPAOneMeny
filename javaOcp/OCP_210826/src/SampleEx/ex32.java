package SampleEx;

import java.io.Console;

public class ex32
{
	public static void main(String[] args)
	{
		Console console = System.console();
		char[] pass = console.readPassword("Enter password:"); // line n1
		String password = new String(pass); // line n2

		for (char o : pass)
		{
			System.out.print(o);
		}
	}
}