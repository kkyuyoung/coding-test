package etc;

import java.util.Scanner;

/**
 * 백준 > 세로 읽기(10798번)
 * 
 * @author gksrbdud
 *
 */
public class Practice1 {

	public static char[][] graph = new char[5][15];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		for (int x = 0; x < 5; x++) {
			String st = sc.nextLine();
			for (int y = 0; y < st.length(); y++) {
				graph[x][y] = st.charAt(y);
			}
		}

		for (int y = 0; y < 15; y++) {
			for (int x = 0; x < 5; x++) {
				if (graph[x][y] == '\0') // char 초깃값 '\0'
					continue;
				System.out.print(graph[x][y]);
			}
		}

	}

}
