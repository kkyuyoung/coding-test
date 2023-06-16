package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 문서 검색(1543번)
 * 
 * @author gksrbdud
 *
 */
public class Practice14 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = 0;
		
		for(int i=n-1; i>=1; i--) {
			if(arr[i] == arr[i-1]) {
				arr[i-1] = arr[i-1]-1;
				answer++;
			} 
			if(arr[i] < arr[i-1]) {				
				answer += arr[i-1] - ( arr[i]-1);
				arr[i-1] = arr[i]-1;
			}
		}
		
		System.out.println(answer);
	}
}
