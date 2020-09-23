// Abstract classs with constructor
package project;

import java.util.Scanner;

public class CalculateSquare extends Square{	
	CalculateSquare(){
		super();
	}
public static void main(String[] args) {
	CalculateSquare obj=new CalculateSquare();
	}
}
abstract class Square {
	static int value;
	static int num;
	Square(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to be square :");
		num=scan.nextInt();
		value=num*num;
		System.out.println("square :"+ value);
		scan.close();
	}
	
}
