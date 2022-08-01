package etc;

/**
 * 코딩테스트 연습 > 2021 KAKAO BLIND RECRUITMENT > 신규 아이디 추천
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice16 {

	public static void main(String[] args) {

		String new_id = "abcdefghijklmn.p";
		System.out.println(solution(new_id));
	}

	public static String solution(String new_id) {

		String answer = new_id.toLowerCase(); // 1단계

		answer = answer.replaceAll("[^a-z0-9-_.]", ""); // 2단계 [^] <-^가 제외

		answer = answer.replaceAll("[.]{2,}", "."); // 2번이상..이면 [.]{2,} // 3단계

		answer = answer.replaceAll("^[.]|[.]$", ""); // 4단계

		// 5단계
		if (answer.equals("")) {
			answer = "a";
		}

		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
			if (answer.substring(answer.length() - 1).equals(".")) {
				answer = answer.substring(0, 14);
			}
		}

		// 7단계
		if (answer.length() <= 2) {
			String str = answer.substring(answer.length() - 1);
			while (answer.length() < 3) {
				answer += str;
			}
		}

		return answer;
	}
}
