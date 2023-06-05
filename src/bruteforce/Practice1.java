package bruteforce;

/**
 * 프로그래머스 코딩테스트 연습 > 완전탐색 > 카펫
 * 
 * 
 * @author gksrb
 *
 */
public class Practice1 {

	public static void main(String[] args) {
	} 

	public static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];

		int total = brown + yellow;

		for (int i = 1; i <= total; i++) {
			if (total % i == 0) {
				int width = i;
				int height = total / width;

				if (width < height) {
					continue;
				}

				if (yellow == (width - 2) * (height - 2)) {
					answer[0] = width;
					answer[1] = height;
					return answer;
				}
			}
		}

		return answer;
	}

}