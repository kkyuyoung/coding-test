package bfs;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 코딩테스트 연습 >깊이/너비 우선 탐색(DFS/BFS) > 게임 맵 최단거리
 * 
 * @author gksrb
 *
 */
public class Practice6 {

	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { -1, 0, 1, 0 };
	static boolean[][] visited;
	static int[][] maps = { { 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 0, 1 },
			{ 0, 0, 0, 0, 1 } };
	static int n = maps.length, m = maps[0].length;

	public static void main(String[] args) throws IOException {
		visited = new boolean[n][m];
		System.out.println(bfs(0, 0, maps));
	}

	public static int bfs(int x, int y, int[][] maps) {
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y, 1));
		visited[x][y] = true;

		while (!q.isEmpty()) {
			Node node = q.poll();

			if (node.x == n - 1 && node.y == m - 1)
				return node.cnt;

			for (int i = 0; i < 4; i++) {
				int nx = node.x + dx[i];
				int ny = node.y + dy[i];
				if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
					if (maps[nx][ny] == 1 && !visited[nx][ny]) {
						visited[nx][ny] = true;
						q.offer(new Node(nx, ny, node.cnt + 1));
					}
				}
			}
		}
		return -1;
	}

	public static class Node {
		int x;
		int y;
		int cnt;

		public Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
}
