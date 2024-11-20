package shitot_t2;

import java.util.ArrayList;

/**
 * @author Shalev Cohen
 * @author Bari Cohen
 */
public class SharedData 
{
	/** An array of integers that holds shared data */
	private ArrayList<Integer> array = new ArrayList<>();
	/** a boolean array the stroes values indicating whether a solution has been found for each index in the array */
	private boolean [] winArray;
	/** A flag indicating whether a valid solution has been found by any thread  */
	private boolean flag;
	/** the target number that the user inputs */
	private final int b;
	
	/**
	 * 
	 * @param array - array of integers that the user inputs
	 * @param b - the length of the array that the user inputs
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}
	/**
     * 
     * @return the current winArray
     */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/**
     * Sets the winArray to the specified boolean array.
     *
     * @param winArray the boolean array to set as the winArray
     */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
     * Gets the integer array used for processing.
     * 
     * @return the array of integers that will be checked by the threads
     */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}
	/**
     * Gets the constant value `b`.
     *
     * @return the constant value `b` used for computation in the threads
     */
	public int getB() 
	{
		return b;
	}
	/**
     * Gets the flag value.
     * 
     * @return true if a solution has been found by any thread, false otherwise
     */
	public boolean getFlag() 
	{
		return flag;
	}
	
	/**
     * Sets the flag value.
     *
     * @param change the new value of the flag (true if a solution is found, false otherwise)
     */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
