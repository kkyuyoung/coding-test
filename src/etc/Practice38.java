package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 월간 코드 챌린지 시즌2 > 음양 더하기
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice38 {

	public static void main(String[] args) {
		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };
		System.out.println(solution(absolutes, signs));
	}

	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i])
				answer += absolutes[i];
			else
				answer -= absolutes[i];
		}

		return answer;
	}
}