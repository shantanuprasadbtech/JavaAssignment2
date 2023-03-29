import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrList {
    public static ArrayList<Integer> ArrayToArrayListMethod(Integer[] ArrlistInput) {
        // Create a list from the input array
        List<Integer> list = Arrays.asList(ArrlistInput);
        // Create a new ArrayList from the list
        ArrayList<Integer> al = new ArrayList<>(list);
        // Return the ArrayList
        return al;
    }
    public static Integer[] ArrayListToArray(ArrayList<Integer> list) {
        // Create a new array with the same length as the input ArrayList
        Integer[] ray = new Integer[list.size()];
        // Iterate over each element of the input ArrayList
        for (int i = 0; i < list.size(); i++) {
            // Get the i-th element of the input ArrayList and store it in the i-th position of the new array
            ray[i] = list.get(i);
        }
        // Return the new array
        return ray;
    }
}
