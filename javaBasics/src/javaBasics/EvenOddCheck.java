package javaBasics;

import java.util.Scanner;

public class EvenOddCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to check if a number is even or odd\n"
					+ "Enter 2 to exit");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("Enter a number");
				int num = sc.nextInt();
				String res = num%2==0?"even":"odd";
				System.out.println("The number "+num+" is "+res);
			}
			else if(ch==2) {
				System.out.println("Exiting..");
				break;
			}
			else {
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}
