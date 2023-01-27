package etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > N번째 큰 수(2693번)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < 10; j++) {
				list.add(sc.nextInt());
			}

			list.sort(Comparator.reverseOrder());
			System.out.println(list.get(2));
		}

	}
}