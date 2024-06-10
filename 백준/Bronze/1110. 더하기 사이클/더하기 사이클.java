import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws Exception {
    	Scanner sc = new Scanner(System.in);
    	String n = sc.next();    	if(Integer.parseInt(n) < 10) {
    		n = "0"+n;
    	}
    	int n0 = Integer.parseInt(n.substring(0,1 ));
    	int n1 =  Integer.parseInt(n.substring(1));
    	int plus = n0 + n1;
    	String plusStr = Integer.toString(plus);
    	plusStr = n.substring(1) + plusStr.substring(plusStr.length()-1);
    	
    	int cnt = 1;
    	
    	while(!plusStr.equals(n)) {
    		plus  = Integer.parseInt(plusStr.substring(0,1)) + Integer.parseInt(plusStr.substring(1));
    		String plusStr2 = Integer.toString(plus);
        	plusStr = plusStr.substring(1) + plusStr2.substring(plusStr2.length()-1);
        	
        	cnt++;
    	}
    	
    	System.out.println(cnt);
    }
 
}