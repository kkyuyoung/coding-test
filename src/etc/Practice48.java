package etc;

/**
 * 
 * 프로그래머스 코딩테스트 연습 > 2018 KAKAO BLIND RECRUITMENT > [1차] 비밀지도
 * 
 * @author gksrb
 *
 */
public class Practice48 {

	public static void main(String[] args) {
		int n = 6;

		int[] arr1 = { 46, 33, 33, 22, 31, 50 };
		int[] arr2 = { 27, 56, 19, 14, 14, 10 };

		String[] answer = solution(n, arr1, arr2);
		for (String ans : answer) {
			System.out.println(ans);
		}
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			String bs = Integer.toBinaryString(arr1[i] | arr2[i]);
			if (bs.length() < n) {
				int a = bs.length();
				for (int j = 0; j < n - a; j++) {
					bs = "0" + bs; // 앞자리가 0인경우 잘리기 때문에 자릿수만큼 따로 추가해줘야함.
				}
			}
			bs = bs.replace("1", "#");
			bs = bs.replace("0", " ");

			answer[i] = bs;
		}

		return answer;
	}

}
