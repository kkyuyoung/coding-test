package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 백준 > 탐욕법 > 스네이크버드(16435번)
 * 
 * @author gksrbdud
 *
 */
public class Practice25 {
	static int n, l, result;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s1 = br.readLine().split(" ");
		n = Integer.parseInt(s1[0]);
		l = Integer.parseInt(s1[1]);
		arr = new int[n];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if(l>=arr[i]) {
				l++;
			}
		}
		
		System.out.println(l);
	}
}
