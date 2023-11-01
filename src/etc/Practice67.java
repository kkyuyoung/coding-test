package etc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 백준 > 영단어 암기는 괴로워
 * 
 * @author gksrbdud
 *
 */
public class Practice67 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		Map<String,Integer> map = new HashMap<>();
		for(int i=0; i<n; i++) {
		  String str = sc.next();
		  if(str.length()>=m) {
			  map.put(str, map.getOrDefault(str, 0)+1);
		  }
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort((entry1, entry2) -> {
		    int result = Integer.compare(entry2.getKey().length(), entry1.getKey().length());
		    if (result == 0) {
		        result = entry1.getKey().compareTo(entry2.getKey());
		    }
		    return result;
		});		
		
		list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
		
		for (Map.Entry<String, Integer> entry : list) {
		    System.out.println(entry.getKey());
		}
	}
}