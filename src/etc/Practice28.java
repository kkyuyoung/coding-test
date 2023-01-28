package etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 최소, 최대(10818번)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		sc.close();

		list.sort(Comparator.naturalOrder());
		int a = list.get(0);
		int b = list.get(n - 1);

		System.out.println(a + " " + b);

	}
}