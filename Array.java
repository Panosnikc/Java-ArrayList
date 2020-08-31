
//package dataStructures;

public class Array {


	private int[] items;
	private int count; 
	
	// Constructor Array
	public Array (int length) {
		items = new int[length];
	}
		
	// Method insert() to insert items
	public void insert(int item) {
		// If the array is full, resize it
		if (items.length == count) {
			// Create a new array (twice the size)
			int[] newItems = new int[count * 2];
			
			// Copy all the existing items
			for (int i = 0; i < count; i++)
				newItems[i] = items[i];
			
			// Set "items" to this new array
			items = newItems;
				
		}
		// Add the new item at the end
		 items[count++] = item;
	}

	// Method removeAt()
	public void removeAt(int index) {
		// Validate the index 
		if (index < 0 || index >= count)
			throw new IllegalArgumentException();
		
		// Shift the items to the left to fill the hole 
		for (int i = index; i < count; i++)
			items[i] = items[i + 1];
		
		// Shrink the array and delete the last item
		count--;
	}	
	
	// Method indexOf()
	public int indexOf(int item) {
		for (int i = 0; i < count; i++)
			if (items[i] == item)
				return i;  
			
		return -1;
	}
	
	// Method print() 
	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(items[i]);
	}

	// Size of array
	public void size() {	
		System.out.println(count);
	}
}
