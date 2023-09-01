public class StaticticsQuiz {

    public static void main(String[] args) {
        int[] ar = {3, 8, 2, 5, 9, 4, 7};
        
        System.out.println("Sum: " + sum(ar));
        System.out.println("Max: " + Max(ar));
        System.out.println("Min: " + Min(ar));
        System.out.println("Avg: " + Avg(ar));
    }

    private static int sum(int[] ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    private static int Max(int[] ar) {
        int max = ar[0];
        for (int num : ar) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int Min(int[] ar) {
        int min = ar[0];
        for (int num : ar) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static double Avg(int[] ar) {
        int sum = sum(ar);
        return (double) sum / ar.length;
    }
}
