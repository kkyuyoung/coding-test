package greedy;

import java.util.Scanner;

/**
 * 백준 > 문서 검색(1543번)
 * 
 * @author gksrbdud
 *
 */
public class Practice12 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String doc = sc.nextLine();
		String word = sc.nextLine();

		int answer = 0;
		for (int i = 0; i < doc.length(); i++) {
			if (doc.startsWith(word, i)) {
				i = i + word.length() - 1;
				answer++;
			}
		}

		System.out.println(answer);
	}
}
