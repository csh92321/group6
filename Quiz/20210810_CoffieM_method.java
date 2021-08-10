package day11_set_get;

import java.util.Scanner;

public class Quiz02_CoffieM_method {

	Quiz02_CoffeeMachine cm = new Quiz02_CoffeeMachine();
	
	public int input() {
		Scanner sc = new Scanner(System.in);
		int select;
		System.out.print(">>> ");
		select = sc.nextInt();
		return select;
	}
	
	public void selectCoffee() {
		System.out.println("1. 에스프레소 (1000원)");
		System.out.println("2. 아메리카노 (1500원)");
		System.out.println("3. 룽고     (1300원)");
		System.out.println("4. 라떼     (2000원)");
		int select;
		select = input();
		cm.setMenuNum(select);
		
		switch(select) {
		case 1 :
			cm.setMenu("에스프레소");
			cm.setTotal(1000);
			break;
		case 2 :
			cm.setMenu("아메리카노");
			cm.setTotal(1500);
			break;
		case 3 :
			cm.setMenu("룽고");
			cm.setTotal(1300);
			break;
		case 4 :
			cm.setMenu("라떼");
			cm.setTotal(2000);
			break;
		} 
	}
	
	public void hotIce() {
		System.out.println("1. hot");
		System.out.println("2. ice (+500원)");
		int select;
		select = input();
		
		switch(select) {
		case 1 :
			cm.setHotIce("따뜻한");
			break;
		case 2 :
			cm.setHotIce("아이스");
			cm.setTotal(cm.getTotal()+500);
			break;
		}
	}
	
	public void coffeeBean() {
		System.out.println("1. 케냐");
		System.out.println("2. 에티오피아 (+500원)");
		System.out.println("3. 과테말라   (+300원)");
		int select;
		select = input();
		
		switch(select) {
		case 1 :
			cm.setCoffeeBean("케냐");
			break;
		case 2 :
			cm.setCoffeeBean("에티오피아");
			cm.setTotal(cm.getTotal()+500);
			break;
		case 3 :
			cm.setCoffeeBean("과테말라");
			cm.setTotal(cm.getTotal()+300);
			break;
		}
	}
	
	public void printMenu() {
		System.out.print(cm.getHotIce()+" "+cm.getMenu()+"("+cm.getCoffeeBean()+")" );
		System.out.println("  총 가격 : " + cm.getTotal()+"원");
	}
	
	public void pay() {
		System.out.println("1. 카드 계산");
		System.out.println("2. 현금 계산");
		int select;
		select = input();
		
		switch(select) {
		case 1 :
			System.out.println("카드를 투입해주세요");
			System.out.println(cm.getTotal()+"원 결제 완료");
			System.out.println();
			break;
		case 2 :
			System.out.print("금액을 투입해주세요\n 투입 금액 ");
			int price;
			price = input();
			if (price==cm.getTotal()) {
				System.out.println(cm.getTotal()+"원 결제 완료");
			} else if (price>cm.getTotal()) {
				System.out.println("결제 완료");
				System.out.println("거스름돈 : " +(price-cm.getTotal())+"원");
			} else {
				System.out.println("결제 불가 : 투입 금액이 부족합니다");
			}
			break;
		}
	}
	
	
}
