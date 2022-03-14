package etc;

import java.util.Scanner;

/**
 * น้มุ > ภทณ๎ภฬ(2490น๘)
 * 
 * @author gksrbdud
 *
 */
public class Practice2 {

	public static int[][] arr = new int[3][4];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 4; y++) {
				arr[x][y] = sc.nextInt();
			}
		}

		for (int x = 0; x < 3; x++) {
			int a = 0;
			int b = 0;
			for (int y = 0; y < 4; y++) {
				if (arr[x][y] == 0)
					a++;
				if (arr[x][y] == 1)
					b++;
			}
			String result = "";
			if (a == 1 && b == 3)
				result = "A";
			else if (a == 2 && b == 2)
				result = "B";
			else if (a == 3 && b == 1)
				result = "C";
			else if (a == 4)
				result = "D";
			else if (b == 4)
				result = "E";
			System.out.println(result);
		}

	}

}
