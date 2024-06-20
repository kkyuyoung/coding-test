package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 백준 > bfs > 섬의 개수(4963번)
 * 
 * @author gksrb
 *
 */
public class Practice7 {
	static int w, h;
	static int[][] delta = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };

	public static void bfs(int[][] map, int x, int y) {
		Queue<int[]> q = new ArrayDeque<>();

		q.offer(new int[] { x, y });
		map[x][y] = 2;

		while (!q.isEmpty()) {
			int[] p = q.poll();

			// 8방 탐색
			for (int i = 0; i < 8; i++) {
				int nx = p[0] + delta[i][0];
				int ny = p[1] + delta[i][1];

				if (nx < h && nx >= 0 && ny < w && ny >= 0 && map[nx][ny] == 1) {
					q.offer(new int[] { nx, ny });
					map[nx][ny] = 2;
				}
			}
		}
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			int[][] map = new int[h][w];
			int cnt = 0;

			if (w == 0 && h == 0) {
				break;
			}

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// bfs
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (map[i][j] == 1) {
						bfs(map, i, j);
						cnt++;
					}
				}
			}

			System.out.println(cnt);

		}

		br.close();
	}
}