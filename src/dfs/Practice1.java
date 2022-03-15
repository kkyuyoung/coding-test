package dfs;

import java.util.Scanner;

/**
 * 백준 > 깊이우선탐색 > 음식물 피하기
 * 
 * @author gksrbdud
 *
 */
public class Practice1 {

	public static int n, m, k, cnt, result;
	public static int[][] graph;
	public static boolean[][] visited;
	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };

	public static int dfs(int x, int y) {
		cnt++;
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx >= n || ny >= m)
				continue;

			if (graph[nx][ny] == 0)
				continue;

			if (graph[nx][ny] == 1 && !visited[nx][ny]) {
				dfs(nx, ny);
			}
		}

		return graph[n - 1][m - 1];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();

		graph = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < k; i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			graph[r - 1][c - 1] = 1;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (graph[i][j] == 1 && !visited[i][j]) {
					cnt = 0;
					dfs(i, j);
					result = Math.max(result, cnt); // Math.max : 두개의 값을 비교해서 제일큰값 return
				}
			}
		}
		System.out.print(result);
	}

}
