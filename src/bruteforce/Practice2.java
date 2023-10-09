package bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 > 일곱 난쟁이(2309번)
 * 
 * 
 * @author gksrb
 *
 */
public class Practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0; i<8; i++) {
			for(int j=i+1; j<9; j++) {
				if(sum-arr[i]-arr[j] == 100) {
					arr[i] = 0;
					arr[j] = 0;
					
					Arrays.sort(arr);
					for(int a=2; a<9; a++) {
						System.out.println(arr[a]);
					}					
					return;
				}
			}
		}
	}

}