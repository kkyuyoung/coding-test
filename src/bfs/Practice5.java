package bfs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
 * 백준 > 너비우선탐색 > 안전영역(2468번)
 * 
 * @author gksrb
 *
 */
public class Practice5 {
	public static int n;

	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, 1, -1 };

	public static boolean[][] visited;
	public static int[][] map;

	public static void bfs(int a, int b) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(a, b));

		visited[a][b] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();
			int x = node.getX();
			int y = node.getY();

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= n || ny >= n || nx < 0 || ny < 0)
					continue;

				if (!visited[nx][ny]) {
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> num = new HashSet<>();
		n = sc.nextInt();
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				map[i][j] = sc.nextInt();
				num.add(map[i][j]);
			}
		}

		int result = 1; // 0->1로 수정...
		Iterator<Integer> a = num.iterator();
		while (a.hasNext()) {
			visited = new boolean[n][n];
			Integer key = a.next();
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (map[x][y] <= key) {
						visited[x][y] = true;
					}
				}
			}

			int cnt = 0;
			for (int x = 0; x < n; x++) {
				for (int y = 0; y < n; y++) {
					if (!visited[x][y]) {
						cnt++;
						bfs(x, y);
					}
				}
			}
			result = Math.max(result, cnt);
		}
		System.out.print(result);
	}
}
