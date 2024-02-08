package etc;

import java.io.IOException;
import java.util.Stack;

/**
 * 프로그래머스 > 연습문제 > 뒤에 있는 큰 수 찾기
 * 
 * @author gksrbdud
 *
 */
public class Practice71 {
	public static void main(String[] args) throws IOException {
		   int[] numbers = {2,3,3,5};
	        int[] answerArr = solution(numbers);
	        for(int answer : answerArr) {
	        	System.out.println(answer);
	        }
	}
	
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int i=1; i<numbers.length; i++) {
        	while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
        		answer[stack.pop()] = numbers[i];
        	}
        	stack.push(i);
        }
        
        while(!stack.isEmpty()) {
        	answer[stack.pop()] = -1;
        }
        
        return answer;
    }
}