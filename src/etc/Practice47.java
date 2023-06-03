package etc;

/**
 * 프로그래머스 코딩테스트 연습 > 월간 코드 챌린지 시즌2 > 약수의 개수와 덧셈
 * 
 * 
 * @author gksrbdud
 *
 */
public class Practice47 {

	public static void main(String[] args) {
		System.out.println(solution(13,17));
	}

	public static int solution(int left, int right) {
	        int answer = 0;	        
	        
	        
	        for(int i=left; i<=right;  i++) {
	          int count = 0;	  
	        	  for(int j=1; j<=i; j++) {
	        	  if(i%j == 0) {
	        	    count++;
	        	  }
	        	}

	        	  if(count%2 == 0) {
	        	    answer += i;
	        	  } else {
	        	    answer -= i;
	        	  }

	        	}
	        
	        return answer;
	    }
}
