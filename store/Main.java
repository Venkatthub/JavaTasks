package full.store;

import store.abstracts.Furniture;
import store.impl.Chair;
import store.impl.Sofa;
import store.impl.Store;
import store.impl.Table;

public class Main {
	
	public static void main(String[] args) {
		
		final Furniture c=new Chair(1000);
		final Furniture t=new Table(2500);
		final Furniture s=new Sofa(6000);
		Store customer=new Store("venkat","mumbai");
		
		c.furnDetails();
		t.furnDetails();
		s.furnDetails();
		
		customer.quantity(2, s);
		customer.billDetails();
		customer.deliveryDetails();
		
	}

}
