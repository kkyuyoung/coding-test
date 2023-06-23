package greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 로프(2217번)
 * 
 * @author gksrbdud
 *
 */
public class Practice16 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);

		int max = 0;
		for(int i=0; i<n; i++) {		
			max = Math.max(max, arr[i]*(n-i));
		}
		
		System.out.println(max);
	}
}
