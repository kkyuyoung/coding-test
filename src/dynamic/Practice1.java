package dynamic;

/**
 * 
 * 프로그래머스 코딩테스트 연습 > 연습문제 > 피보나치 수
 * @author gksrb
 *
 */
public class Practice1 {

	public static void main(String[] args) {
		int n = 5; 
		int answer = solution(n);
	}
	
    static int[] memo = new int[100001];
    public static int solution(int n) {
        return fibo(n);
    }
    
    public static int fibo(int n) {
        if(n <= 1) return n;
        else if(memo[n] != 0) return memo[n];
        else return memo[n] = (fibo(n-2) + fibo(n-1)) % 1234567;
    }

}
