import java.util.*;

public class reversetemp {
    public static void reverse(int arr[]) {
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 10, 3, 6 };

        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}