/**
 * 
 * Problem: Implement an algorithm to determine if a string has all unique
 * characters. No extra data structure.
 *
 */

package aKheriwala;

public class IsUnique {

	
	 boolean isUniqueChars(String str) {
		if (str.length() > 256) return false;
		
		boolean[] map = new boolean[256];
		char[] chars = str.toCharArray();
		
		for (char c : chars) {
			
			if (map[c]) {
				return false;
			}
			map[c] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsUnique iu = new IsUnique();
		String s = "abcdefgh";
		System.out.println(iu.isUniqueChars(s));

	}

}
