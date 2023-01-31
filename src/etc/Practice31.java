package etc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 가장 가까운 같은 글자
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice31 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("foobar")));
	}

	public static int[] solution(String s) {
		int[] answer = new int[s.length()];
		char[] chars = s.toCharArray();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {
			String str = String.valueOf(chars[i]);

			if (map.get(str) == null) {
				answer[i] = -1;
			} else {
				answer[i] = i - map.get(str);
			}

			map.put(str, i);
		}

		return answer;
	}

}