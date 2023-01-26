package etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 > 약수 구하기(2501번)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int sqrt = (int) Math.sqrt(n); // sqrt(): 제곱근을 구하는 함수
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= sqrt; i++) {
			if (n % i == 0) { // 약수 중 작은 수 저장
				arr.add(i);
				if (n / i != i) { // 약수 중 큰 수 저장(제곱근은 중복 되지않게 제외)
					arr.add(n / i);
				}
			}
		}
		// Java 8 이후 사용 가능
		arr.sort(Comparator.naturalOrder());

		int result = 0;
		if (arr.size() >= k) {
			result = arr.get(k - 1);
		}

		System.out.println(result);
	}
}