public class P5 {

    // Equilibrium Point
    // Input:
    // n = 5
    // A[] = {1,3,5,2,2}
    // Output: 3
    // Explanation:
    // equilibrium point is at position 3
    // as elements before it (1+3) =
    // elements after it (2+2).

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if (n == 1) {
            return 1;
        }
        long sum = 0, totalSum = 0;
        int res = -1;

        for (int i = 0; i < n; i++)
            totalSum += arr[i];

        for (int i = 1; i < n; i++) {
            sum += arr[i - 1];

            if (totalSum - sum - arr[i] == sum) {
                res = i;
                break;
            }
        }

        return res == -1 ? -1 : res + 1;
    }

}
