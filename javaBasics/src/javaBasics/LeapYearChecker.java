package javaBasics;

import java.util.Scanner;

public class LeapYearChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 to check for leap year\n"
					+ "Enter 2 to exit");
			int ch = sc.nextInt();
			if(ch==1) {
				System.out.println("Enter a year");
				int year = sc.nextInt();
				if(year%4==0) {
					if((year%100==0&&year%400==0)||year%100!=0) {
						System.out.println("The given year "+year+" is leap year");
					}
					else {
						System.out.println("The given year "+year+" is not a leap year");
					}
				}
				else {
					System.out.println("The given year "+year+" is not a leap year");	
				}
			}
			else if(ch==2) {
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
