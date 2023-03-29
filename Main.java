import java.io.*;
import java.util.*;



public class Main {
	// Declare variables
    static int[] input;                  
    static Integer[] arrListInput;       
    static ArrayList<Integer> list = new ArrayList<>();     
    static Integer[] ray;                

    public static void main(String[] args) throws Exception {
		// Create instances of different class
        UserInput userInput = new UserInput();         
        NearestNeighbor neigh = new NearestNeighbor(); 
        EvenOddArray even = new EvenOddArray();        
        ArrList gu = new ArrList();                    

        System.out.println("Enter Operator for Operation: ");

        int choice = userInput.insertChoice();     // Get the user's choice of operation

        switch (choice) {
            case 1:
                input = userInput.insertArray();    // Get the user's input array
                int[][] result = even.evenOddSeparate(input);   
                int[] evenResult = result[0];       
                int[] oddResult = result[1];        
                System.out.println("Even Array: " + Arrays.toString(evenResult));    // Print the even numbers
                System.out.println("Odd Array: " + Arrays.toString(oddResult));      // Print the odd numbers
                break;
            case 2:
                input = userInput.insertArray();    // Get the user's input array
                int index = neigh.findNearestNeighbor(input);   
                System.out.println("Index of first number is: " + index);    // Print the index of the first number
                break;
            case 3:
                System.out.println("Array to ArrayList (1) or ArrayList to Array (2)?");
                int answer = userInput.insertAnswer();  // Get the user's choice of conversion
                switch (answer) {
                    case 1:
                        arrListInput = userInput.ArrListArray();     // Get the user's input array
                        ArrayList<Integer> al = gu.ArrayToArrayListMethod(arrListInput);   
                        System.out.println(al);     // Print the ArrayList
                        break;
                    case 2:
                        ArrayList<Integer> list = userInput.ArrayListInput();     // Get the user's input ArrayList
                        ray = gu.ArrayListToArray(list);     
                        System.out.println(ray);    // Print the array
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice");     // If the user enters an invalid choice, print error message
        }
    }
}

