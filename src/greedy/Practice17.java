package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 라면 사기(18185번)
 * 
 * @author gksrbdud
 *
 */
public class Practice17 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				continue;
			else if (i <= n - 3 && arr[i + 1] > 0 && arr[i + 2] > 0) {
				while (arr[i] != 0 && arr[i + 1] != 0 && arr[i + 2] != 0) {
					arr[i] -= 1;
					arr[i + 1] -= 1;
					arr[i + 2] -= 1;

					answer += 7;
				}
			} else if (i <= n - 2 && arr[i + 1] > 0) {
				while (arr[i] != 0 && arr[i + 1] != 0) {
					arr[i] -= 1;
					arr[i + 1] -= 1;

					answer += 5;
				}
			} else if (i == n - 1 && arr[i] > 0 || i <= n - 2 && arr[i + 1] == 0) {
				while (arr[i] != 0) {
					arr[i] -= 1;

					answer += 3;
				}
			}
		}

		System.out.println(answer);
	}
}
