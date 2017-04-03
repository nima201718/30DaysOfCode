
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcase = in.nextInt();
		String input[] = new String[testcase];
		for (int i = 0; i < testcase; i++) {

			input[i] = in.next();
		}
		for (int i = 0; i < testcase; i++) {
			String str[] = input[i].split("(?!^)");
			ArrayList even = new ArrayList();
			ArrayList odd = new ArrayList();

			for (int j = 0; j < str.length; j++) {
				if (j % 2 == 0) {
					even.add(str[j]);
				} else {
					odd.add(str[j]);
				}
			}
			Iterator iter_even = even.iterator();
			Iterator iter_odd = odd.iterator();
			while (iter_even.hasNext()) {
				System.out.print(iter_even.next());
			}
			System.out.print("  ");
			while (iter_odd.hasNext()) {
				System.out.print(iter_odd.next());
			}
			System.out.println();
		}
		in.close();
	}
}