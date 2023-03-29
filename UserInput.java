import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserInput {
	
	// declare instance variables
	static Scanner scan = new Scanner(System.in); // to read input from the user
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // to read array input from the user
	
	// method to get the operator from the user
	public int insertChoice() {
		System.out.println("\nEnter 1 for Odd and Even array: ");
		System.out.println("Enter 2 for index of least distance: ");
		System.out.println("Enter 3 for Array-ArrayList Conversion: ");
		
		// get operator input from the user
		int choice = scan.nextInt();
		
		// return the operator
		return choice;
	}
	public int[] insertArray() throws IOException {
		// ask the user to enter the size of the array
		System.out.println("Enter Total Numbers to Enter: ");
		int size_of_array = scan.nextInt();
		
		// ask the user to enter the numbers and then store them in a string
		System.out.println("Enter " + size_of_array + " Numbers: ");
		int[] input = new int[size_of_array];
		
		String array = "";
		try{
		array = br.readLine();
		} catch(IOException e) {
			System.out.println();
		}
		// split the string into individual numbers and store them in the numbers array
		String[] array_numbers = array.trim().split("\\s+");
		
		for (int i = 0; i < size_of_array; i++) {
			input[i] = Integer.parseInt(array_numbers[i]);
		}
		
		// return the array of numbers
		return input;
	}
	
	public int insertAnswer() {
		int answer = scan.nextInt();
		return answer;
	}
	
	public Integer[] ArrListArray() throws IOException {
		// ask the user to enter the size of the array
		System.out.println("Enter Total Numbers to Enter: ");
		int size_of_array = scan.nextInt();
		
		// ask the user to enter the numbers and then store them in a string
		System.out.println("Enter " + size_of_array + " Numbers: ");
		Integer[] input = new Integer[size_of_array];
		
		String array = "";
		try{
		array = br.readLine();
		} catch(IOException e) {
			System.out.println();
		}
		// split the string into individual numbers and store them in the numbers array
		String[] array_numbers = array.trim().split("\\s+");
		
		for (int i = 0; i < size_of_array; i++) {
			input[i] = Integer.parseInt(array_numbers[i]);
		}
		
		// return the array of numbers
		return input;
	}
	public static ArrayList<Integer> ArrayListInput() {
	ArrayList<Integer> list = new ArrayList<>();
    System.out.print("Enter the number of elements in the ArrayList: ");
    
	int n = scan.nextInt(); // Read the number of elements from the user input
    System.out.println("Enter the elements of the ArrayList:");
    
	// Iterate over each element of the ArrayList
    for (int i = 0; i < n; i++) {
        int element = scan.nextInt(); // Read the i-th element from the user input
        list.add(element);         // Add the element to the ArrayList
    }
    
	return list;
}

}
	

