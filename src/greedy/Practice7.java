package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 보석도둑(1202번)
 * 
 * @author gksrbdud
 *
 */
public class Practice7 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int result = 0;
		int[][] nList = new int[n][2];
		for (int i = 0; i < n; i++) {
			nList[i][0] = sc.nextInt();
			nList[i][1] = sc.nextInt();
		}

		Arrays.sort(nList, Comparator.comparingInt((int[] o) -> o[1]).reversed());

		int[] kList = new int[k];
		for (int i = 0; i < k; i++) {
			kList[i] = sc.nextInt();
		}

		Arrays.sort(kList);

		for (int i = 0; i < nList.length; i++) {

			for (int j = 0; j < kList.length; j++) {
				if (kList[j] >= nList[i][0] && kList[j] != -1) {
					result += nList[i][1];
					kList[j] = -1;
					break;

				}
			}

		}

		System.out.println(result);

	}
}
