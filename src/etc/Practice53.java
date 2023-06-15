package etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * 백준 > 1157번 단어 공부
 * 
 * @author gksrb
 *
 */
public class Practice53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		Map<String, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			String s = Character.toString(str.charAt(i)).toUpperCase();
			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		// LinkedHashMap의 entrySet을 List로 변환
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		// value 값을 기준으로 내림차순 정렬
		entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

		if(entries.size() == 1) {
			System.out.println(entries.get(0));
		}
		else if (entries.get(0).getValue() == entries.get(1).getValue()) {
			System.out.println("?");
		} else {
			System.out.println(entries.get(0).getKey());
		}
	}

}
