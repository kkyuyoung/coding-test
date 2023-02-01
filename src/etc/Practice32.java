package etc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 코딩테스트 연습 > 2023 KAKAO BLIND RECRUITMENT > 개인정보 수집 유효기간
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice32 {

	public static void main(String[] args) {
		String[] terms = { "A 6", "B 12", "C 3" };
		String[] privacies = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };

		System.out.println(solution("2022.05.19", terms, privacies));
	}

	public static int[] solution(String today, String[] terms, String[] privacies) {
		LocalDate todayDt = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"));

		Map<String, Integer> termMap = new HashMap<>();
		for (String term : terms) {
			String[] st = term.split(" ");
			termMap.put(st[0], Integer.parseInt(st[1]));
		}

		List<Integer> answerList = new ArrayList<>();
		for (int i = 0; i < privacies.length; i++) {
			String privacy = privacies[i];
			String[] st = privacy.split(" ");

			LocalDate date = LocalDate.parse(st[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"));
			Integer month = termMap.get(st[1]);

			date = date.plusMonths(month);

			if (todayDt.isAfter(date) || todayDt.isEqual(date)) {
				answerList.add(i + 1);
			}
		}

		int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}

}