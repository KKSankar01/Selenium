package day2Assignments;

import java.util.Scanner;

//import java.util.Scanner;

public class IsPrimeNumber {
	static int count=0;
	public static void main(String[] args) {

		//int number = 12;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=scan.nextInt();
		if (isPrime(number)) {
			System.out.println(number + " is a prime number");
		} else {
			System.out.println(number + " is not a prime number");
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number-1; i++) {
			if (number % i == 0) {
				count=count+1;
				if (count>2) {
					return false;
				}
			}
		}
		return true;

	}

}