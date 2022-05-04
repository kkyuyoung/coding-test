package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 보석도둑(1202번)
 * 
 * @author gksrbdud
 *
 */
public class Practice6 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = 0;
		int[][] nn = new int[n][2];
		for (int i = 0; i < n; i++) {
			nn[i][0] = sc.nextInt();
			nn[i][1] = sc.nextInt();
		}

		Arrays.sort(nn, Comparator.comparingInt((int[] o) -> o[1]).reversed());

//
//		List<Integer> kList = new ArrayList<>();
//		for (int i = 0; i < k; i++) {
//			int kk = sc.nextInt();
//			kList.add(kk);
//		}

	}
}
