import java.util.ArrayList;
import java.util.HashMap;

public class P1 {

    // Subarray with given sum
    // Input:
    // N = 5, S = 12
    // A[] = {1,2,3,7,5}
    // Output: 2 4

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here

        ArrayList<Integer> a = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        // <key=curSum, value=index>

        int start = 0, end = -1, curSum = 0;

        for (int i = 0; i < n; i++) {
            curSum += arr[i];
            if (curSum - s == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(curSum - s)) {
                start = map.get(curSum - s) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }

        if (end == -1) {
            a.add(-1);
        } else {
            start++;
            end++;
            a.add(start);
            a.add(end);
        }

        return a;
    }
}