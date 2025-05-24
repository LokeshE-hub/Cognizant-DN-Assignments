package javaBasics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class RecursiveFibonacci {
	static HashMap<Integer,Integer>memo = new LinkedHashMap<>();
	static int fibonacci(int n) {
		if (n <= 1)
			return n;
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		memo.put(n,fibonacci(n - 1) + fibonacci(n - 2));
		return memo.get(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer:");
		int n = sc.nextInt();
		System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
		sc.close();
	}
}
