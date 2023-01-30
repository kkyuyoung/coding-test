package etc;

import java.util.Arrays;
import java.util.Collections;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 과일 장수
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice30 {

	public static void main(String[] args) {
		int[] scroe = { 1, 2, 3, 1, 2, 3, 1 };

		System.out.println(solution(3, 4, scroe));

	}

	public static int solution(int k, int m, int[] score) {
		int answer = 0;

		Integer[] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(score2, Collections.reverseOrder());
		for (int i = 0; i < score2.length / m; i++) {
			int a = (m - 1) + (m * i);
			answer += score2[a] * m;
		}

		return answer;
	}
}