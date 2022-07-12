package etc;

import java.util.HashMap;
import java.util.Map;

/**
 * 코딩테스트 연습 > 2021 Dev-Matching: 웹 백엔드 개발자(상반기) >로또의 최고 순위와 최저 순위
 *
 * @author gksrbdud
 *
 */
public class Practice14 {

	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };
		solution(lottos, win_nums);
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int sameCnt = 0;
		int zeroCnt = 0;

		for (int i = 0; i < lottos.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j])
					sameCnt++;
			}
			if (lottos[i] == 0)
				zeroCnt++;
		}

		Map<Integer, Integer> map = new HashMap<>();
		map.put(6, 1);
		map.put(5, 2);
		map.put(4, 3);
		map.put(3, 4);
		map.put(2, 5);
		map.put(1, 6);
		map.put(0, 6);

		int best = map.get(sameCnt + zeroCnt);
		int lowest = map.get(sameCnt);

		int[] answer = { best, lowest };

		return answer;
	}

}
