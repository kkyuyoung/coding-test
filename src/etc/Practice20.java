package etc;

import java.util.HashMap;
import java.util.Map;

/**
 * 코딩테스트 연습 > 2022 KAKAO TECH INTERNSHIP > 성격 유형 검사하기
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice20 {

	public static void main(String[] args) {

		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };
		System.out.println(solution(survey, choices));
	}

	public static String solution(String[] survey, int[] choices) {
		Map<String, Integer> typeMap = new HashMap<>();
		typeMap.put("R", 0);
		typeMap.put("T", 0);
		typeMap.put("C", 0);
		typeMap.put("F", 0);
		typeMap.put("J", 0);
		typeMap.put("M", 0);
		typeMap.put("A", 0);
		typeMap.put("N", 0);

		Map<Integer, Test> choiceMap = new HashMap<>();
		Test test1 = new Test();
		test1.set("비동의", 3);
		Test test2 = new Test();
		test2.set("비동의", 2);
		Test test3 = new Test();
		test3.set("비동의", 1);
		Test test4 = new Test();
		test4.set("동의", 1);
		Test test5 = new Test();
		test5.set("동의", 2);
		Test test6 = new Test();
		test6.set("동의", 3);
		choiceMap.put(1, test1);
		choiceMap.put(2, test2);
		choiceMap.put(3, test3);
		choiceMap.put(5, test4);
		choiceMap.put(6, test5);
		choiceMap.put(7, test6);

		for (int i = 0; survey.length > i; i++) {
			String a = String.valueOf(survey[i].charAt(0)); // 비동의
			String b = String.valueOf(survey[i].charAt(1)); // 동의

			int choice = choices[i];
			Test test = choiceMap.get(choice);

			if (test != null) {
				String tt = test.getTt();
				Integer num = test.getNum();

				if (tt.equals("비동의")) {
					Integer defaultNum = typeMap.get(a);
					typeMap.put(a, num + defaultNum);
				}
				if (tt.equals("동의")) {
					Integer defaultNum = typeMap.get(b);
					typeMap.put(b, num + defaultNum);
				}
			}
		}

		String answer = "";

		if (typeMap.get("R") >= typeMap.get("T")) {
			answer += "R";
		} else {
			answer += "T";
		}

		if (typeMap.get("C") >= typeMap.get("F")) {
			answer += "C";
		} else {
			answer += "F";
		}

		if (typeMap.get("J") >= typeMap.get("M")) {
			answer += "J";
		} else {
			answer += "M";
		}

		if (typeMap.get("A") >= typeMap.get("N")) {
			answer += "A";
		} else {
			answer += "N";
		}

		return answer;
	}
}

class Test {
	private String tt;
	private Integer num;

	String getTt() {
		return tt;
	}

	Integer getNum() {
		return num;
	}

	void set(String tt, Integer num) {
		this.tt = tt;
		this.num = num;
	}
}
