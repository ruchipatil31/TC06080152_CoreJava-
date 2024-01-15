package session_08;

import java.util.LinkedList;
import java.util.ListIterator;
import java.io.Serializable;
import java.util.RandomAccess;



public class LinkedListDemo {

	public static void main(String[] args) {
		
//		LinkedList l = new LinkedList();
//		l.add("ruchi");
//		l.add(50);
//		l.add(null);
//		l.add(50);
//		
//		
//		System.out.println(l);
//		
//		l.set(0, "sam");
//		System.out.println(l);
//		
//		l.removeLast();
//		System.out.println(l);
//		
//		l.addFirst(50);
//		System.out.println(l);
//		
//		l.add(0,30);
//		System.out.println(l);
//
//		
//		l.remove();
//		System.out.println(l);
//		
//		l.remove(0);
//		System.out.println(l);
//
//		
//		System.out.println(l instanceof Serializable);
//		System.out.println(l instanceof Cloneable);
//		System.out.println(l instanceof RandomAccess);
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("ruchi");
		l.add("sam");
		l.add("aishwarya");
		l.add("rahul");
		l.add("mayuri");
		
		System.out.println(l);
		
		ListIterator<String> itr = l.listIterator();
//		while(itr.hasNext())
//		{
//			String str = itr.next();
//			
//			if(str.equals("ruchi"))
//			{
//				itr.set("Priya");
//			}
//			if(str.equals("aishwarya"))
//			{
//				itr.add("Kiran");
//			}
//		}
		
		while(itr.hasNext())
		{
			String str = itr.previous();
			
			if(str.equals("ruchi"))
			{
				itr.set("Priya");
			}
			if(str.equals("aishwarya"))
			{
				itr.add("Kiran");
			}
		}
		
		System.out.println(l);


	}
}
