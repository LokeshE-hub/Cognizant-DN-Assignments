package javaBasics;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		loop1: while(true) {
			System.out.println("Enter 1 to perform addition\n"
					+ "Enter 2 to perform subtraction\n"
					+ "Enter 3 to perform multiplication\n"
					+ "Enter 4 to perform division\n"
					+ "Enter 5 to exit");
			int ch = sc.nextInt();
			int n1=0,n2=0;
			switch(ch) {
			case 1:
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				System.out.println(n1+" + "+n2+" = "+(n1+n2));
				break;
			case 2:
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				System.out.println(n1+" - "+n2+" = "+(n1-n2));
				break;
			case 3:
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				System.out.println(n1+" * "+n2+" = "+(n1*n2));
				break;
			case 4:
				System.out.println("Enter first number");
				n1 = sc.nextInt();
				System.out.println("Enter second number");
				n2 = sc.nextInt();
				System.out.println(n1+" / "+n2+" = "+(n1/n2));
				break;
			case 5:
				System.out.println("Exiting...");
				break loop1;
			default:
				System.out.println("Invalid");
			}
			
		}
	}
}
