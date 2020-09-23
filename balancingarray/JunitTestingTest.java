package full.balancingarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestingTest {

	@Test
	void test() {

		int[] test1 = { 2, 5, 3, 9, 1 };
		int[] test2={ 34, 15, 20, 16, 1 ,52};
		
		JunitTesting t = new JunitTesting();
		boolean bool1 = t.canBalance(test1);
		boolean bool2 = t.canBalance(test2);
		assertEquals(true, bool1);
		assertEquals(true, bool2);

	}

}
