package full.arrays

import java.util.Scanner;

public class ReportCard {

	static private double[] marks = new double[subjects().length];
	static private double total;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Loop to store marks of each student

		for (int i = 1; i <= marks.length; i++) {

			try {

				System.out.println("Enter Student mark in " + subjects()[i - 1]);
				marks[i - 1] = scan.nextDouble();

				if (marks[i - 1] > 100) {

					i = 0;
					throw new MarksOutofBound("Entered mark is invaild ! \n\n" + "Please enter from begining");

				}
			} catch (MarksOutofBound e) {
				System.out.println(e.getMessage());
			}

		}

		for (double d : marks) {

			total += d;

		}

		System.out.println("Total marks :" + total );

		System.out.println("\n\n" + "Sorting the marks in Ascending order :");

		// Bubble Sort
		for (int i = 0; i < marks.length; i++) {

			for (int j = 0; j < marks.length; j++) {

				if (marks[i] < marks[j]) {
					double temp = marks[j];
					marks[j] = marks[i];
					marks[i] = temp;
				}

			}
		}

		for (double d : marks) {
			System.out.println(d);
		}

		scan.close();

	}

	static String[] subjects() {

		return new String[] { "English", "Tamil", "Maths", "Science", "Social Science" };

	}

}

class MarksOutofBound extends Exception {

	MarksOutofBound(String s) {

		super(s);

	}

}