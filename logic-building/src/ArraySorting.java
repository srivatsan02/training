import java.util.Arrays;
import java.util.Iterator;

public class ArraySorting {

	public static void main(String[] args) {
		int[] ar = { 4, 2, 3, 1, 5 };
		for (int i : ar) {
			System.out.println(i);
		}
		System.out.println("--------------");

		long start = System.currentTimeMillis();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int x = (int) ar[i];
					ar[i] = ar[j];
					ar[j] = x;

				}

			}

		}
		long end = System.currentTimeMillis();
		System.out.println(end - start +" ms");

		for (int i : ar) {
			System.out.println(i);
			
		}
	}
}
