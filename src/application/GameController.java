package application;

public class GameController {
	int heap1 = 3;
	int heap2 = 5;
	int heap3 = 7;

	/**
	 * @return the heap1
	 */
	public int getHeap1() {
		return heap1;
	}

	/**
	 * @param heap1
	 *            the heap1 to set
	 */
	public void setHeap1(int heap1) {
		this.heap1 = heap1;
	}

	/**
	 * Decrement the first stack by the passed in amount
	 * 
	 * @param amount
	 *            - amount to decrement
	 */
	public void decrementHeap1(int amount) {
		heap1 -= amount;
	}

	/**
	 * @return the heap2
	 */
	public int getHeap2() {
		return heap2;
	}

	/**
	 * @param heap2
	 *            the heap2 to set
	 */
	public void setHeap2(int heap2) {
		this.heap2 = heap2;
	}

	/**
	 * Decrement the second stack by the passed in amount
	 * 
	 * @param amount
	 *            - amount to decrement
	 */
	public void decrementHeap2(int amount) {
		heap2 -= amount;
	}

	/**
	 * @return the heap3
	 */
	public int getHeap3() {
		return heap3;
	}

	/**
	 * @param heap3
	 *            the heap3 to set
	 */
	public void setHeap3(int heap3) {
		this.heap3 = heap3;
	}

	/**
	 * Decrement the third stack by the passed in amount
	 * 
	 * @param amount
	 *            - amount to decrement
	 */
	public void decrementHeap3(int amount) {
		heap3 -= amount;
	}
}
