package day11_set_get;

import java.util.Scanner;

public class MyQuiz02 {
	public static void main(String[] args) throws InterruptedException {
		MyQuiz02_class car = new MyQuiz02_class();
		Scanner scan = new Scanner(System.in);
		String name = null, color = null;
		int speed;

		while (true) {
			System.out.println("1.자동차 생성");
			System.out.println("2.자동차 출발");
			System.out.println("3.폐차");
			System.out.print(">>>");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if (name == null && color == null) {
					System.out.print("자동차 기종:");
					name = scan.next();
					System.out.print("자동차 색상: ");
					color = scan.next();
					car.create(name, color);
					System.out.println("자동차 생성 완료!");
					System.out.println("==================");
					System.out.println("자동차 :"+name+"\t색상 :" +color);
					System.out.println("==================");
				} else {
					System.out.println("이미 자동차가 있습니다.");
				}
				break;
			case 2:
				if (name != null & color != null) {
					System.out.print("시속 몇Km 까지 운행? : ");
					speed = scan.nextInt();
					car.start(speed);
					System.out.println("======운행 종료======");
				} else {
					System.out.println("자동차가 없습니다.");
				}
				break;

			case 3:
				System.out.println("폐차 시킵니다");
				System.exit(0);

			}
		}

	}
}
