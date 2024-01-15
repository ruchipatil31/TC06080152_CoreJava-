package session_10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<String,Integer>();
		h.put("Ruchi",700);
		h.put("Sam",600);
		h.put("Tom",300);
		h.put("John",500);
		System.out.println(h);
		
		System.out.println(h.put("Harsh",4000));
		System.out.println(h);
		
		Set s=h.keySet();        //return only keys
		System.out.println(s);
		
		Collection  c= h.values();  //return only values
		System.out.println(c);
		
		Set s1=h.entrySet();
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1= (Map.Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("Sam")) {
				m1.setValue(1400);
			}
		}
		System.out.println(h);
	}
}
