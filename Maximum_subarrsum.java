public class Maximum_subarrsum {
    public static void sum(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += arr[k];
                }
                if (max < curr) {
                    max = curr;
                }
            }
        }
        System.out.println("Maximum Subarray Sum:" + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        sum(arr);
    }
}
