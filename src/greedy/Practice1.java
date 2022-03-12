package greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ÇÁ·Î±×·¡¸Ó½º > Å½¿å¹ý(Greedy) > Ã¼À°º¹
 * 
 * @author gksrbdud
 *
 */
public class Practice1 {

	public static void main(String[] args) {

		int[] lost = { 1, 2 };
		int[] reserve = { 2, 3 };

		int answer = solution(3, lost, reserve);

		System.out.print(answer);
	}

	public static int solution(int n, int[] lost, int[] reserve) {

		Arrays.sort(reserve);

		Set<Integer> newLost = new HashSet<Integer>();
		Set<Integer> newReserve = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				newLost.add(lost[i]);
				newReserve.add(reserve[j]);
				if (lost[i] == reserve[j]) {
					common.add(lost[i]);
				}
			}
		}
		newLost.removeAll(common);
		newReserve.removeAll(common);
		for (int reserveNo : newReserve) {
			if (newLost.contains(reserveNo - 1)) {
				newLost.remove(reserveNo - 1);
			} else if (newLost.contains(reserveNo + 1)) {
				newLost.remove(reserveNo + 1);
			}
		}
		int answer = n - newLost.size();
		return answer;
	}

}
