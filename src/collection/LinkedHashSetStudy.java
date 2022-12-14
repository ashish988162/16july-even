package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		lhs.add("Pune");
		lhs.add("Pune");
		lhs.add(123);
		lhs.add(null);
		lhs.add(null);
		lhs.add(113.212f);
		lhs.add('A');
		lhs.add(true);
		System.out.println(lhs);//order of insrtion is maintained
		//for each --> iterator
		//for each
		System.out.println("=======for each==============");
		for(Object lh:lhs)
		{System.out.println(lh);}
		// iterator
		System.out.println("=======iterator==============");
		Iterator<Object> it = lhs.iterator();
		while(it.hasNext())
		{System.out.println(it.next());}
					
	}

}
