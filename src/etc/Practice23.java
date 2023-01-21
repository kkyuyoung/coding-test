package etc;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 백준 > 엄청난 부자2(1271번)
 *
 * 
 * @author gksrbdud
 *
 */
public class Practice23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// n과 m의 범위가 int나 long의 범위를 넘기 때문에 BigInteger를 써야한다.
		BigInteger n = in.nextBigInteger();
		BigInteger m = in.nextBigInteger();

		System.out.println(n.divide(m));
		System.out.print(n.remainder(m));
	}
}