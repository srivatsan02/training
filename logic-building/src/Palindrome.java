import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = console.next();
        System.out.println(checkPalindrome(word) ? "Palindrome" : "Not Palindrome");
    }

    private static boolean checkPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
