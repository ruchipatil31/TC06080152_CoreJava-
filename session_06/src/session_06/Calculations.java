package session_06;

public class Calculations extends CompareCal implements StaticCal, Factorial {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}
	
	@Override
	public int fact(int n) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}

	@Override
	public int avg(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b)/2;
	}
	
	
	
}
