//import java.util.Scanner;
public class create {
    public static void printLetter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.print(name);
        // System.out.println(name.length());

        // string are immutable
        // concatenate
        String firstname = "Sathi";
        String lastname = "Ghatuary";
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);

        System.out.println(fullname.charAt(1));
        printLetter(fullname);
    }
}
