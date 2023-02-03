package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 둘만의 암호
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice34 {

	public static void main(String[] args) {

		System.out.println(solution("aukks", "wbqd", 5));
	}

	public static String solution(String s, String skip, int index) {
		String answer = "";

		List<String> alphabetList = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));

		for (String alphabet : alphabetList) {
			if (skip.contains(alphabet)) {
				alphabetList = alphabetList.stream().filter(a -> !a.equals(alphabet)).collect(Collectors.toList());
			}
		}
		char[] sList = s.toCharArray();
		for (int i = 0; i < sList.length; i++) {

			String ss = Character.toString(sList[i]);
			int sIndex = alphabetList.indexOf(ss);
			int nextIndex = sIndex + index;

			while (nextIndex > alphabetList.size() - 1) {
				nextIndex -= alphabetList.size();
			}

			answer += alphabetList.get(nextIndex);

		}

		return answer;
	}

}