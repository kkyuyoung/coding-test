package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 햄버거 분배(19941번)
 * 
 * @author gksrbdud
 *
 */
public class Practice19 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int cnt = 0;
		
		char[] arr = new char[n];
		arr = sc.next().toCharArray();
		for(int i=0; i<n; i++) {
			if(arr[i] == 'P') {
				boolean isEat = false;
				for(int j=i-k; j<=i-1; j++) {
					if(j<0 || j>=n) {
						continue;
					}					
					if(arr[j] == 'H') {
						cnt++;
						arr[j] = '0';
						isEat = true;
						break;
					}
				}
				if(!isEat) {
					for(int j=i+1; j<=i+k; j++) {
						if(j<0 || j>=n) {
							continue;
						}
						if(arr[j] == 'H') {
							cnt++;
							arr[j] = '0';
							break;
						}
					}
				}
			}
		}
		
		System.out.println(cnt);

		
	}
}
