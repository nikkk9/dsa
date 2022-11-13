public class P3 {
    // Sort an array of 0s, 1s and 2s
    // Input:
    // N = 5
    // arr[]= {0 2 1 2 0}
    // Output:
    // 0 0 1 2 2

    public static void sort012(int a[], int n) {
        // code here
        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (a[mid] == 0) {
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }

}
