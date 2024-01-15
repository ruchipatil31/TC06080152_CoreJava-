
public class Student {
	
	private int rollNo;
	private String name;
	private static int count;
	
	public Student() {}
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	@Override
	public String toString() {
		return "Student [ rollNo = "+rollNo+", name = "+name+"]";
	}
	
	static
	{
		System.out.println("Static Block");
		count = 50;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		Student s1 = new Student(1,"Ruchi");
		Student s2 = new Student(2,"Sam");
		Student s3 = new Student(3,"Rahul");
		System.out.println("Student Count = "+Student.getCount());
		//System.out.println(s1.getCount());


	}
}
