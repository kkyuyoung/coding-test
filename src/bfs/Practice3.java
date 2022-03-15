package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 백준 > 너비우선탐색 > 토..토마토지롱ㅜ^ㅜ!!(7576)
 * 
 * @author gksrbdud
 *
 */
public class Practice3 {
	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, 1, -1 };
	public static int dayCnt = 0;
	public static int n = 0;
	public static int m = 0;
	public static int[][] map;
	public static Queue<Node> q = new LinkedList<>();

	public static int bfs() {
		while (!q.isEmpty()) {
			Node node = q.poll();
			int x = node.getX();
			int y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= n || ny >= m || nx < 0 || ny < 0)
					continue;

				if (map[nx][ny] == 0) {
					map[nx][ny] = map[x][y] + 1;
					dayCnt++;
					q.offer(new Node(nx, ny));
				}
			}
		}

		int result = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 0)
					return -1;
				result = Math.max(result, map[i][j]);
			}
		}

		// or 처음부터 최솟값이 1이면 return 0 하도록
		if (result == 1)
			return 0;
		else
			return result - 1;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();

		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
				if (map[i][j] == 1) {
					q.offer(new Node(i, j));
				}
			}
		}

		System.out.print(bfs());
	}
}
