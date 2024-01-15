package session_11;

public class MyThread2 extends Thread {
	public void run() {
		//resource -- running
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2(); //born state
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2(); 
		
		// naming the threads
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		// setting priority for thread b/w 1-10
		t2.setPriority(MAX_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
