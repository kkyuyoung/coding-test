package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 > 이진 탐색 > 수 찾기(1920번)
 * 
 * 
 * @author gksrb
 *
 */
public class Practice1 {

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
			System.out.println(binarySearch(arr, sc.nextInt()));
			
		}
	}
	
	public static int binarySearch(int[] arr, int key) {
		 
		int lo = 0;					// 탐색 범위의 왼쪽 끝 인덱스
		int hi = arr.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스
 
		// lo가 hi보다 커지기 전까지 반복한다.
		while(lo <= hi) {
 
			int mid = (lo + hi) / 2;	// 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if(key < arr[mid]) {
				hi = mid - 1;
			}
			// key값이 중간 위치의 값보다 클 경우
			else if(key > arr[mid]) {
				lo = mid + 1;
			}
			// key값과 중간 위치의 값이 같을 경우
			else {
				return 1;
			}
		}
 
		// 찾고자 하는 값이 존재하지 않을 경우
		return 0;
 
	}


}