package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법(Greedy) > 전자레인지(19402번)
 * 
 * @author gksrbdud
 *
 */

public class Practice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] oven = { 300, 60, 10 };
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < oven.length; i++) {
			if (oven[i] <= t) {
				if (i == 0) {
					a = t / oven[i];
				}
				if (i == 1) {
					b = t / oven[i];
				}
				if (i == 2) {
					c = t / oven[i];
				}
				t %= oven[i];
			}
		}

		if (t != 0) {
			System.out.print(-1);
		} else {
			System.out.print(a + " " + b + " " + c);
		}
	}

}
