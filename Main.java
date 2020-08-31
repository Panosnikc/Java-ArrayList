//package dataStructures;


public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Create an Object numbers type Array with length: 3
		Array numbers = new Array(3);
		
		
		System.out.print("The length of the array is: ");
		numbers.size();
		
		// Insert data to our array
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		numbers.insert(60);
		numbers.insert(70);
		
		System.out.print("After inserting items in the array the length of the array is: ");
		numbers.size();
		
		// Print all the numbers of our array
		numbers.print();
		
		// Remove an item from array where index: 2
		numbers.removeAt(2);
		System.out.println("");
		
		// Return the indexOf(item: 10)
		System.out.println("\nThe index of 10 is: " + numbers.indexOf(10));
		
		System.out.print("The length of the array is: ");
		numbers.size();
		
		// Print data after change
		numbers.print();
		
	}

}



