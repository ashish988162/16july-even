package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<>();
		ll.add(1222);
		ll.add("Pune");
		ll.add("Pune");
		ll.add(null);
		ll.add(null);
		ll.add(123);
		ll.add(true);
		ll.add('M');
		ll.add(123.3435f);
		System.out.println(ll);
		ll.add(2, "ashish");//add with help of index
		System.out.println(ll);
		ll.addFirst(55);//add at first only
		System.out.println(ll);
		ll.addLast("asalgaon");//add at last only
		System.out.println(ll);
		ll.offer(555);//add at last only
		System.out.println(ll);
		ll.offerFirst("akola");//Inserts the specified element at the front of this list.
		ll.offerLast("pcmc");//Inserts the specified element at the end of this list
		System.out.println(ll);
		System.out.println(ll.peek());//Retrieves, but does not remove, the head (first element) of this list

		System.out.println(ll);
		System.out.println(ll.peekFirst());//Retrieves, but does not remove, the first element of this list, or returns null if this list is empty
		System.out.println(ll);
		System.out.println(ll.peekLast());//Retrieves, but does not remove, the last element of this list, or returns null if this list is empty
		System.out.println(ll);
		System.out.println(ll.poll());//Retrieves and removes the head (first element) of this list.
		System.out.println(ll);
		System.out.println(ll.pollFirst());//Retrieves and removes the first element of this list, or returns null if this list is empty
		System.out.println(ll.pollLast());//Retrieves and removes the last element of this list, or returns null if this list is empty
		System.out.println(ll);
		System.out.println(ll.pop());// removes and returns the first element of this list. 
		System.out.println(ll);
		ll.push("apj");// inserts the element at the front of this list
		System.out.println(ll);
		System.out.println(ll.size());
		//for loop, for each, iterator, listIterator
		//for loop
		System.out.println("===========for loop=================");
		for(int i = 0;i<=ll.size()-1;i++)
		{System.out.println(ll.get(i));}//use .getmethod
		//for each
		System.out.println("===========for each loop=================");
		for(Object ll1:ll)//create new object ll1
		{System.out.println(ll1);}
		
		// iterator
		System.out.println("===========iterator=================");
		Iterator<Object> it = ll.iterator();//create reference element
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//listIterator
		System.out.println("===========List-iterator=================");
		ListIterator<Object> li = ll.listIterator();//create reference element
		while(li.hasNext())
		{System.out.println(li.next());}
	
		
	}

}
