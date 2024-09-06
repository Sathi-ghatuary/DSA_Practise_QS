public class largestnum {
    public static int search(int arr[], int largest, int n) {
        for (int i = 0; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 10, 12, 14, 20, 6 };
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        System.out.println("Largest number in the array is" + " " + search(arr, largest, n));
    }
}
