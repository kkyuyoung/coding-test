package greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 동전 0(11047번)
 * 
 * @author gksrbdud
 *
 */
public class Practice9 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> coinList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			coinList.add(sc.nextInt());
		}

		coinList.sort(Comparator.reverseOrder());

		int answer = 0;
		for (Integer coin : coinList) {
			if (k >= coin) {
				while (k - coin >= 0) {
					k -= coin;
					answer += 1;

				}
				if (k == 0)
					break;
			}
		}

		System.out.println(answer);

	}
}
