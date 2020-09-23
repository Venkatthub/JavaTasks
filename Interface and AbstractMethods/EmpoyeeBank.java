package september;

public abstract class EmpoyeeBank{

	abstract void bankService(int i);

	void display(EmpDetails e) {
		String name = e.getName();
		System.out.println("\n Welcome !! " + name);
		System.out.println("\n Enter your choice : \n" + "1. Show balance \n" + "2. Deposit \n" + "3. Withdraw \n");
	}
}
