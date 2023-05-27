package etc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 프로그래머스 코딩테스트 연습 > 2019 KAKAO BLIND RECRUITMENT > 실패율
 * 
 * @author gksrb
 *
 */
public class Practice42 {

	public static void main(String[] args) throws IOException {

		int N = 4;
		int[] stages = { 4, 4, 4, 4, 4 };

		int[] answer = solution(N, stages);
		for (int ans : answer) {
			System.out.println(ans);
		}
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

		Map<Integer, Double> map = new HashMap<>();

		for (int stage = 1; stage <= N; stage++) {

			double challengeCnt = 0;
			double notClearCnt = 0;

			for (int st : stages) {
				if (st >= stage) {
					challengeCnt++;
				}
				if (st == stage) {
					notClearCnt++;
				}
			}
			double failRate = challengeCnt == 0 ? 0 : notClearCnt / challengeCnt;

			map.put(stage, failRate);

		}

		Comparator<Map.Entry<Integer, Double>> entryComparator = Comparator.comparingDouble(Map.Entry::getValue);
		entryComparator = entryComparator.reversed().thenComparing(Map.Entry::getKey);

		List<Map.Entry<Integer, Double>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort(entryComparator);

		int i = 0;
		for (Map.Entry<Integer, Double> entry : entryList) {
			answer[i] = entry.getKey();
			i++;
		}

		return answer;
	}

}
