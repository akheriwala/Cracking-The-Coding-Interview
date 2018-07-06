/**
 * 
 * Problem: Write a method to replace all spaces in a string with '%20 You may
 * assume that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform
 * this operation in place.) EXAMPLE Input: "Mr John Smith     ", 13 Output:
 * "Mr%20John%20Smith"
 * 
 * Solution: Start from the end and work backwards
 *
 */

package aKheriwala;

public class URLify {
	
	public String urlify (char[] str, int trueLength) {
		if (str == null) {
			return "";
		}
		
		int spaceCount = 0;
		int index = 0;
		
		for (int i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		
		index = trueLength + spaceCount*2 - 1;
		
		if (trueLength < str.length) {
			str[trueLength] = '\0';
		} 
		
		for (int i=trueLength-1; i >=0; i--) {
			if (str[i] == ' ') {
				str[index] = '0';
				str[index-1] = '2';
				str[index-2] = '%';
				index=index-3;
			} else {
				str [index] = str[i];
				index--;
			}
		}
		return new String(str).trim();
	}

	public static void main(String[] args) {
		URLify url = new URLify();
		char[] str = "Mr John Smith      ".toCharArray();
		System.out.println(url.urlify(str, 13));

	}

}
