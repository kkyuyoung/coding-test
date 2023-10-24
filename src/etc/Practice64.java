package etc;

import java.io.IOException;
import java.util.Scanner;

/**
 * 백준 > 알람 시계(2884번)
 * 
 * @author gksrbdud
 *
 */
public class Practice64 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m<45) {
			h=h-1;
			if(h==-1) {
				h = 23;
			}
			m=60+(m-45);
		} else {
			m=m-45;
		}
		
		System.out.println(h+" "+m);
	}
}