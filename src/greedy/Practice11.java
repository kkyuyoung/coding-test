package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 백준 > 강의실 배정(11000번)
 * 
 * @author gksrbdud
 *
 */
public class Practice11 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		// 2차원 배열 정렬(Java 8 이상) 첫번째 기준 오름차순
		Arrays.sort(arr, (o1, o2) -> {
			return o1[0] - o2[0];
		});

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.offer(arr[0][1]);
		for (int i = 1; i < n; i++) {
			if (queue.peek() <= arr[i][0]) {
				queue.poll();
			}
			queue.offer(arr[i][1]);
		}
		System.out.println(queue.size());
	}
}
