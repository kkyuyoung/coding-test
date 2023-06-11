package etc;

import java.util.Scanner;

/**
 * 
 * 백준 > 1541번 잃어버린 괄호
 * 
 * @author gksrb
 *
 */
public class Practice52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String[] numbers = str.split("-");

		int answer = 0;

		int sum = 0;
		for (int i = 1; i < numbers.length; i++) {
			sum += Integer.parseInt(numbers[i]);
		}
		answer -= sum; // - 기준으로 괄호친 값들을 모두 더해서 빼줌
		answer += Integer.parseInt(numbers[0]); // 첫번째 값은 양수

		System.out.println(answer);

	}

}
