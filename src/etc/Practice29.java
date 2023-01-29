package etc;

import java.util.Scanner;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 마법의 엘리베이터
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int storey = sc.nextInt();
		sc.close();
		System.out.println(solution(storey));

	}

	public static int solution(int storey) {
		int answer = 0;

		while (storey >= 10) {
			String st = Integer.toString(storey);

			Integer minus = (int) Math.pow(10, st.length() - 1);

			int a = st.charAt(0) - '0';

			storey = storey - (a * minus);
			answer += a;
		}
		if (storey != 0) {
			if (storey >= 6) {
				answer = answer + (11 - storey);
			} else {
				answer += storey;
			}
		}

		return answer;
	}
}