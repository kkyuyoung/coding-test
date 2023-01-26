package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 코딩테스트 연습 >탐욕법(Greedy) > 체육복
 * 
 * @author gksrbdud
 *
 */
public class Practice13 {

	public static void main(String[] args) {

		int n = 5;
		int[] lost = { 3 };
		int[] reserve = { 2, 4 };
		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {

		int answer = 0;

		List<String> lostList = new ArrayList<>();
		for (int i = 0; i < lost.length; i++) {
			lostList.add(Integer.toString(lost[i]));
		}

		List<String> reserveList = new ArrayList<>();
		for (int i = 0; i < reserve.length; i++) {
			reserveList.add(Integer.toString(reserve[i]));
		}

		// reserve에서 lost 제거
		reserveList.removeAll(lostList);

		// 1이 있다면 1+1
		if (reserveList.contains("1")) {
			if (lostList.contains("2")) {
				// lostList, reserveList 둘다 빼주기
				lostList.remove("2");
				reserveList.remove(0); // index
			}
		}
		// n이 있다면 n-1
		if (reserveList.contains(Integer.toString(n))) {
			int e = n - 1;
			if (lostList.contains(Integer.toString(e))) {
				// lostList, reserveList 둘다 빼주기
				lostList.remove(Integer.toString(e)); // 해당 값 빼주기
				reserveList.remove(Integer.toString(n)); // index
			}
		}

		Arrays.sort(reserveList.stream().mapToInt(Integer::parseInt).toArray());

		for (int i = 0; i < reserveList.size(); i++) {
			int aa = Integer.parseInt(reserveList.get(i)) - 1;
			int bb = Integer.parseInt(reserveList.get(i)) + 1;

			if (lostList.contains(Integer.toString(aa))) {
				lostList.remove(Integer.toString(aa));
				reserveList.remove(i);
			} else if (lostList.contains(Integer.toString(bb))) {
				lostList.remove(Integer.toString(bb));
				reserveList.remove(i);
			}
		}

		answer = n - lostList.size();

		return answer;
	}

}
