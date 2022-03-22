package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 신입 사원(1946번)
 * 
 * @author gksrbdud
 *
 */
public class Practice3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for (int t = 0; t < testCase; t++) {
			int n = sc.nextInt();
			int[] person = new int[n + 1];
			for (int i = 0; i < n; i++) {
				int rankA = sc.nextInt();
				int rankB = sc.nextInt();
				person[rankA] = rankB;
			}
			int cnt = 1;
			int rankB = person[1];
			for (int i = 2; i <= n; i++) {
				if (rankB > person[i]) {
					rankB = person[i];
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
