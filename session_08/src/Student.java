
import java.io.Serializable;

public class Student implements Serializable, Cloneable{

	private int rollNo;
	private String name;
	private transient float fees;
	
	public Student() {}
	
	public Student(int rollNo, String name, float fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s = new Student(2, "Aishwarya", 1200.89f);
		Student s1 = (Student) s.clone();
		System.out.println(s1);
		

	}
}
