package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 월간 코드 챌린지 시즌3 > 나머지가 1이 되는 수 찾기
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice35 {

	public static void main(String[] args) {
		System.out.println(solution(10));

	}

	public static int solution(int n) {
		int answer = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}

		return answer;
	}

}