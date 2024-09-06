import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String str1 = "heart";
        String str2 = "earth";
        // change the string to lowercase so,we donot have to check for both uppercase
        // and lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // check wheater the length of the string are equal or not
        if (str1.length() == str2.length()) {
            // change the string to char array
            char char1array[] = str1.toCharArray();
            char char2array[] = str2.toCharArray();

            // sort the array
            Arrays.sort(char1array);
            Arrays.sort(char2array);
            // wheather two arrays are same or not
            boolean result = Arrays.equals(char1array, char2array);
            if (result) {
                System.out.print(str1 + " " + "and" + " " + str2 + " " + "are same. so they are anagram");
            } else {
                System.out.print(str1 + "and" + str2 + "are not same");
            }

        }
        // if the length is not same then there is not chance that they are anagram
        else {
            System.out.print(str1 + "and" + str2 + "are not same");
        }
    }
}