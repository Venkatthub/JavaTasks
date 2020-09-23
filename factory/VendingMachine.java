package full.factory;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Machine product = new Machine();

		System.out.println("Welcome to Limitless Vending Factory !" + "\n\n" + "Available Items" + "\n\n" + "1. Coke \n"
				+ "2. Pepsi \n" + "3. Soda" + "\n\n");

		int choice;
		do {
			System.out.println("Enter your choice : \n");
			choice = scan.nextInt();
			switch (choice) {

			case 1:
				product.coke();
				break;
			case 2:
				product.pepsi();
				break;
			case 3:
				product.soda();
				break;

			}
			
			int n = scan.nextInt();
			
			if (n == 1) {
				
				product.getStatus();
		
			} else if (n == 2) {
			
				choice = 0;
				
			} else {
		
				System.out.println("\n" + "Enter a valid number !");
			
			}
		
		} while (choice == 0);

		System.out.println("\n\n" + "Quantity :");

		product.setQantity(scan.nextInt());

		double d, n;
		do {

			System.out.println("\n" + "Please insert coins :");
			d = scan.nextDouble();
			product.collectCoins(d);
			n = product.checkReceived();

		} while (n != 0);

		product.disburseItem();
		product.printBill();
		product.stop();

		scan.close();

	}

}
