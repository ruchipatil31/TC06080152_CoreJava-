package session_09;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetDemo {
	public static void main(String args[]) {
		//HashSet  h=new HashSet();             // insertion order is not preserved.....hashtable
		LinkedHashSet h = new LinkedHashSet();   //insertion order is preserved....linkedlist+hashtable
		h.add(10);
		h.add("A");
		h.add(2);
		h.add(10.2f);
		h.add(null);
		System.out.println(h.add(2)); //false
		System.out.println(h);
	}
} 
