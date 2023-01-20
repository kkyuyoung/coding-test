package etc;

/**
 * 코딩테스트 연습 > 2022 KAKAO BLIND RECRUITMENT > 주차 요금 계산
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice21 {

	public static void main(String[] args) {

		String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
		int[] choices = { 5, 3, 2, 7, 5 };
		System.out.println(solution(choices, survey));

		String str = "blahblah";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
			System.out.println(str.charAt(i) + "개짜증나네");

		}
		System.out.println(result + "아니 와이라노 ㅡㅡ");
	}

	public static int[] solution(int[] fees, String[] records) {
		int[] answer = {};
		return answer;
	}
}