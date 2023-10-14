package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 접두사(1141번)
 * 
 * @author gksrbdud
 *
 */
public class Practice23 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		List<String> strList = new ArrayList<>();
		for(int i=0; i<n; i++) {
		  strList.add(sc.next());
		}

		int cnt = 0;
		for(int i=0; i<strList.size(); i++) {
		  String curStr = strList.get(i);
		  for(int j=0; j<strList.size(); j++) {
		    if(i != j) {
		    	String otherStr = strList.get(j);
		    	if(otherStr.startsWith(curStr)) {
		    		cnt++; //curStr이 접두사이면 cnt++
		    		break;
		    	}
		    }
		  }
		}
		
		System.out.println(n-cnt);
	}
}
