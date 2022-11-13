public class P2 {

    // Missing number in array
    // Input:
    // N = 5
    // A[] = {1,2,3,5}
    // Output: 4
    int MissingNumber(int array[], int n) {
        // Your Code Here

        // using xor
        int res = 0;
        for (int i = 1; i <= n; i++)
            res ^= i;
        for (int i = 0; i < n - 1; i++)
            res ^= array[i];
        return res;
    }

}
