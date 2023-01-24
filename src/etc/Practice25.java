package etc;

import java.util.Scanner;

/**
 * 백준 > 단어 뒤집기(9093번)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < t; i++) {
			String st = sc.nextLine();
			StringBuffer sb = new StringBuffer();
			String[] wordSplit = st.split(" ");
			for (String word : wordSplit) {
				StringBuffer wordSb = new StringBuffer(word);
				sb.append(wordSb.reverse() + " ");
			}

			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb);
		}

	}
}