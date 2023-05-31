package etc;

import java.util.Stack;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 햄버거 만들기
 * 
 * @author gksrbdud
 *
 */
public class Practice45 {

	public static void main(String[] args) {
		int[] ingredient = { 2, 1, 1, 2, 3, 1, 2, 3, 1 };
		System.out.println(solution(ingredient));

	}

	public static int solution(int[] ingredient) {
		int answer = 0;

		Stack<Integer> inStack = new Stack<Integer>();

		for (int in : ingredient) {
			inStack.push(in);

			if (inStack.size() >= 4) {
				if (inStack.get(inStack.size() - 4) == 1 && inStack.get(inStack.size() - 3) == 2
						&& inStack.get(inStack.size() - 2) == 3 && inStack.get(inStack.size() - 1) == 1) {

					answer++;
					inStack.pop();
					inStack.pop();
					inStack.pop();
					inStack.pop();
				}
			}

		}

		return answer;
	}
}
