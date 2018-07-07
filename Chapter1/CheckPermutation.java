/**
 * 1.2 - Check Permutation
 * Given 2 strings, write a method to decide if one is a permutation of the other
 */

 package chapter1;

public class Permutation {
	
	String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	boolean Permutation (String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation pm = new Permutation();
		String s = "abcdaf";
		String t = "dabcae";
		System.out.println(pm.Permutation(s, t));

	}

}
