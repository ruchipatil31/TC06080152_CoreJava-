package session_05;

public class D extends C{
	
	public D()
	{
		//super();
		System.out.println("Child Default");
	}
	
	public D(int a)
	{
		super(10);
		System.out.println("Child Parameterized");
	}
	
	public static void main(String[] args) {
		D d = new D(10);
	}
}
