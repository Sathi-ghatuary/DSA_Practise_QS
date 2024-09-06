public class binarysearch {
    public static int search(int arr[], int n, int key) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparison
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                // left part
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 8 };
        int n = arr.length;
        int key = 8;
        System.out.println("search is found at index: " + search(arr, n, key));
    }

}
