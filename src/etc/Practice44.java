package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 숫자 짝꿍
 * 
 * @author gksrbdud
 *
 */
public class Practice44 {

	public static void main(String[] args) {
		System.out.println(solution("100", "2345"));

	}

	public static String solution(String X, String Y) {
		Map<String, Integer> xMap = new HashMap<>();
		Map<String, Integer> yMap = new HashMap<>();

		List<String> list = new ArrayList<>();

		for (String key : X.split("")) {
			xMap.put(key, xMap.getOrDefault(key, 0) + 1);
		}

		for (String key : Y.split("")) {
			yMap.put(key, yMap.getOrDefault(key, 0) + 1);
		}

		for (String key : xMap.keySet()) {
			if (!yMap.containsKey(key))
				continue;

			int length = Math.min(xMap.get(key), yMap.get(key));
			for (int i = 0; i < length; i++) {
				list.add(key);
			}
		}

		String result = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.joining());

		if (result.isEmpty())
			return "-1";
		if (result.replaceAll("0", "").isEmpty())
			return "0";
		return result;
	}
}
