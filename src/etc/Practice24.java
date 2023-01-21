package etc;

import java.util.Scanner;

/**
 * 백준 > A/B(1008번)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// 오차 범위를 벗어나지 않게 하기 위해서 double형으로 출력
		double a = in.nextDouble();
		double b = in.nextDouble();

		System.out.println(a / b);
	}
}