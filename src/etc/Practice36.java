package etc;

import java.util.Stack;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 택배상자
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice36 {

	public static void main(String[] args) {
		int[] order = { 4, 3, 1, 2, 5 };

		System.out.println(solution(order));
	}

	public static int solution(int[] order) {

		int answer = 0;
		Stack<Integer> assistance = new Stack<>();
		int i = 0;

		for (int box = 1; box <= order.length; box++) {
			if (order[i] != box) {
				assistance.add(box);
				continue;
			}

			i++;
			answer++;

			while (assistance.size() != 0 && order[i] == assistance.peek()) {
				assistance.pop();
				i++;
				answer++;
			}
		}

		return answer;
	}

}