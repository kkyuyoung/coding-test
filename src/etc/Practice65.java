package etc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 백준 > 약속 장소(25542번)
 * 
 * @author gksrbdud
 *
 */
public class Practice65 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();


		List<String> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.next());
		}

		String answer = "";

		for(int i=0; i<l; i++) {
			Map<Character ,Integer> map = new HashMap<>();
		    for(int j=0; j<n; j++) {
		    	char c = list.get(j).charAt(i);
		    	map.put(c, map.getOrDefault(c, 0)+1);
		    }
		   
		    if(map.size()>2) {
		    	System.out.println("CALL FRIEND");
		    	return;
		    }
		    
            char maxKey = 0;
            int maxCount = 0;
            
            for(Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            
            answer += maxKey;
		}
		System.out.println(answer);
	}
}