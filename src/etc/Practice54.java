package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * 백준 > 3745번 오름세
 * 
 * @author gksrb
 *
 */
public class Practice54 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			
			int answer = 1;
			int[] arr = new int[n];
			
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (i != 0 && arr[i - 1] < arr[i]) {
					answer++;
				}
				if (i != 0 && arr[i - 1] >= arr[i]) {
					list.add(answer);
					answer = 1;
				}
			}
			
			Integer max = Collections.max(list);
			System.out.println(max);
		}
		sc.close();
	}

}
