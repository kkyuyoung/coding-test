package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 월간 코드 챌린지 시즌1 > 내적
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice37 {

	public static void main(String[] args) {
		int[] a = { -1, 0, 1 };
		int[] b = { 1, 0, -1 };
		System.out.println(solution(a, b));
	}

	public static int solution(int[] a, int[] b) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}

		return answer;
	}

}