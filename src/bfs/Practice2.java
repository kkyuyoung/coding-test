package bfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 백준 > 너비우선탐색 > 단지번호붙이기(2667번)
 * 
 * @author gksrbdud
 *
 */
public class Practice2 {

	public static int n;
	public static int[][] graph = new int[26][26];
	public static boolean[][] visited = new boolean[26][26];
	public static int[] dx = { -1, 1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };
	public static ArrayList<Integer> cntArr = new ArrayList<>();

	public static void bfs(int x, int y) {
		Queue<Node> q = new LinkedList<>();

		q.offer(new Node(x, y));

		int cnt = 1;
		while (!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || ny < 0 || nx >= n)
					continue;

				if (graph[nx][ny] == 0)
					continue;

				if (graph[nx][ny] == 1 && !visited[nx][ny]) {
					cnt++;
					visited[nx][ny] = true;
					q.offer(new Node(nx, ny));
				}
			}
		}

		cntArr.add(cnt);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < n; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (graph[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					bfs(i, j);
				}
			}
		}

		System.out.println(cntArr.size());

		Collections.sort(cntArr);
		for (int cnt : cntArr) {
			System.out.println(cnt);
		}

	}

}
