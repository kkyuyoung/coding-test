package etc;

import java.util.Scanner;

/**
 * 백준 > 알파벳 개수(10808번)
 * 
 * @author gksrb
 *
 */
public class Practice59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] charArr = sc.next().toCharArray();
		
		int cntList[] = new int[26];
		for(int asci : charArr) {
			cntList[asci-97] += 1;
		}
		
		for(int cnt : cntList) {
			System.out.print(cnt+" ");
		}
	
	}
}