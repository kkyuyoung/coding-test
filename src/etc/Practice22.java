package etc;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 시소 짝꿍
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice22 {

	public static void main(String[] args) {
		int[] weights = { 100, 180, 360, 100, 270 };

		System.out.println(solution(weights));
	}

	public static long solution(int[] weights) {
		long answer = 0;
		Map<Integer, Integer> sitter = new HashMap<>();
		Map<Integer, Integer> original = new HashMap<>();

		for (int weight : weights) {
			answer += sitter.getOrDefault(weight * 2, 0);
			answer += sitter.getOrDefault(weight * 3, 0);
			answer += sitter.getOrDefault(weight * 4, 0);

			// 몸무게가 같은 경우 위에서 3번 카운트 되었기 때문에 2를 뺴줘야함
			answer -= 2L * original.getOrDefault(weight, 0);

			// 2m,3m,4m의 케이스를 몸무게에 곱하고(key) 횟수 카운트(value)
			sitter.put(weight * 2, sitter.getOrDefault(weight * 2, 0) + 1);
			sitter.put(weight * 3, sitter.getOrDefault(weight * 3, 0) + 1);
			sitter.put(weight * 4, sitter.getOrDefault(weight * 4, 0) + 1);

			// original에는 원래 몸무게(key)가 나온 횟수(value)를 기록함
			original.put(weight, original.getOrDefault(weight, 0) + 1);
		}
		return answer;
	}
}