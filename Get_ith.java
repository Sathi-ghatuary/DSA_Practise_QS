import java.util.*;

public class Get_ith {
    public static int get(int n, int i) {
        int bit = 1 << i;
        if ((n & bit) == 0) {
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String[] args) {
        System.out.println(get(10, 2));
    }
}
