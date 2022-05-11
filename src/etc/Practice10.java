package etc;

/**
 * leetCode > 1071. Greatest Common Divisor of Strings
 * 
 * @author gksrbdud
 *
 */
public class Practice10 {

	public static void main(String[] args) {
		System.out.print(gcdOfStrings("ABCDEF", "ABC"));
	}

	public static String gcdOfStrings(String str1, String str2) {
		
		String result = "";
		
		if(str1.length() > str2.length()) {
			if(str1.indexOf(str2) > -1) {
				int i = str1.indexOf(str2);
				StringBuffer sb = new StringBuffer(str1);
					
				result = sb.delete(i, str2.length()).toString();
				if(!str2.contains(result)) {
					result = ""; 
				}
			}		
		} else {
			if(str2.indexOf(str1) > -1) {
				int i = str2.indexOf(str1);
				StringBuffer sb = new StringBuffer(str2);
				result = sb.delete(i, str1.length()).toString();	
				if(!str1.contains(result)) {
					result = ""; 
				}
			}
		}		
		return result;
    }

}
