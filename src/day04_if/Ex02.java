package day04_if;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int su1, su2, max, min;
		System.out.println("정수 두 개 입력 : ");
		su1 = input.nextInt();
		su2 = input.nextInt();
		
		if(su1 > su2) {
			max = su1;
		min = su2;
		}else {
			max = su2;
		min = su1;
		}
		System.out.println("max : " + max + " , min : " + min);

	}

}
