import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		for (int i = arr.length - 1; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}