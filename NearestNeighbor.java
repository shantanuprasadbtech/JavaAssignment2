public class NearestNeighbor {
	
	public static int findNearestNeighbor(int[] input) {
		int index = 0;
		int minValue = Math.abs(input[1] - input[0]); // Initialize minValue with the absolute difference between the first two elements in the array
		
		// Loop through each element in the array, calculate the absolute difference between the current element and its neighbor, and update index and minValue if necessary
		for (int i = 1; i < input.length - 1; i++) {
			int difference = Math.abs(input[i + 1] - input[i]);
			
			if (difference < minValue) { // If the absolute difference is smaller than the current minValue
				minValue = difference; // Update minValue to be the new absolute difference
				index = i; 
			}
		}
		return index;
	}
	
}
