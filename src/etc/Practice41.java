package etc;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 추억 점수
 * 
 * @author gksrb
 *
 */
public class Practice41 {

	public static void main(String[] args) throws IOException {

		String[] name = { "may", "kein", "kain", "radi" };
		int[] yearning = { 5, 10, 1, 3 };
		String[][] photo = { { "may" }, { "kein", "deny", "may" }, { "kon", "coni" } };
		
		int[] answer = solution(name, yearning, photo);
		for(int ans : answer) {
			System.out.println(ans);
		}
	}

	public static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int[photo.length];

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}

		for (int i = 0; i < photo.length; i++) {
			int sum = 0;
			for (int j=0; j<photo[i].length; j++) {
				sum += map.getOrDefault(photo[i][j], 0);
			}

			answer[i] = sum;
		}

		return answer;
	}

}
