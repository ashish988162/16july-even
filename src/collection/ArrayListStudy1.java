package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy1 {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();//create object al------arrylist may be string ,charater.....object=generic arrylist it inclue all type of data type
      //NOW adding data
		al.add("PUNE");
		al.add(123);
		al.add("Pune");
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(123.55f);
		al.add('A');
		al.add(true);
		System.out.println(al);
		al.add(1, "katraj");//add add at 1 index
		System.out.println(al);
		//al.clear();//clear or remove all arraylist data
		//System.out.println(al);
		System.out.println(al.isEmpty());//is empty give true or false result
		System.out.println(al.contains(123.55f));//contains is match them give true otherwise false result
		
		Object al1 = al.clone();//create clone ofal and store
		System.out.println(al1);
		System.out.println(al.equals(al1));//is equal give true or false result
		System.out.println(al.get(0));//giving index number
		System.out.println(al.get(5));//giving index number
		System.out.println(al.indexOf('A'));//OUTPUT INDEX OF char.
		System.out.println(al.indexOf(true));//OUTPUT INDEX OF char
		System.out.println(al.remove(2));//remove karte jo index dila asal tithali word
		System.out.println(al);
		System.out.println(al.remove(true));
		System.out.println(al);
		System.out.println(al.remove(true));
		System.out.println(al.set(0, "Nagpur"));//for index value updation use set
		System.out.println(al);
		System.out.println(al.size());//size =number of element
		System.out.println("=================================");
		
		//ArrayList<Integer>al2=new ArrayList<>();//object use integer
		//al2.add(1);
		//al2.add(2);
		//al2.add(3);
		//al2.add(4);
		//System.out.println(al2);
		//System.out.println("=================================");
		
		//ArrayList<Character>al3=new ArrayList<>();//object use Character 
		//al3.add('a');
		//al3.add('v');
		
		//System.out.println(al3);
		System.out.println("==========for loop======================");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));//0 1 2 3 4 5
		}
		System.out.println("===========for each loop=================");
		for(Object a:al)//create loop variable & change object name al to a
		{
			System.out.println(a);
		}
		System.out.println("===========iterator=================");
		Iterator<Object> it = al.iterator();
		while(it.hasNext()) //two method use hasnext& next
		{
			System.out.println(it.next());
		}
		System.out.println("===========List-iterator=================");
		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())//call method with help of object
		{
		System.out.println(li.next());
		}
		
		
	}
}
