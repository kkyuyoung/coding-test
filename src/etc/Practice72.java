package etc;

import java.io.IOException;
import java.util.Arrays;

/**
 * 프로그래머스 코딩테스트 연습 > 명예의 전당 (1)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice72 {
	public static void main(String[] args) throws IOException {
		int k = 4;
		int[] score = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };

		int[] answerArr = solution(k, score);
		for (int answer : answerArr) {
			System.out.println(answer);
		}
	}

	public static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];

		int[] list = new int[k];
		Arrays.fill(list, 2001);

		for (int i = 0; i < score.length; i++) {

			if (i < k) {
				list[i] = score[i];
			} else {
				if (score[i] > list[0]) {
					list[0] = score[i];
				}
			}

			Arrays.sort(list);
			answer[i] = list[0];
			
			// 명예의 전당 list[] 중 가장 점수가작은것을 answer에 += 해줘야함

		}

		return answer;
	}

}