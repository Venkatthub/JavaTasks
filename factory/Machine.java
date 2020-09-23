package full.factory;

public class Machine implements Consumable {

	private double total;
	private double balance;
	private double totalReceived;
	private int quantity;
	private double productMrp;
	private String product;

	public void start() {
		System.out.println(
				"\n\n" + "The Item you have choosen is "+product+" !" + "\n" + "1. Confirm" + "\n" + "2. Change Item");
	}

	public void getStatus() {

		System.out.println(product + "Machine is Started ! Ready to use :");

	}

	@Override
	public void coke() {

		this.productMrp = 25.00;
		this.product = "Coke";
		System.out.println("Price :" + productMrp);
		start();
	}

	@Override
	public void pepsi() {

		this.productMrp = 35.00;
		this.product = "Pepsi";
		System.out.println("Price :" + productMrp);
		start();
	}

	@Override
	public void soda() {

		this.productMrp = 15.00;
		this.product = "Soda";
		System.out.println("Price :" + productMrp);
		start();
	}

	public void setQantity(int i) {
		this.quantity = i;
		setTotal();
	}

	public void setTotal() {
		total = productMrp * quantity;
		System.out.println("\n" + "Total amount to be paid :" + total + "$ \n");
	}

	public void collectCoins(double c) {

		double[] coinsAccepted = { 1, 5, 10, 25 };
		int n = coinsAccepted.length;

		// loop to Checking whether the inserted coin is acceptable
		for (int i = 0; i < n; i++) {

			if (c == coinsAccepted[i]) {
				totalReceived += c;
				System.out.println("Coin Added " + totalReceived + "$");
				return;

			}
		}

		System.out.println("\n" + "Insert Again" + "\n" + "Coins Accepted :" + "\n");

		for (int l = 0; l < n; l++) {

			System.out.print(coinsAccepted[l] + "$ \n");

		}
	}

	public double checkReceived() {
		if (totalReceived > total) {
			balance = totalReceived - total;
			return 0;
		}
		return 1;
	}

	public void disburseItem() {

		System.out.println("\n" + product + " is Dispensed");
		System.out.println("\n" + "Don't forget to collect your Balance amount " + balance + "$ and bill recepit !");

	}

	public void printBill() {

		System.out.println("Bill " + "\n" + "---------------------------" + "\n" + product + " * " + quantity + " = "
				+ total + "$ \n" + "Total amount paid :" + totalReceived + "$ \n" + "Balance :" + balance + "$");

	}

	public void stop() {

		System.out.println("\n\n" + "Machine Stopped ! Thank you Visit again !");

	}

}
