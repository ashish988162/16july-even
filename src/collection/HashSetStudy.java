package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		HashSet<Object>hs=new HashSet<>();
		hs.add("one");
		System.out.println(hs.add(999));//don't allow duplicate to check which value taking...
		//give printing sts.output is true then value taken 
		hs.add(null);//null value only one
		hs.add(null);
		System.out.println(hs.add(999));//don't allow duplicate to check which value taking...
		//give printing sts.output is false then value not taken
		hs.add('A');
		hs.add(true);
		System.out.println(hs);
		
		//set doesnot supports travsering using for loop
		//for each, iterator
		System.out.println("=======for each==============");
		//for each
		for(Object h:hs)
		{
			System.out.println(h);
		}
		//iterator
		System.out.println("=======iterator==============");
	    Iterator<Object> it = hs.iterator();
	    while(it.hasNext())
	    {System.out.println(it.next());}
		
	}

}
