package session_10;

import java.util.PriorityQueue;

public class Test {
	public static void main(String[] args) {
		PriorityQueue q =new PriorityQueue();
		System.out.println(q.peek()); //null
		//System.out.println(q.remove()); returns no such element exception bcoz queue is empty
		for(int i=1;i<=10;i++) {
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.peek()); //return first element
		System.out.println(q.poll()); //removes first element
		System.out.println(q);
	}
}