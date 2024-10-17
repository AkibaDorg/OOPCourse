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
	
	
	public void add(int x) {
		arr[elesize] = x;
	}
	
	public void add(int x, int pos) {
		try {
			if (elesize == 9) {
				throw new ArrFilled();
			}
			if (pos >= elesize || pos < 0) {
				throw new PositionOutOfArray();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		int temp = 
		for (int y = pos + 1; y <= this.capacity; y++) {
			
		}
		
		
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
		
		return rmvele;
	}
	
	/**
	 * Replaces value at index with new value
	 * @param pos index that will be changed
	 * @param x index value that will be changed
	 * @return false if can't be done at current index. returns true if index is valid and value was replaced
	 */
	public boolean Replace(int pos, int x) {
		
		return false;
	}
	
	
	/**
	 * Checks if index value is present in array
	 * @param x value to be checked
	 * @return false if not found
	 */
	public boolean Contains(int x) {
		
		return false;
	}
	
	public int getLength() {
		
		return 0;
	}
	
	public boolean isEmpty() {
		
		return false;
	}
	
	
	public String toString() {
		
		return "ha";
	}
}
