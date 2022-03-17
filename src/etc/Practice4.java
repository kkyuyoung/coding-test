package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 백준 > 개미(3048번)
 * 
 * @author gksrbdud
 *
 */

class Ant {
	char data;
	int dir;

	public Ant(char data, int dir) {
		super();
		this.data = data;
		this.dir = dir;
	}
}

public class Practice4 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		String aData = sc.nextLine();
		String bData = sc.nextLine();
		int T = sc.nextInt();
		int size = a + b;
		List<Ant> antList = new ArrayList<>();

		for (int i = a - 1; i >= 0; i--) {
			antList.add(new Ant(aData.charAt(i), 0));
		}

		for (int i = 0; i < b; i++) {
			antList.add(new Ant(bData.charAt(i), 1));
		}

		for (int t = 0; t < T; t++) {
			for (int i = 0; i < size - 1; i++) {
				if (antList.get(i).dir == 0 && antList.get(i).dir != antList.get(i + 1).dir) {
					int dir = antList.get(i).dir;
					char data = antList.get(i).data;

					antList.get(i).dir = antList.get(i + 1).dir;
					antList.get(i).data = antList.get(i + 1).data;
					antList.get(i + 1).dir = dir;
					antList.get(i + 1).data = data;
					i++; // 위치를 change하고난 후의 인덱스로 바꿔야함

				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < antList.size(); i++) {
			sb.append(antList.get(i).data);
		}
		System.out.print(sb);

	}
}
