package etc;

import java.util.Scanner;

/**
 * 백준 > 알람 시계(2884번)
 * 
 * @author gksrbdud
 *
 */
public class Practice3 {

	public static char[][] graph = new char[5][15];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else {
			if (h == 0)
				h = 24;
			System.out.println(h - 1 + " " + (60 + m - 45));
		}
	}
}
