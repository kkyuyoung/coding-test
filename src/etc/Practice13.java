package etc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 > 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
 * 
 * @author gksrbdud
 *
 */
public class Practice13 {

	public static void main(String[] args) {
		int[] numbers = { 2, 1, 3, 4, 1 };
		solution(numbers);
	}

	public static int[] solution(int[] numbers) {

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}

		}

		int[] answer = new int[set.size()];

		int i = 0;
		for (Integer num : set) {
			answer[i] = num;
			i++;
		}

		Arrays.sort(answer);

		return answer;
	}

}
