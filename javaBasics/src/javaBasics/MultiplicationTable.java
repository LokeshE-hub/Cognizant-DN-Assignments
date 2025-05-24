package javaBasics;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to print multiplication table\n"
					+ "Enter 2 to exit");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("Enter a number to print its multiplication table:");
				int num = sc.nextInt();
				System.out.println("Multiplication table for " + num + ":");
				for(int i = 1; i <= 10; i++) {
					System.out.println(num + " x " + i + " = " + (num * i));
				}
			}
			else if(ch == 2) {
				System.out.println("Exiting");
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}
