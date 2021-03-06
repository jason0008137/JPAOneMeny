package collectionEX;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1
{
	public static void main(String[] args)
	{
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");

		Iterator<String> i = l.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}

		for (String string : l)
		{
			System.out.println(string);
		}

		for (int j = 0; j < l.size(); j++)
		{
			System.out.println(l.get(j));
		}

	}
}
