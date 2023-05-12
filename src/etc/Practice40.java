package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 백준 > 17298번: 오큰수
 * 
 * @author gksrb
 *
 */
public class Practice40 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] answer = new int[N];
		Stack<Integer> stack = new Stack<>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = N - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= A[i]) {
				// A[i]보다 작거나 같은 값들은 제거
				stack.pop();
			}

			if (stack.isEmpty()) {
				answer[i] = -1;
			} else {
				answer[i] = stack.peek();
			}

			stack.push(A[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(answer[i]).append(" ");
		}

		System.out.println(sb);
	}

}
