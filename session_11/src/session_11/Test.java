package session_11;

public class Test {
	 public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //main
		System.out.println(Thread.currentThread().getThreadGroup().getName());  //main
		System.out.println(Thread.currentThread().getThreadGroup().getName());  //system
		
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName());  //main
		
		ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
		System.out.println(g2.getParent().getName()); //first group
	}
	}  // so there are total 5 threads running, t1,t2,t3 and main method thread and garbage collector thread