package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 백준 > 너비우선탐색 > 섬의 개수(4963)
 * 
 * @author gksrbdud
 *
 */
public class Practice4 {
	public static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1 };
	public static int[] dy = { 0, 0, 1, -1, -1, 1, -1, 1 };

	public static boolean[][] visited;

	public static void bfs(int[][] map, int a, int b) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(a, b));
		int h = map.length;
		int w = map[h - 1].length;

		while (!q.isEmpty()) {
			Node node = q.poll();
			int x = node.getX();
			int y = node.getY();

			for (int i = 0; i < 8; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= h || ny >= w || nx < 0 || ny < 0)
					continue;

				if (map[nx][ny] == 1 && !visited[nx][ny]) {
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int cnt = 0;
			int w = sc.nextInt();
			int h = sc.nextInt();
			if (w == 0 && h == 0) {
				break;
			}
			int[][] map = new int[h][w];
			visited = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1 && !visited[i][j]) {
						cnt++;
						visited[i][j] = true;
						bfs(map, i, j);
					}
				}
			}
			System.out.println(cnt);
		}

	}
}
