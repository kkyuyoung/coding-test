package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 > 탐욕법(Greedy) > 30(10610번)
 * 
 * @author gksrbdud
 *
 */

public class Practice4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] charArr = sc.next().toCharArray();
		Arrays.sort(charArr);

		int sum = 0;
		StringBuilder sb = new StringBuilder(); // String으로 += 하면 시간초과
		for (int i = charArr.length - 1; i >= 0; i--) {
			sum += charArr[i];
			sb.append(charArr[i]);
		}
		if (charArr[0] != '0' || sum % 3 != 0) {
			System.out.print("-1");
		} else {
			System.out.println(sb);
		}

	}
}
