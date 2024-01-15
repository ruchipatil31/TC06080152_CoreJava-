package session_08;


import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
//		int no = 10;
//		Integer i = new Integer(no); //Primitive to Wrapper boxing
//		
//		int a = i.intValue(); //Wrapper to Primitive unboxing
	
//		int b = 100;
//		Integer m = b; // Auto-boxing
//		int c = m; // Auto-unboxing
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		//l.add("ABC");
		l.add(10);
		l.add(78);
		l.add(98);
		//l.add('a');
		//l.add(null);
		
		System.out.println(l);
		
//		l.add(2,56);
//		System.out.println(l);
//		
//		l.remove(1);
//		System.out.println();
//		
//		System.out.println(l.contains(100));
//		
//		List l1 = Collections.synchronizedList(l);
		
		l.add(46);
		l.add(56);
		System.out.println(l);
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext()) 
		{
			int n = i.next();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				i.remove();
			}
		}
		System.out.println(l);
		
		
	}
}
