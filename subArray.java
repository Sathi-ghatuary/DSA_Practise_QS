public class subArray {
    public static void search(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray:" + ts);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        search(arr);

    }
}
