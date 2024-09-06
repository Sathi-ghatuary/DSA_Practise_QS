/*package whatever //do not write package name here */

public class reverseArray {
    public static void reverseArrayExtraArray(int[] originalArr) {
        int[] reversedArr = new int[originalArr.length];
        for (int i = 0; i < originalArr.length; i++) {
            reversedArr[i] = originalArr[originalArr.length - i - 1];
        }

        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i = 0; i < originalArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        reverseArrayExtraArray(originalArr);
    }
}
