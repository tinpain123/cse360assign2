package cse360assign2;

/**
 * Assignment 2: An arithmetic class AddingMachine() that has two operator methods--add and subtract--
 * as well as a getTotal() method to return the overall integer, and a toString to print the overall
 * operation
 * @author Tin_Pham
 * @ClassID 1216650968
 */
public class AddingMachine {

	private int total;
	
	/**
	 * Default constructor method with no parameter.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns an int of the overall total operations done on the class.
	 * @return the total
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Arithmetic method that adds an integer to the total.
	 * @param value an integer
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Arithmetic method that subtracts an integer from the total.
	 * @param value an integer
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Represents the overall arithmetic operation done on the class as a String,
	 * where '0' is the initial operand.
	 */
	public String toString () {
		return "";
	}

	/**
	 * Resets the total integer to it's original state, which is zero.
	 */
	public void clear() {
	
	}
}