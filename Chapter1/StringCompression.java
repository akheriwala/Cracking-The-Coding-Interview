/**
 * 1.6 String Compression
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * Example : aabcccccaaa would beocme a2b1c5a3. If the compressed string would not become smaller 
 * than the original string. Your method should return the original string. You can assume the string
 * has only uppercase and lowercase letters (a - z)
 */

package chapter1;

public class StringCompression {
	
	String Compress (String phrase) {
		int count = 0;
		StringBuilder compString = new StringBuilder();
		for (int i = 0; i < phrase.length(); i++) {
			if (i +1 >= phrase.length() || phrase.charAt(i) != phrase.charAt(i+1)) {
				count++;
				compString.append(phrase.charAt(i));
				compString.append(count);
				count=0;
			} else {
				count++;
			}
		}
		return compString.length() < phrase.length() ? compString.toString() : phrase;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression c = new StringCompression();
		System.out.println(c.Compress("aabcccccaaa"));

	}

}
