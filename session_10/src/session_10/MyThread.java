package session_10;

public class MyThread extends Thread {
	public void run() {
		//resource --running
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "
				+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		MyThread t1 = new MyThread();  //born state
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start(); //runnable state-waiting in queue in order to acquire a resource
		t2.start();
		t3.start();
	}
}
