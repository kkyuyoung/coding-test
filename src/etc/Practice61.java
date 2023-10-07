package etc;

import java.util.Scanner;

/**
 * 백준 > 팰린드롬인지 확인하기(10988번)
 * 
 * @author gksrb
 *
 */
public class Practice61 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		
		if(str.equals(reverse)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	
	}
}