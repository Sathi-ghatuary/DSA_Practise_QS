

/**
 * max_min_Finder
 */
public class max_min_Finder {

    public static int max(int arr[], int N) {
        int max_value = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
            }
        }
        return max_value;

    }

    public static int min(int arr[], int N) {
        int min_value = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (arr[i] < min_value) {
                min_value = arr[i];
            }
        }
        return min_value;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 6, 9, 10, 4, 13 };
        int N = arr.length;
        System.out.println("Maximum Value:" + max(arr, N));
        System.out.println("Minimum valur:" + min(arr, N));
    }

}
