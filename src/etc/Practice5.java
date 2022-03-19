package etc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 백준 > 도로와 신호등(2980번)
 * 
 * @author gksrbdud
 *
 */

class Light {
	int d;
	int r;
	int g;

	public Light(int d, int r, int g) {
		super();
		this.d = d;
		this.r = r;
		this.g = g;
	}
}

public class Practice5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int position = 0;
		int time = 0;

		ArrayList<Light> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int d = sc.nextInt();
			int r = sc.nextInt();
			int g = sc.nextInt();
			arr.add(new Light(d, r, g));
		}

		for (int i = 0; i < arr.size(); i++) {
			int lightD = arr.get(i).d;
			int lightR = arr.get(i).r;
			int lightG = arr.get(i).g;

			if (position != lightD) {
				position += (lightD - position);
				time += (lightD - position);
			}

			if (position == lightD) {
				// 빨간불이면
				if (time % (lightR + lightG) <= lightR) {
					if (time % (lightR + lightG) == lightR) {
						time += lightR;
					} else
						time += (lightR - (time % (lightR + lightG)));
				}
			}
		}

		// 끝났을때
		if (position < l) {
			time += l - position;
		}
		System.out.println(time);

	}

}
