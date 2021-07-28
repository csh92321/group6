package day04_if;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 1.
		int a;
		System.out.println("점수입력 : ");
		a = input.nextInt();
		
		if(a >= 90 && a <= 100) {
			System.out.println("A 입니다.");
		}else if(a >= 80 && a <= 89) {
			System.out.println("B 입니다.");
		}else if(a >= 70 && a <= 79) {
			System.out.println("C 입니다.");
		}else if(a >= 60 && a <= 69) {
			System.out.println("D 입니다.");
		}else if(a <= 59){
			System.out.println("F 입니다.");
		}
		
		
		//2.
		int b;
		System.out.println("정수 입력: ");
		b = input.nextInt();
		
		if(b%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		// 3.
		int m;
		System.out.println("몇 월인가요? : ");
		m = input.nextInt();
		
		if(m >= 11 && m <= 12) {
			System.out.println("겨울입니다.");
		}else if(m >= 1 && m <= 2) {
			System.out.println("겨울입니다.");
		}else if(m >= 3 && m <= 5) {
			System.out.println("봄입니다.");
		}else if(m >= 6 && m <= 8) {
			System.out.println("여름입니다.");
		}else if(m >= 9 && m <= 10) {			
			System.out.println("가을입니다.");
		}
		
		// 4.

			double h, w, bmi;
			System.out.println("키 : ");
			h = input.nextDouble();
			System.out.println("몸무게 : ");
			w = input.nextDouble();
			
			bmi = w / (h*h);
			
			if(bmi < 18.5) {
				System.out.println("저체중입니다.");
			}else if(bmi >= 18.5 && bmi <= 24.9) {
				System.out.println("정상입니다.");
			}else if(bmi >= 25) {
				System.out.println("비만입니다.");
			}
				
		// 5.
			
			int age;
			System.out.println("몇 살? : ");
			age = input.nextInt();
			
			if(age > 0 && age <= 8) {
				System.out.println("1000원");
			}else if(age >= 9 && age <= 14) {
				System.out.println("1500원");
			}else if(age >= 15 && age <= 17) {
				System.out.println("3000원");
			}else if(age > 17 && age <= 100) {
				System.out.println("5000원");
			}
		

	}

}
