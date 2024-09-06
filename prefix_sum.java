
import java.util.*;

public class prefix_sum {
    public static void sum(int arr[]) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
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
