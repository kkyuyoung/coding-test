package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 코딩테스트 연습 > 2019 KAKAO BLIND RECRUITMENT > 실패율
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice15 {

	public static void main(String[] args) {

		int n = 4;
		int[] stages = { 4, 4, 4, 4, 4 };
		System.out.println(solution(n, stages));
	}

	public static int[] solution(int N, int[] stages) {

		Map<Integer, Double> resultMap = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			double arriveStageNotClearCnt = 0;
			double arriveStageCnt = 0;
			for (int j = 0; j < stages.length; j++) {
				if (stages[j] >= i)
					arriveStageCnt++;
				if (stages[j] == i)
					arriveStageNotClearCnt++;
			}

			// 실패율
			double failRate = 0;
			if (arriveStageCnt != 0)
				failRate = arriveStageNotClearCnt / arriveStageCnt;

			resultMap.put(i, failRate);
		}
		List<Integer> listKeySet = new ArrayList<>(resultMap.keySet());

		// value 내림차순 정렬
		Collections.sort(listKeySet, (value1, value2) -> (resultMap.get(value2).compareTo(resultMap.get(value1))));

		// List to array
		int[] answer = listKeySet.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}
}
