public class substring {
    public static String sub(String str, int si, int ei) {
        String subst = "";
        for (int i = si; i < ei; i++) {
            subst += str.charAt(i);
        }
        return subst;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.print(sub(str, 0, 5));
    }
}
