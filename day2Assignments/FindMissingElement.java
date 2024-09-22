package day2Assignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,0,4,3,2,8,6,7};
		Arrays.sort(array1);
		for (int i=0;i<array1.length;i++) {
			if (array1[i]!=i) {
				System.out.println(i);
				break;
			}
		}
	}
}
