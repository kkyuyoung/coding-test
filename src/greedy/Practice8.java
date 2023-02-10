package greedy;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 코딩테스트 연습 > 2020 카카오 인턴십 > 키패드 누르기
 * 
 * @author gksrbdud
 *
 */
public class Practice8 {
	public static void main(String[] args) throws Exception {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		System.out.println(solution(numbers, hand));

	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";

		int left_x = 0;
		int left_y = 3;

		int right_x = 2;
		int right_y = 3;

		Map<Integer, String> xyMap = new HashMap<>();
		xyMap.put(1, "0,0");
		xyMap.put(2, "1,0");
		xyMap.put(3, "2,0");
		xyMap.put(4, "0,1");
		xyMap.put(5, "1,1");
		xyMap.put(6, "2,1");
		xyMap.put(7, "0,2");
		xyMap.put(8, "1,2");
		xyMap.put(9, "2,2");
		xyMap.put(0, "1,3");

		for (int i = 0; i < numbers.length; i++) {

			String xy = xyMap.get(numbers[i]);
			int x = Integer.parseInt(xy.split(",")[0]);
			int y = Integer.parseInt(xy.split(",")[1]);

			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				left_x = x;
				left_y = y;
				continue;
			}

			if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				right_x = x;
				right_y = y;
				continue;
			}

			int left_distance = Math.abs(left_x - x) + Math.abs(left_y - y);
			int right_distance = Math.abs(right_x - x) + Math.abs(right_y - y);

			if (left_distance == right_distance) {
				if (hand.equals("left")) {
					answer += "L";
					left_x = x;
					left_y = y;
				} else {
					answer += "R";
					right_x = x;
					right_y = y;
				}
			} else if (left_distance > right_distance) {
				answer += "R";
				right_x = x;
				right_y = y;
			} else {
				answer += "L";
				left_x = x;
				left_y = y;
			}
		}

		return answer;
	}
}
