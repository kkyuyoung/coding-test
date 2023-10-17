package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 블로그2(20365번)
 * 
 * @author gksrbdud
 *
 */
public class Practice22 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bCnt = 0;
		int rCnt = 0;
		
		String str = sc.next();
	
		for(int i=0; i<n; i++) {
			if(str.charAt(i) == 'B') {
				bCnt++;
			}
			if(str.charAt(i) == 'R') {
				rCnt++;
			}
		
		}

		if(rCnt >= bCnt) {
			System.out.println(bCnt + 1);
		} else {
			System.out.println(rCnt + 1);
		}
		
	}
}
