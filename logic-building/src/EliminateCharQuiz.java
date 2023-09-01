public class EliminateCharQuiz {
    public static void main(String[] args) {
        String str = "Hello-Beautiful-World";
        String ch = "-";
        String result = eliminate(str, ch);
        System.out.println(result);
    }

    private static String eliminate(String str, String ch) {
        return str.replace(ch, "");
    }
}