package day2Assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number: ");
		Scanner number=new Scanner(System.in);
		int input=number.nextInt();
		int output;
		for(int i=input;i>0;i++) {
			int rem=i%10;
			if(i%10!=0) {
				System.out.println(rem);
			}
		}
	}
}
