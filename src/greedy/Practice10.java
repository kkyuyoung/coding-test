package greedy;

import java.util.Arrays;

/**
 * 프로그래머스 코딩테스트 연습 > Summer/Winter Coding(~2018) > 예산
 * 
 * @author gksrbdud
 *
 */
public class Practice10 {
	public static void main(String[] args) throws Exception {
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;
		System.out.println(solution(d, budget));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);

		for (int i = 0; i < d.length; i++) {
			if (budget - d[i] < 0)
				break;
			budget -= d[i];
			answer += 1;

		}
		return answer;
	}
}
