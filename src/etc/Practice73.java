package etc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 > 플러그(2010번)
 * 
 * 
 * @author gksrb
 *
 */
public class Practice73 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Integer[] arr = new Integer[n];
		for(int i=0; i<n; i++) {
		  arr[i] = sc.nextInt();
		}

		Arrays.sort(arr, Comparator.reverseOrder());

		int max = arr[0];

		int answer = 0;
		answer = max-(n-1);
		for(int i=1; i<n; i++) {
			answer += arr[i];
		}
		
		System.out.println(answer);
	}
}