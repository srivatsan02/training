import java.util.Arrays;
public class BinarySearch {

    public int Linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i])
                return i;
        }
        return -1;
    }
    public int Binary(int[] arr, int target) {
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 56, 6, 34, 45, 67, 23 };
        int target = 67;
        BinarySearch s = new BinarySearch();
        System.out.println(s.Linear(arr, target));
        System.out.println(s.Binary(arr, target));
    }
}