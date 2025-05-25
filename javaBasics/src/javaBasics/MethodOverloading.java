package javaBasics;

public class MethodOverloading {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println("Sum of two integers: " + add(5, 10));
		System.out.println("Sum of two doubles: " + add(5.5, 2.3));
		System.out.println("Sum of three integers: " + add(1, 2, 3));
	}
}
