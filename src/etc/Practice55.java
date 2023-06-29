package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 백준 > 11652번 카드
 * 
 * @author gksrb
 *
 */
public class Practice55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		Map<Long,Long> map = new HashMap<Long, Long>();
		for(int i=0; i<n; i++) {
			Long temp = sc.nextLong();
			map.put(temp, map.getOrDefault(temp, 0L)+1L);
		}
		
		List<Map.Entry<Long, Long>> sortedEntries = new ArrayList<>(map.entrySet());
        Collections.sort(sortedEntries, (e1, e2) -> {
            int valueCompare = e2.getValue().compareTo(e1.getValue()); // value 내림차순 정렬
            if (valueCompare == 0) { // value값이 같을 경우 key값 오름차순 정렬 
                return e1.getKey().compareTo(e2.getKey());
            } else {
                return valueCompare;
            }
        });
        
        if (!sortedEntries.isEmpty()) {
            Map.Entry<Long, Long> firstEntry = sortedEntries.get(0);
            System.out.println(firstEntry.getKey());
        }
	}

}
