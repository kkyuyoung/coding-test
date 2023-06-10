package etc;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 * 백준 > 4344번 평균은 넘겠지
 * 
 * @author gksrb
 *
 */
public class Practice51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			double studentCnt = sc.nextDouble();

			int sum = 0;
			
			List<Integer> arr = new ArrayList<>();
			for (int j = 0; j < studentCnt; j++) {
				int num = sc.nextInt();
				sum += num;
				arr.add(num);
			}
			
			double avg = sum / studentCnt;
			int cnt = arr.stream().filter(a -> a>avg).collect(Collectors.toList()).size(); // 평균이 넘는 학생 cnt
			double answer = (cnt/studentCnt)*100;

			DecimalFormat df = new DecimalFormat("#0.000");
			String result = df.format(answer);
			System.out.println(result+"%");
		}

	}

}
