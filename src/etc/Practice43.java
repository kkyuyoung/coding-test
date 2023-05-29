package etc;

/**
 * 프로그래머스 코딩테스트 연습 > Summer/Winter Coding(~2018) > 소수 만들기
 * 
 * @author gksrbdud
 *
 */
public class Practice43 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 7, 6, 4 };
		System.out.println(solution(nums));

	}

	public static int solution(int[] nums) {
		int answer = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k]; // 값을 담아
					boolean chk = sosu(num);
					if (chk) // 소수일 경우 answer 카운트
						answer++;

				}
			}

		}
		return answer;
	}

	public static boolean sosu(int num) {
		boolean check = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return check;
	}
}
