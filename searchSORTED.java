public class searchSORTED {
    public static boolean search(int arr[][], int key) {
        int row = 0;
        int col = arr.length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.print("Key is found at index :" + "(" + row + "," + col + ")");
                return true;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }

        }
        System.out.println("Oops! Key is not found");

        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 }, { 4, 5, 6, 7 } };
        int key = 1;
        System.out.println(search(arr, key));
    }
}
