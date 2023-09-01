import java.util.Scanner;

public class SortingStringQuiz {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = console.next();

        String result = sort(word);
        System.out.println("Sorted word: " + result);
    }

    private static String sort(String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        return new String(charArray);
    }
}