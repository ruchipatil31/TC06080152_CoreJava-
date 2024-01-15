
public class Demo {
	public int d,m,y;
	
	public void initDate()
	{
		d=m=y=1;
	}
	
	public void setDate(int dd,int mm,int yy)
	{
		d=dd;
		m=mm;
		y=yy;
	}
	
	public void displayDate()
	{
		System.out.println("Date = ["+d+"/"+m+"/"+y+"]");
	}
	
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.displayDate();
		d.initDate();
		d.displayDate();
		d.setDate(17, 10, 2023);
		d.displayDate();
	}
}
