
public class Addition {
	public int add(int a,int b)
	{
		return (a+b);
	}
	
	public void add(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Sum = "+sum);
	}
	
	public int add(int... a)
	{
		int count=a.length;
		int sum=0;
		System.out.println("Count = "+count);
		for(int i=0;i<a.length;i++)
		{
			sum=a[i];
		}
		
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		Addition a=new Addition();
		System.out.println("Addition = "+a.add(1,2,3));
		int sum=a.add(1,3,4,6,7,8);
		System.out.println("Sum ="+sum);
	}
}
