package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 캠핑(4796번)
 * 
 * @author gksrbdud
 *
 */
public class Practice5 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		List<int[]> list = new ArrayList<>();

		while(true) {
		  int[] temp = new int[3];
		  temp[0] = sc.nextInt();
		  temp[1] = sc.nextInt();
		  temp[2] = sc.nextInt();
		    
		  if(temp[0] == 0 && temp[1] == 0 && temp[2] == 0) 
		    break;

		  list.add(temp);
		}

		int cnt = 0;
		for(int[] a : list) {


		  int l = a[0];
		  int p = a[1];
		  int v = a[2];

		  int result = 0;
		  while(v >= l) {
		    result += l;
		    v -= p;
		  } 
		  result += v;
		  cnt++;
		  System.out.println("Case "+cnt+": "+result);
		}

	}
}
