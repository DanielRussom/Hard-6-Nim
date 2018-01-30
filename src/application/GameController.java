package application;

public class GameController {
	int stack1 = 3;
	int stack2 = 5;
	int stack3 = 7;

	public GameController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the stack1
	 */
	public int getStack1() {
		return stack1;
	}

	/**
	 * @param stack1
	 *            the stack1 to set
	 */
	public void setStack1(int stack1) {
		this.stack1 = stack1;
	}

	/**
	 * Decrement the first stack by the passed in amount
	 * 
	 * @param amount
	 *            - amount to decrement
	 */
	public void decrementStack1(int amount) {
		stack1 -= amount;
	}

	/**
	 * @return the stack2
	 */
	public int getStack2() {
		return stack2;
	}

	/**
	 * @param stack2
	 *            the stack2 to set
	 */
	public void setStack2(int stack2) {
		this.stack2 = stack2;
	}

	/**
	 * Decrement the second stack by the passed in amount
	 * 
	 * @param amount
	 *            - amount to decrement
	 */
	public void decrementStack2(int amount) {
		stack2 -= amount;
	}
	/**
	 * @return the stack3
	 */
	public int getStack3() {
		return stack3;
	}

	/**
	 * @param stack3
	 *            the stack3 to set
	 */
	public void setStack3(int stack3) {
		this.stack3 = stack3;
	}

	/**
	 * Decrement the third stack by the passed in amount
	 * 
	 * @param amount
	 *            - amount to decrement
	 */
	public void decrementStack3(int amount) {
		stack3 -= amount;
	}
}
