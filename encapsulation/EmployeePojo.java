package project;

public class EmployeePojo {
	private String empName;

	@Override
	public String toString() {
		return "EmployeePojo [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
	}

	private int empId;
	private double salary;

	public void setName(String name) {
		this.empName = name;
	}

	public void setId(int id) {
		this.empId = id;
	}

	public void setSal(double sal) {
		this.salary = sal;
	}

	public String getName() {
		return empName;
	}

	public int getId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

}
