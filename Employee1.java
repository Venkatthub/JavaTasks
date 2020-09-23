package project;

import java.util.Scanner;

public abstract class Employee1 {
	static Scanner scan=null;
abstract void salary();
static String login() {
	scan=new Scanner(System.in);
	// Logging in with the type
	System.out.println("Enter type of login : r / c");
	String type=scan.next();
	return type;
}
	public static void main(String[] args) {
		RegularEmp re=new RegularEmp();
		ContractEmp ce=new ContractEmp();
		scan=new Scanner(System.in);
		String empName;
		int empId;
		//Getting employee details
		System.out.println("Please enter Employee Name :");
		empName=scan.next();
		System.out.println("Please enter Employee ID :");
		empId=scan.nextInt();
		switch(login()) {
		case "r":
			re.empDetails(empName, empId);
			re.salary();
			break;
		case "c":
			ce.empDetails(empName, empId);
			ce.salary();
			break;
		}
	}
}
class RegularEmp extends Employee1{
	void empDetails(String name, int id) {
		System.out.println("Name \t Id \t Type");
		System.out.println("--------------------------");
				System.out.print(name+"\t");
				System.out.print(id+"\t");
				System.out.println("Regular");
	}
	void salary() {
		final double sal=25000.20;
		System.out.println("\n"+"Salary of Regular Employee is "+sal);
	}
}
class ContractEmp extends Employee1{
	void empDetails(String name, int id) {
		System.out.println("Name \t Id \t Type");
		System.out.println("--------------------------");
				System.out.print(name+"\t");
				System.out.print(id+"\t");
				System.out.println("Contract");
		}
void salary() {
	final double sal=20000.80;
	System.out.println("\n"+"Salary of Contract Employee is "+sal);
	}
}