package day04_if;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 if(조건식) : 참인 경우 종속문장 실행
		 else : if의 조건이 거짓이면 무조건 종속문장 실행
		 else 는 if의 종속문장 다음에 무조건 들어와야 문법상 에러가 없다
		 */
		
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		
		if(num % 3 == 0) {
			System.out.println(num + "은 3의 배수");
		}else {
			System.out.println(num + "은 3의 배수 아님");
		}
		System.out.println("다음 문장들 실행");
		

	}

}
