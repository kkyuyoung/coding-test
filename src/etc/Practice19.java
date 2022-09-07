package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 코딩테스트 연습 > 월간 코드 챌린지 시즌3 > 없는 숫자 더하기
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice19 {

	public static void main(String[] args) {

		int[] numbers = { 1, 3, 4, 5, 6, 7, 8 };
		System.out.println(solution(numbers));
	}

	public static int solution(int[] numbers) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		for (int i = 0; i < numbers.length; i++) {
			list.remove(Integer.valueOf(numbers[i]));

		}

		int answer = 0;
		for (Integer a : list) {
			answer += a;
		}

		return answer;
	}
}
