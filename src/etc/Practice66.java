package etc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 > 비슷한 단어
 * 
 * @author gksrbdud
 *
 */
public class Practice66 {
	public static void main(String[] args) throws IOException {
		 Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();

	      String[] arr = new String[n];

	      for(int i=0; i<n; i++) {
	         char[] charArr = sc.next().toCharArray();
	         Arrays.sort(charArr);
	         
	         String str = new String(charArr);
	         arr[i] = str;
	      }
	      
	      int answer = 0;
	      for(int i=1; i<n; i++) {
	         if(arr[0].equals(arr[i])) {
	            answer++;
	         }
	      }
	      
	      System.out.println(answer);

	}
}