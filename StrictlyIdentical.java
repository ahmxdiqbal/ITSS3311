// Sample Run
//
// Enter 5 elements of list1: 1 2 3 4 5
// Enter 5 elements of list2: 1 2 3 4 5
// Two lists are strictly identical

// GitHub link
// https://github.com/xpulsor/ITSS3311


package assingments;

import java.util.Scanner; //imported the scanner to allow user to input

public class StrictlyIdentical {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] array1 = new int[5]; // created the array to store elements of list 1

		int[] array2 = new int[5]; // created the array to store elements of list 2
		
		System.out.print("Enter 5 elements of list1 (spaced): ");
		
		for(int i = 0; i < 5; i++) { // for loop created to store entered elements into arrays

			array1[i] = input.nextInt(); // each element entered is stored in the array

		}
		
		System.out.print("Enter 5 elements of list2 (spaced): ");
		
		for(int i = 0; i < 5; i++) { // for loop created to store entered elements into arrays

			array2[i] = input.nextInt(); // each element entered is stored in the array

			}
		
		
		  if (equals(array1, array2)) // boolean that uses the method below in an if/else statement
			  
			  System.out.println("Two lists are strictly identical");
		  
		  else
			  
			  System.out.println("Two lists are not strictly identical");
		
	}
		public static boolean equals(int[] array1, int[] array2) {
			
			if (array1 == null || array2 == null || array1.length!=array2.length) // This line makes sure array 1 and 2 are the same length and not null
				
			return false;
				
		for(int i = 0; i<array1.length; i++) { // for loop created to check if each element of array 1 and 2 matches
				 
			 if(array1[i] != array2[i]) { // actual function that checks if the elements are same element by element
					 
			 return false;
					 			
			 }
					 
		 }
    		return true;
	}

}
