package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
    /**
     * This method depicts that everytime a method is tested it will renew whatever we are creating inside it
     * @throws Exception
     */
	
	Counter counter;
	@BeforeEach
	void setUp() throws Exception {
		this.counter = new Counter();
	}

	@Test
	void testIncrement() {
		 // TODO
		
		assertTrue(this.counter.increment()==1);// This test case will check the incremented value is 1
		assertTrue(this.counter.increment()==2);// This test case will check the incremented value is 2
		
		this.counter.increment();
		assertFalse(this.counter.increment()==2,"Again it was incremented");// This test case will check the incremented value is 3
		
		assertEquals(4,this.counter.getcount());
		assertNotEquals(2,this.counter.getcount());
	}

	@Test
	void testDecrement() {
		assertTrue(this.counter.decrement()==-1);
		assertTrue(this.counter.decrement()==-2);
		
		this.counter.decrement();
		
		
		assertFalse(this.counter.decrement()==-2);
		
		assertEquals(-4,this.counter.getcount());
		assertNotEquals(-3,this.counter.getcount());
	}

}
