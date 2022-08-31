package etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 코딩테스트 연습 > 2019 KAKAO BLIND RECRUITMENT > 오픈채팅방
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice18 {

	public static void main(String[] args) {

		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		System.out.println(solution(record));
	}

	public static String[] solution(String[] record) {
		Map<String, String> lastNickMap = new HashMap<>();
		for (String str : record) {
			String[] strArr = str.split(" ");

			if (strArr[0].equals("Enter") || strArr[0].equals("Change")) {
				String id = strArr[1];
				String nickName = strArr[2];

				lastNickMap.put(id, nickName);
			}
		}

		List<Map<String, String>> resultList = new ArrayList<>();
		for (String str : record) {
			String[] strArr = str.split(" ");

			if (strArr[0].equals("Enter") || strArr[0].equals("Leave")) {
				Map<String, String> resultMap = new HashMap<>();
				String id = strArr[1];
				String div = strArr[0];

				resultMap.put(id, div);
				resultList.add(resultMap);
			}
		}

		List<String> resultt = new ArrayList<>();

		for (Map<String, String> result : resultList) {
			Map.Entry<String, String> entry = result.entrySet().iterator().next();
			String id = entry.getKey();
			String div = entry.getValue();

			String lastNick = lastNickMap.get(id);

			if (div.equals("Enter"))
				resultt.add(lastNick + "님이 들어왔습니다.");

			if (div.equals("Leave"))
				resultt.add(lastNick + "님이 나갔습니다.");

		}

		String[] answer = resultt.toArray(new String[resultt.size()]);

		return answer;
	}
}
