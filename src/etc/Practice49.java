package etc;

/**
 * 
 * 프로그래머스 코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT > [1차] 다트 게임
 * 
 * @author gksrb
 *
 */
public class Practice49 {

	public static void main(String[] args) {
		int answer = solution("1S*2T*3S");
		System.out.println(answer);

	}

	public static int solution(String dartResult) {
		int answer = 0;

		int prevNum = 0;
		int currentNum = 0;

		int prev2 = 0;
		int current2 = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			char str = dartResult.charAt(i);

			// char이 숫자 타입인지 판별
			if (Character.isDigit(str)) {
				prevNum = currentNum;

				int number = Character.getNumericValue(str);

				if (number == 1 && Character.getNumericValue(dartResult.charAt(i + 1)) == 0) { // 10일 경우
					currentNum = 10;
					i++;
				} else {
					currentNum = number;
				}

			}
			if (str == 'S') {
				answer += currentNum;

				prev2 = current2;
				current2 = currentNum;
			}
			if (str == 'D') {
				answer += currentNum * currentNum;

				prev2 = current2;
				current2 = currentNum * currentNum;
			}
			if (str == 'T') {
				answer += currentNum * currentNum * currentNum;

				prev2 = current2;
				current2 = currentNum * currentNum * currentNum;
			}
			if (str == '*') {
				answer += current2 + prev2;

				prev2 = current2;
				current2 = current2 + prev2;
			}
			if (str == '#') {
				answer -= current2 + current2;

				prev2 = current2;
				current2 = -current2;
			}
		}

		return answer;
	}

}
