package etc;

import java.util.Scanner;

/**
 * 백준 > 구현 > 색종이(2563번)
 * 
 * @author gksrbdud
 *
 */
public class Practice6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();

		int[][] map = new int[100][100];

		for (int i = 0; i < cnt; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int a = x; a < x + 10; a++) {
				for (int b = y; b < y + 10; b++) {
					map[a][b] = 1;
				}
			}
		}

		int answer = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (map[i][j] == 1) {
					answer++;
				}
			}
		}

		System.out.println(answer);

	}

}
