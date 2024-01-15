package session_05;

//public final class A cannot be inherited

public class A {

	final int a; //cannot change its value
	
	public A()
	{
		a=100;
	}
	
	public final void get() //cannot be overridden
	{
		System.out.println("In get() of A");
	}
}
