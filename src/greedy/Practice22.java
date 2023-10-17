package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 > 탐욕법 > 블로그2(20365번)
 * 
 * @author gksrbdud
 *
 */
public class Practice22 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String problem = br.readLine();
		int bCnt = 0;
		int rCnt = 0;
		char bf = '\0';
		for (int i = 0; i < n; i++) {
			char cur = problem.charAt(i);
			if (cur != bf) {
				if (cur == 'R')
					rCnt++;
				else
					bCnt++;
			}
			bf = cur;
		}
		System.out.println(Math.min(rCnt, bCnt) + 1);
	}
}
