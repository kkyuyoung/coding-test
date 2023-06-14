package dp;

import java.util.Scanner;

/**
 * 백준 > 동적계획법(dp) > 피보나치 수 2
 * 
 * 
 * @author gksrb
 *
 */
public class Practice1 {

	static long[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dp = new long[n + 1]; // default값 0으로 들어감.
		System.out.println(fibo(n));

	}

	static long fibo(int x) {
		if (x <= 1)
			return x;
		if (dp[x] != 0)
			return dp[x]; // dp배열안에 값이 있으면 값 반환
		else
			return dp[x] = fibo(x - 1) + fibo(x - 2);
	}
}