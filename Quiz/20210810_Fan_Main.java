package day11_set_get;

public class 20210810_Fan_Main {

	public static void main(String[] args) {
		
		Quiz03_Fan f = new Quiz03_Fan();
		Quiz03_Fan_method fan = new Quiz03_Fan_method();
		
		while(true) {
			System.out.println("---선풍기---");
			System.out.println("1. 전원 켜기");
			System.out.println("2. 현재 상태");
			System.out.println("3. 바람 세기");
			System.out.println("4. 바람 방향");
			System.out.println("5. 전원 끄기");
			int choice = fan.Input();
			
			switch(choice) {
			case 1 :
				System.out.println("전원이 켜졌습니다.");
				System.out.println(fan.windStrength(1) + " " + fan.windWay(3));
				break;
			case 2 :
				System.out.print("현재 상태 : ");
				fan.view();
				break;
			case 3 :
				System.out.println("바람 세기 수정");
				System.out.print("현재 상태 : ");
				fan.view();
				System.out.println("1.1단계 2.2단계 3.3단계 4.4단계");
				int select = fan.Input();
				fan.windStrength(select);
				break;
			case 4 :
				System.out.println("바람 뱡향 수정");
				System.out.print("현재 상태 : ");
				fan.view();
				System.out.println("1.상하 2.좌우 3.고정");
				select = fan.Input();
				fan.windWay(select);
				break;
			case 5 :
				System.out.println("전원이 꺼졌습니다");
				return;
			}
			
		}
		
	}
}
