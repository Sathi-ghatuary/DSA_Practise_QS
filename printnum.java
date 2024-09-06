
import java.util.*;

public class printnum {
    public static void dec_num(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        dec_num(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        dec_num(n);
    }
}
