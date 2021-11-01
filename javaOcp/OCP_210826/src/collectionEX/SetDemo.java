package collectionEX;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo
{
	public static void main(String[] args)
	{
//		Set<String> s = new HashSet<String>();
//		s.add("1");
//		s.add("2");
//		s.add("3");
//
//		Iterator<String> i = s.iterator();
//		while (i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//
//		for (String string : s)
//		{
//			System.out.println(string);
//		}

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("A", 1);// String = Key, Integer = Value
		hm.put("B", 2);
		hm.put("C", 3);
		hm.put("C", 100);

		System.out.println("size= " + hm.size());

		Set<String> keys = hm.keySet();

		Iterator<String> k = keys.iterator();
		while (k.hasNext())
		{
			String s = k.next();
			System.out.println(s + "\t" + hm.get(s));
		}

	}
}
