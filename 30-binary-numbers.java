import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutio43n {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String bs = Integer.toBinaryString(n);// bs=Binary String
		char[] characters = bs.toCharArray();
		int max = 0;
		int temp = 0;

		for (int i = 0; i < characters.length; i++) {
			if (characters[i] == '1') {
				temp++;
				max = Math.max(temp, max);
			} else {
				temp = 0;
			}
		}
		System.out.println(max);
		in.close();
	}
}
