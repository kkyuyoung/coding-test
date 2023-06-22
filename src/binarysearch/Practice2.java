package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 > 이진 탐색 > 숫자 카드 2(10816번)
 * 
 * 
 * @author gksrb
 *
 */
public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			int key = sc.nextInt();
			int upper = upper(key, arr);
			int lower = lower(key, arr);
			System.out.print(upper-lower+" ");

		}
	}

	public static int lower(int target, int[] arr) {
		int start = 0;
		int end = arr.length;
		while (start < end) {
			int mid = (start + end) / 2;
			if (target <= arr[mid]) {
				end = mid;
				// 하한선을 내려줘서 target 왼쪽 값들 중
				// target 이상인 것들 중 가장 작은 인덱스 탐색
			} else {
				start = mid + 1;
			}

		}
		return end;

	}

	public static int upper(int target, int[] arr) {
		int start = 0;
		int end = arr.length;
		while (start < end) {
			int mid = (start + end) / 2;

			if (target < arr[mid]) {
				end = mid; // 하한선을 내려줘서 target 왼쪽 값들 중
				// target을 초과하는 값들 중 가장 작은 값/인덱스 찾아주기
			} else {
				start = mid + 1;
			}
		}
		return end;

	}

}