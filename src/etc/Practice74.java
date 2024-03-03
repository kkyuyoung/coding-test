package etc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 백준 > 핸드폰 요금(1267번)
 * 
 * 
 * @author gksrb
 *
 */
public class Practice74 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int ysum = 0;
		int msum = 0;
		for(int i=0; i<n; i++) {
		  int num = sc.nextInt();
		  ysum += (num/30)*10 +10;		  
		  msum += (num/60)*15 +15;
		}
		
		if(ysum > msum) {
		 System.out.print("M "+msum);
		} else if(msum > ysum) {
		 System.out.print("Y "+ysum);
		} else {
		 System.out.print("Y M "+ysum);
		}

	}
}