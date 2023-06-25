package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 백준 > 탐욕법 > 수 묶기(1744/번)
 * 
 * @author gksrbdud
 *
 */
public class Practice18 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		ArrayList<Integer> yangsu = new ArrayList<>();
		ArrayList<Integer> umsu = new ArrayList<>();
		ArrayList<Integer> leftList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp > 1) {
				yangsu.add(temp);
			} else if (temp < 0) {
				umsu.add(temp);
			} else {
				leftList.add(temp);
			}
		}

		yangsu.sort(Collections.reverseOrder());
		Collections.sort(umsu);

		long answer = 0;

		for (int i = 0; i < yangsu.size(); i++) {
			if (i < yangsu.size() - 1) {
				answer += yangsu.get(i) * yangsu.get(i + 1);
				i++;
			} else {
				answer += yangsu.get(i);
			}
		}

		for (int i = 0; i < umsu.size(); i++) {
			if (i < umsu.size() - 1) {
				answer += umsu.get(i) * umsu.get(i + 1);
				i++;
			} else {
				leftList.add(umsu.get(i));
			}
		}

		Collections.sort(leftList);

		for (int i = 0; i < leftList.size(); i++) {
			if (i < leftList.size() - 1) {
				if (leftList.get(i) < 0 && leftList.get(i + 1) == 0) {
					answer += leftList.get(i) * leftList.get(i + 1);
					i++;
				} else {
					answer += leftList.get(i) + leftList.get(i + 1);
					i++;
				}
			} else {
				answer += leftList.get(i);
			}
		}

		System.out.println(answer);
	}
}
