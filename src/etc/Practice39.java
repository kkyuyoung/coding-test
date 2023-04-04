package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 연속된 수의 합
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice39 {

	public static void main(String[] args) {
		int num = 3;
		int total = 12;

		int[] answers = solution(num, total);
		for (int answer : answers) {
			System.out.println(answer);
		}
	}

	public static int[] solution(int num, int total) {
		int[] answer = new int[num];
		int start = (total / num) - ((num - 1) / 2);

		for (int i = 0; i < num; i++) {
			answer[i] = start;
			start++;
		}

		return answer;
	}
}