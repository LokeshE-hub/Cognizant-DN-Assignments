package javaBasics;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine().toLowerCase();
		
		StringBuilder cleaned = new StringBuilder();
		for(int i=0;i<input.length();i++) {
			char ch = input.charAt(i); 
			if(ch>='0'&&ch<='9'||ch>='a'&&ch<='z') {
				cleaned.append(ch);
			}
		}
		String reversed = new StringBuilder(cleaned).reverse().toString();
		if (cleaned.toString().equals(reversed))
			System.out.println("The string is a palindrome.");
		else
			System.out.println("The string is not a palindrome.");
		
		sc.close();
	}
}
