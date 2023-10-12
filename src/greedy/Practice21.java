package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 알바생 강호(1758번)
 * 
 * @author gksrbdud
 *
 */
public class Practice21 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long answer = 0;
		
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
		  arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		for(int i=0; i<arr.length; i++) {
			  int tip = arr[i];

			  if(tip>= i) {
			    answer += tip-(i);
			  }
			}
		
		System.out.println(answer);
	}
}
