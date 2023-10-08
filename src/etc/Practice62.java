package etc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 백준 > 농구 경기(1159번)
 * 
 * @author gksrb
 *
 */
public class Practice62 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<String> firstNameList = new ArrayList<>();

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String first = String.valueOf(name.charAt(0));
			map.put(first, map.getOrDefault(first, 0) + 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 5) {
				firstNameList.add(entry.getKey());
			}
		}

		firstNameList.sort(Comparator.naturalOrder());

		for (String str : firstNameList) {
			System.out.print(str);
		}
		if (firstNameList.size() == 0) {
			System.out.println("PREDAJA");
		}
	}
}