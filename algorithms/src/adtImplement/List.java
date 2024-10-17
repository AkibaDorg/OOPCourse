package adtImplement;
public class List {
	// capicity is arr's size
	// elesize is size of current elements in arr
	private int capacity;
	private int arr[];
	private int elesize;
	
	public List(int c) {
		this.capacity = c;
		this.arr = new int[c];
		this.elesize = 0;
	}
	// defaults to array size of 10
	public List() {
		this(10);
	}
	
	//TODO: add functions
	
	/**
	 * adds value to end of current array
	 * @param x value to add 
	 */
	public void add(int x) {
		arr[elesize] = x;
		elesize++;
	}
	
	
	/**
	 * adds value to a set index of array, shifting over the others
	 * @param x value to add
	 * @param pos index where x will be added to
	 */
	public void add(int x, int pos) {
		// check if either array is too full or pos is out of possible range
		try {
			if (this.elesize == 9) {
				throw new ArrFilled();
			}
			if (pos >= this.elesize || pos < 0) {
				throw new PositionOutOfArray();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// I feel this is HIGHLY wrong, but it works!
		int[] newarr = new int[this.capacity];
		
		for(int i = 0; i < pos; i++) {
			newarr[i] = this.arr[i];
		}
		
		newarr[pos] = x;
		
		for(int i = pos + 1; i <= this.elesize; i++) {
			newarr[i] = this.arr[i - 1];
		}
		
		this.arr = newarr;
		
		this.elesize++;
	}
	
	/**
	 * Removes a given index value from the array
	 * @param x
	 * @return value of index being removed
	 */
	public int Remove(int x) {
		try{
			if (x > this.elesize) {
				throw new PositionOutOfArray();
			}
			
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		int rmvele = arr[x];
		
		for (int y = x; y < this.elesize; y++) {
			this.arr[y] = this.arr[y+1];
		}
		
		this.elesize--;
		
		return rmvele;
	}
	
	/**
	 * Replaces value at index with new value
	 * @param pos index that will be changed
	 * @param x index value that will be changed
	 * @return false if can't be done at current index. returns true if index is valid and value was replaced
	 */
	public boolean Replace(int pos, int x) {
		if(pos > this.elesize - 1 || pos < 0) {
			return false;
		}
		
		this.arr[pos] = x;
		return true;
	}
	
	
	/**
	 * Checks if index value is present in array
	 * @param x value to be checked
	 * @return false if not found
	 */
	public boolean Contains(int x) {
		// we can't really gurantee the array will always be in order, so sequential search is the best
		for(int i = 0; i <= this.elesize; i++) {
			if(this.arr[i] == x) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * gets the length of current elements in array
	 * @return elesize, which is current length of elements in array
	 */
	public int getLength() {
		return this.elesize;
	}
	
	public boolean isEmpty() {
		if(this.elesize != 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/**
	 * generates a string that contains the array so far
	 * @return array as text, formated as "1, 2, 3, ... 6, 7, 8"
	 */
	public String toString() {
		String text = "";
		for(int i = 0; i < this.elesize - 1; i++) {
			text += this.arr[i] + ", ";
		}
		text += this.arr[this.elesize - 1];
		
		return text;
	}
}
