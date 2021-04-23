package unitTesting;

public class Counter {

	
	/**
	 * Here we are creating a counter class 
	 */
	
	int counter =0;
	//counter variable
	/**
	 * increment method will return a incremented value
	 * @return
	 */
	public int increment() {
		this.counter++;
		
		return this.counter;
	}
	/**
	 * It will return decremented value
	 * @return
	 */
	public int decrement() {
		
		this.counter--;
		
		return this.counter; 
	}
	public int getcount() {
		
		return this.counter;
	}
	
}
