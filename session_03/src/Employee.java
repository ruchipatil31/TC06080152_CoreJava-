
public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	
	public Employee()
	{
		System.out.println("Default Constructor Invoked");
	}
	
	public Employee(int empId,String empName,float empSal)
	{
		System.out.println("Parameter Constructor Invoked");
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public String toString()
	{
		return "Employee = ["+empId+" "+empName+" "+empSal+"]";
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println(e);
		
		Employee e1 = new Employee(111,"Ruchi",13999.56f);
		System.out.println(e1);
	}
}
