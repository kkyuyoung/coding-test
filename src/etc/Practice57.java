package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 코딩 기초 트레이닝 > 조건 문자열
 * 
 * @author gksrb
 *
 */
public class Practice57 {
	public static void main(String[] args) {
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		int answer = solution(ineq, eq, n, m);
		System.out.println(answer);
	}

	public static int solution(String ineq, String eq, int n, int m) {
		int answer = 0;

		if (ineq.equals("<") && eq.equals("=")) {
			if (n <= m) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		if (ineq.equals("<") && eq.equals("!")) {
			if (n < m) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		if (ineq.equals(">") && eq.equals("=")) {
			if (n >= m) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		if (ineq.equals(">") && eq.equals("!")) {
			if (n > m) {
				answer = 1;
			} else {
				answer = 0;
			}
		}
		return answer;
	}
}