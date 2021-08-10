package day11_set_get;

import java.util.Scanner;

public class Quiz03_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Quiz03_class cf = new Quiz03_class();

		int c1 = 1000, c2 = 1500, c3 = 1300, c4 = 2000, money = 0;
		String total;

		while (true) {
			System.out.println("1.이용 2.종료");
			System.out.print(">>>");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("====메뉴판====");
				System.out.println("1.에스프레소(1000)");
				System.out.println("2.아메리카노(1500)");
				System.out.println("3.룽고(1300)");
				System.out.println("4.라떼(2000)");
				System.out.print(">>>");
				cf.select();
				System.out.println("==================");

				System.out.println("1.ice(+500) 2.hot");
				System.out.print(">>>");
				if (cf.Hce() == 1) {
					System.out.println("ice 선택 500원 추가");
				} else {
					System.out.println("hot 선택");
				}
				System.out.println("==================");
				System.out.println("원두선택");
				System.out.println("1.케냐(+0원) 2.에티오피아(+500원) 3.과테말라(+300원)");
				System.out.println("원두를 선택하세요 ");
				System.out.print(">>>");
				cf.been();
				System.out.println("==================");
				System.out.println("주문 금액,내용 :" + cf.name + " :" + cf.total + "원");
				System.out.println("==================");
				System.out.println("커피 값 계산");
				System.out.println("1.카드 2.현금");
				System.out.print(">>>");
				if (cf.buy() == 1) {
					System.out.println("카드결제 완료");
					System.out.println("ㅂㅂ");
					break;
				} else {
					System.out.print("현금 내기 :");
					money = scan.nextInt();
					money = money - cf.total;
					System.out.println(cf.name + " " + cf.total + "원 을 뺀 거스름돈" + money + "원");
					System.out.println("ㅂㅂ");
					break;
				}

			} else {
				System.out.println("종료합니다");
				System.exit(0);
			}

		}
		
		
	}
}
