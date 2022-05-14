package etc;

import java.util.Scanner;

/**
 * 백준 > 시험 감독(13458번)
 * 
 * @author gksrbdud
 *
 */
public class Practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int b = sc.nextInt();
		int c = sc.nextInt();

		int result = 0;
		for (int i = 0; i < n; i++) {
			int num = arr[i];
			if (num <= b) {
				result += 1;
			} else {
				num -= b;
				result += 1;

				int ahr = num / c;
				int skajwl = num % c;
				if (skajwl == 0) {
					result += ahr;
				} else {
					result += ahr + 1;
				}
			}

		}

		System.out.print(result);
	}
}
