package session_09;

import java.util.TreeSet;
public class TreeSetDemo {
	public static void main(String args[]) {
		TreeSet<Integer>t = new TreeSet<Integer>(new MyComparator());
//			t.add("A");    //string class internally implements sorting
//			t.add("a");
//			t.add("B");
//			t.add("Z");
//			t.add("M");
//			System.out.println(t);
			
			//t.add(10); //ClassCastException
			//t.add(null); //NullPointerException, can't invoke comparable bcoz element is null 
			
//		t.add(new StringBuilder("A"));
//		t.add(new StringBuilder("a"));
//		t.add(new StringBuilder("B"));
//		t.add(new StringBuilder("K"));
//		t.add(new StringBuilder("A"));
//		
//		System.out.println(t);
		
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);		
		System.out.println(t);
	}
}