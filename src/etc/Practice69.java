package etc;

import java.io.IOException;
import java.util.Scanner;

/**
 * 프로그래머스 > 연습문제 > 직사각형 별찍기
 * 
 * @author gksrbdud
 *
 */
public class Practice69 {
	public static void main(String[] args) throws IOException {
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        for(int j=0; j<m; j++) {
	            for(int i=0; i<n; i++) {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	}
}