package session_04;

// Container : One object as a part of another object

public class Employee {

	private int empId;
	private String empName;
	private Date dt_of_joining;
	
	public Employee() {}

	public Employee(int empId, String empName, Date dt_of_joining) {

		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
	}

	@Override
	public String toString() {
		return "Employee [empId = " + empId + ", empName = " + empName + ", dt_of_joining = " + dt_of_joining + "]";
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee(111,"Ruchi",new Date(19,10,2023));
		System.out.println(e);
	}
}
