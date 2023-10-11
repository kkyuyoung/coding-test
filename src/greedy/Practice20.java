package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 에너지 드링크(20115번)
 * 
 * @author gksrbdud
 *
 */
public class Practice20 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];

		double answer = 0;
		for(int i=0; i<n; i++) {
		  arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Comparator.reverseOrder());
		for(int i=0; i<n; i++) {
			if(i == 0) {
				answer = arr[i];
			} else {
				answer += (double)arr[i]/2;
			}
		}
		System.out.println(answer);
	}
}
