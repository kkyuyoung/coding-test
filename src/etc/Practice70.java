package etc;

import java.io.IOException;
import java.util.Scanner;

/**
 * 프로그래머스 > 연습문제 > 수박수박수박수박수박수?
 * 
 * @author gksrbdud
 *
 */
public class Practice70 {
	public static void main(String[] args) throws IOException {
		   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        String answer = "";
	        for(int i=1; i<=n; i++) {
	        	  if(i%2==0) {
	        	   answer += "박";
	        	  } else {
	        	   answer += "수";
	        	  }
	        	}
	        
	        System.out.println(answer);
	}
}