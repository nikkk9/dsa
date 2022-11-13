import java.util.ArrayList;
import java.util.Collections;

public class P4 {
    // Leaders in an array
    // Given an array A of positive integers. Your task is to find the leaders in
    // the array. An element of array is leader if it is greater than or equal to
    // all the elements to its right side. The rightmost element is always a leader.
    // Input:
    // n = 6
    // A[] = {16,17,4,3,5,2}
    // Output: 17 5 2

    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        int rmax = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= rmax) {
                al.add(arr[i]);
                rmax = arr[i];
            }
        }
        Collections.reverse(al);
        return al;
    }

}
