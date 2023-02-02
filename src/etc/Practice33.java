package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 크기가 작은 부분 문자열
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice33 {

	public static void main(String[] args) {
		System.out.println(solution("3141592", "271"));
	}

	public static int solution(String t, String p) {

		int answer = 0;

		int plength = p.length();
		Long pInt = Long.parseLong(p);

		// 1 ≤ p의 길이 ≤ 18, p의 길이 ≤ t의 길이 ≤ 10,000임
		// int타입 범위(10자리 초과x) 초과가능성이 있기 때문에 Long 타입으로 구현해야 함

		for (int i = 0; i <= t.length() - p.length(); i++) {
			Long tInt = Long.parseLong(t.substring(i, plength + i));
			if (tInt <= pInt)
				answer += 1;
		}

		return answer;
	}

}