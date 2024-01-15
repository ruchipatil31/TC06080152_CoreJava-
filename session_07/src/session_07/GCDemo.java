package session_07;

public class GCDemo {

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Object Garbage Collector");
	}
	
	public static void main(String[] args) {
		
		GCDemo g1 = new GCDemo();
		GCDemo g2 = new GCDemo();
		GCDemo g3 = new GCDemo();
		
		// statements to be executed
		
		g1=null;
		g2=null;
		g3=null;
		System.gc();
	}
}
