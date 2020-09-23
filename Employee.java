package project;
import java.util.*;

public class Employee {
	String empName;
	int empId;
	String Designation="";
	Scanner scan=new Scanner(System.in);
	private Employee() {
		System.out.println("Please enter Employee Name :");
		empName=scan.next();
		System.out.println("Please enter Employee ID :");
		empId=scan.nextInt();
		}	
public static void main(String[] args) {
	Role obj;
	Employee e=new Employee();
	if(e.Designation.length()>0) {
		obj=new Role(e.Designation);
	}else {
		obj=new Role();
	}
	
	System.out.println("Name \t Id \t Department");
	System.out.println("--------------------------");
			System.out.print(e.empName+"\t");
			System.out.print(e.empId+"\t");
			System.out.print(obj.depart+"\t");			
}
}
class Role{
String depart;
	Role() {
		depart="All";
	}
	Role(String d){
		depart=d;
	}
	
}
