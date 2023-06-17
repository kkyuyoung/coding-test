package greedy;

import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 주식(11501번)
 * 
 * @author gksrbdud
 *
 */
public class Practice15 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int k = sc.nextInt();
			
			int[] arr = new int[k];
			for(int j=0; j<k; j++) {
				arr[j] = sc.nextInt();
				
			}
			
			long max = 0;
			long result = 0;
			
			
			for(int a=arr.length-1; a>=0; a--) {
				if(max < arr[a]) {
					max = arr[a];
				} else {
					result += max-arr[a];
				}
			}
			System.out.println(result);
		}
	}
}
