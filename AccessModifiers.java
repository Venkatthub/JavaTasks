package project;
import java.util.*;
public class AccessMod {
	public static String empName;
	public static int empId;
	
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		EmpSalary obj=new EmpSalary();
		System.out.println("Please enter Employee Name :");
		empName=scan.next();
		System.out.println("Please enter Employee Id :");
		empId=scan.nextInt();
		System.out.println("Please enter Employee Salary :");
		obj.setSal(scan.nextDouble());
		System.out.println("Do you want to know tax percentage (Y/N) :");
		String c=scan.next();
		switch(c) {
		case "y": System.out.println("Tax :" + obj.getTax()); break;
		case "n": System.out.println("Thank you !");break;
		}
scan.close();
	}
}
class EmpSalary{
	private double salary;
	private double tax;
	protected void setSal(double sal){
		this.salary=sal;
		setTsax();
	}
	protected double getSal() {
		return salary;
	}
	protected void setTsax(){
		this.tax=salary*15/100;
	}
	protected double getTax() {
		return tax;
	}
}