public class Diagonal {
    public static int Matrix(int arr[][]) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // for (int j = 0; j < arr.length; j++) {
            // if (i == j) {
            // sum += arr[i][j];
            // } else if (i + j == arr.length - 1) {
            // sum += arr[i][j];
            // }
            // }
            sum += arr[i][i];
            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - i - 1];
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 4, 5, 6 }, { 4, 5, 6, 7 } };
        int Ans = Matrix(arr);
        System.out.print("The Diagonal Sum is" + " " + Ans);
    }
}
