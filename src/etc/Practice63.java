package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 > X보다 작은 수(10871번)
 * 
 * @author gksrbdud
 *
 */
public class Practice63 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sl = br.readLine().split(" ");
		int n = Integer.parseInt(sl[0]);
		int x = Integer.parseInt(sl[1]);

		
		String[] sl2 = br.readLine().split(" ");
		for(int i=0; i<sl2.length; i++) {
			if(Integer.parseInt(sl2[i])<x) {
				System.out.print(sl2[i]+" ");
			}
		}

	}
}