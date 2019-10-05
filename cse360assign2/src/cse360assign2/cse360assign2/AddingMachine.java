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
	private String historyOperator;
	private String historyNumber;
	
	/**
	 * Default constructor method with no parameter.
	 */
	public AddingMachine () {
		this.total = 0;  // not needed - included for clarity
		this.historyOperator = "";
		this.historyNumber = "";
	}

	/**
	 * Returns an int of the overall total operations done on the class.
	 * @return the total
	 */
	public int getTotal () {
		return this.total;
	}
	
	/**
	 * Arithmetic method that adds an integer to the total.
	 * @param value an integer
	 */
	public void add (int value) {
		this.total += value;
		this.historyOperator += "+";
		this.historyNumber += Integer.toString(value);
	}

	/**
	 * Arithmetic method that subtracts an integer from the total.
	 * @param value an integer
	 */
	public void subtract (int value) {
		this.total -= value;
		this.historyOperator += "-";
		this.historyNumber += Integer.toString(value);
	}

	/**
	 * Represents the overall arithmetic operation done on the class as a String,
	 * where '0' is the initial operand.
	 */	
	public String toString () {
		String returnString = "0";
		
		for(int traverse = 0; traverse < historyOperator.length(); traverse++)
		{
			if(historyOperator.charAt(traverse) == '+')
				returnString += " + " + historyNumber.charAt(traverse);
			else if(historyOperator.charAt(traverse) == '-')
				returnString += " - " + historyNumber.charAt(traverse);
			else
				throw new IllegalArgumentException();
		}
		
		return returnString;
	}

	/**
	 * Resets the total integer to it's original state, which is zero.
	 */
	public void clear() {
		this.total = 0;
		this.historyOperator = "";
		this.historyNumber = "";
	}
}