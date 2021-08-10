package day11_set_get;

import java.util.Scanner;

public class Quiz02_Main {

	public static void main(String[] args) {
		
		Quiz02_CoffieM_method cm = new Quiz02_CoffieM_method();
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println(" ---- 커피 머신 ---- ");
			System.out.println("   1. 작동 시작");
			System.out.println("   2. 작동 종료");
			System.out.print(" >>>  ");
			choice = sc.nextInt();
		
			switch(choice) {
			case 1 :
				cm.selectCoffee();
				cm.hotIce();
				cm.coffeeBean();
				cm.printMenu();
				cm.pay();
				break;
			case 2 :
				return;
			}
		}
	}
}
