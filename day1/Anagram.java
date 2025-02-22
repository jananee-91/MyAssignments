package week3.day1;

import java.util.Arrays;

public class Anagram {
	

	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "potss";
		
		int s1 = str1.length();
		int s2 = str2.length();
		
		if(s1==s2) {
			System.out.println("Length matches, given strings are Anagram");
			
		}
		else {
			System.out.println("Length mismtach, given strings are not an Anagram");
		}
		
		char[] charArray1 = str1.toCharArray();
		
		char[] charArray2 = str2.toCharArray();
		
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean b = Arrays.equals(charArray1, charArray2);
		System.out.println(b);
		
		if(b==true) {
			System.out.println("The given strings are Anagram");
		}else {
			System.out.println("The given strings are not an Anagram");
		}
		
	}
}
