package etc;

import java.util.Scanner;

/**
 * 백준 > 구현 > 올림픽(8979번)
 * 
 * @author gksrbdud
 *
 */
public class Practice7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] map = new int[n][4];
		int[][] rank = new int[n][1];
		for (int i = 0; i < n; i++) {
			rank[i][0] = 1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 4; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int temp = 0;

		for (int i = 0; i < n; i++) {
			if (map[i][0] == k)
				temp = i;
		}

		int cnt = 1;

		for (int i = 0; i < n; i++) {
			if (temp == i)
				continue;

			int prevGeum = map[i][1];
			int prevEun = map[i][2];
			int prevDong = map[i][3];

			int Geum = map[temp][1];
			int Eun = map[temp][2];
			int Dong = map[temp][3];

			if (prevGeum > Geum) {
				cnt++;
			} else if (prevGeum == Geum) {
				if (prevEun > Eun)
					cnt++;
				else if (prevEun == Eun) {
					if (prevDong > Dong)
						cnt++;
				}
			}
		}

		System.out.print(cnt);

	}

}
