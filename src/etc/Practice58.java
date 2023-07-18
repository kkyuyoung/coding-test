package etc;

/**
 * 
 * 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 섞기
 * 
 * @author gksrb
 *
 */
public class Practice58 {

	public static void main(String[] args) {
		String answer = solution("aaaaa", "bbbbb");
		System.out.println(answer);
	}

	public static String solution(String str1, String str2) {
		String answer = "";
		
		for(int i=0; i<str1.length(); i++) {
			answer += str1.charAt(i);
			answer += str2.charAt(i);
		}
		
		return answer;
	}

}
