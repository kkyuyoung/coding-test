package dfs;

/**
 * 
 * 코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) > 타겟 넘버
 * 
 * 
 * @author gksrbdud
 *
 */
public class Practice2 {

	public static int answer = 0;

	public static void dfs(int[] numbers, int target, int sum, int depth) {
		if (numbers.length == depth) {
			if (target == sum)
				answer++;
		} else {
			dfs(numbers, target, sum + numbers[depth], depth + 1);
			dfs(numbers, target, sum - numbers[depth], depth + 1);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		dfs(numbers, target, 0, 0);
		System.out.println(answer);
	}

}
