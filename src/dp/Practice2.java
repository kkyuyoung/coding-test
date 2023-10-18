package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 > 동적계획법(dp) > 돌게임
 * 
 * 
 * @author gksrb
 *
 */
public class Practice2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n%2 == 0) {
			System.out.println("CY");
		} else {
			System.out.println("SK");
		}

	}
}