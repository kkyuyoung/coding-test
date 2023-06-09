package etc;

/**
 * 
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 푸드 파이트 대회
 * 
 * @author gksrb
 *
 */
public class Practice50 {

	public static void main(String[] args) {
		int[] food = {1,7,1,2};

		System.out.println(solution(food));
	}

	public static String solution(int[] food) {
		String answer = "";
		
		for (int i = 1; i < food.length; i++) {
			int foodCnt = food[i] / 2;
			if (foodCnt >= 1) {
				for (int j = 0; j < foodCnt; j++) {
					answer += i;
				}
			}
		}
		answer += "0";
		
		for(int i=answer.length()-2; i>=0; i--) {
			answer += answer.charAt(i);
		}

		return answer;
	}

}
