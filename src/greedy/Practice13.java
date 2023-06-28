package greedy;

import java.util.Arrays;

/**
 * 프로그래머스 코딩테스트 연습 > 탐욕법(Greedy) > 구명보트
 * 
 * 
 * @author gksrbdud
 *
 */
public class Practice13 {
	public static void main(String[] args) throws Exception {

		int[] people = { 70, 50, 80, 50 };
		int limit = 100;

		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
		int answer = 0;

		Arrays.sort(people);

		for (int i = 0; i < people.length; i++) {
			int a = 0;
			if (i != people.length - 1) {
				a = limit - (people[i] + people[i + 1]);

				if (a >= 0) {
					i++;
				}
			}
			answer++;
		}

		return answer;
	}
}
