package problem3;

public class Prob3 {

	public static void main(String[] args) {
		
		String str = reverseWords("Hello World Again");
		System.out.println(str);
	}

	public static String reverseWords(String str) {
		String newStr="";
		char delim = ' ';
		String[] currStr = split(str, delim);
		int i = 0;
		
		for (i = currStr.length - 1; i > 0; i--) {
			newStr += currStr[i] + delim;
		}
		
		return newStr;
	}
	
	public static String[] split(String str, char delim) {
		int i = 0;
		int strCount = 0;
		String[] tempStrs = new String[100];
		String currStr = "";
		
		for (; i < str.length(); i++) {
			if (str.charAt(i) != delim) {
				currStr += str.charAt(i);
			}
			
			if (str.charAt(i) == delim || i == str.length() - 1) {
				strCount++;
				tempStrs[strCount] = currStr;
				currStr = "";			
			}
		}
		
		String[] finStrs = new String[strCount + 1];
		for (i = 0; i < finStrs.length; i++) {
			finStrs[i] = tempStrs[i];
		}
		return finStrs;
	}
}
