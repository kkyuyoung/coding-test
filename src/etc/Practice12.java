package etc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 프로그래머스 > 코딩테스트 연습 > 2022 KAKAO BLIND RECRUITMENT > 신고 결과 받기
 * 
 * @author gksrbdud
 *
 */
public class Practice12 {

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		System.out.println(solution(id_list, report, 2));

	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		// 1. report 중복 제거
		Set<String> reportSet = new HashSet<>();
		for (int i = 0; i < report.length; i++) {
			reportSet.add(report[i]);
		}

		// 2. 신고당한 id와 신고 회수 map에 저장
		Map<String, Integer> reportedMap = new HashMap<>();
		for (String map : reportSet) {
			String reportedId = map.split(" ")[1];
			reportedMap.put(reportedId, reportedMap.get(reportedId) == null ? 1 : reportedMap.get(reportedId) + 1);
		}

		// 3. 신고당한 횟수가 k이상일 경우 stopIdMap key에 신고자 id, value에 cnt+1 넣어줌
		Map<String, Integer> stopIdMap = new HashMap<>();
		for (String map : reportSet) {
			String reportedId = map.split(" ")[1];
			if (reportedMap.get(reportedId) != null && reportedMap.get(reportedId) >= k) {
				String reportId = map.split(" ")[0];
				stopIdMap.put(reportId, stopIdMap.get(reportId) == null ? 1 : stopIdMap.get(reportId) + 1);
			}
		}

		// 4. id_list 돌면서 stopIdMap에 값이 있으면 넣어주고 없으면 0
		int[] answer = new int[id_list.length];

		for (int i = 0; i < id_list.length; i++) {
			if (stopIdMap.get(id_list[i]) != null) {
				answer[i] = stopIdMap.get(id_list[i]);
			} else {
				answer[i] = 0;
			}
		}

		return answer;
	}

}
