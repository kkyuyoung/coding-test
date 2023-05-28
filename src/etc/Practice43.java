package etc;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 코딩테스트 연습 > 달리기 경주
 * 
 * @author gksrbdud
 *
 */
public class Practice43 {

	public static void main(String[] args) {

		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };

		String[] answer = solution(players, callings);

		for (String ans : answer) {
			System.out.println(ans);
		}

	}

	public static String[] solution(String[] players, String[] callings) {
		Map<String, Integer> playerIndexMap = new HashMap<>();

		for (int i = 0; i < players.length; i++) {
			playerIndexMap.put(players[i], i);
		}

		for (String call : callings) {
			Integer index = playerIndexMap.get(call);

			String prevPlayer = players[index - 1];
			String indexPlayer = players[index];

			players[index - 1] = players[index];
			players[index] = prevPlayer;

			playerIndexMap.put(indexPlayer, index - 1);
			playerIndexMap.put(prevPlayer, index);

		}

		return players;
	}

}
