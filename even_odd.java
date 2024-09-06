import java.util.*;

public class even_odd {
    public static void Odd_Even(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.print("Number is even");
        } else {
            System.out.print("Number is odd");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Odd_Even(n);

    }
}
