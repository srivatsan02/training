public class LinearSearch {
    public static int search(int arr[], int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 13, 5, 9, 11, 22, 27, 15, 20 };
        int x = 22;
  
        int result = search(arr, arr.length, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index "+ result);
    }
}