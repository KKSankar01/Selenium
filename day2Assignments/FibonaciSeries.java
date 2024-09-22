package day2Assignments;

import java.util.Scanner;

//import java.util.Iterator;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int countNumber=number.nextInt();
		int firstnumber=0;
		int secondnumber=1;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		for (int i = 0; i<countNumber-2; i++) {
			int nextnumber=firstnumber+secondnumber;
			System.out.println(nextnumber);
			firstnumber=secondnumber;
			secondnumber=nextnumber;
		}
			
		}

	}
