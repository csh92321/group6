package day11_set_get;

import java.util.Scanner;

public class MyQuiz02 {
	public static void main(String[] args) throws InterruptedException {
		MyQuiz02_class car = new MyQuiz02_class();
		Scanner scan = new Scanner(System.in);
		String name = null, color = null;
		int speed;

		while (true) {
			System.out.println("1.�ڵ��� ����");
			System.out.println("2.�ڵ��� ���");
			System.out.println("3.����");
			System.out.print(">>>");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				if (name == null && color == null) {
					System.out.print("�ڵ��� ����:");
					name = scan.next();
					System.out.print("�ڵ��� ����: ");
					color = scan.next();
					car.create(name, color);
					System.out.println("�ڵ��� ���� �Ϸ�!");
					System.out.println("==================");
					System.out.println("�ڵ��� :"+name+"\t���� :" +color);
					System.out.println("==================");
				} else {
					System.out.println("�̹� �ڵ����� �ֽ��ϴ�.");
				}
				break;
			case 2:
				if (name != null & color != null) {
					System.out.print("�ü� ��Km ���� ����? : ");
					speed = scan.nextInt();
					car.start(speed);
					System.out.println("======���� ����======");
				} else {
					System.out.println("�ڵ����� �����ϴ�.");
				}
				break;

			case 3:
				System.out.println("���� ��ŵ�ϴ�");
				System.exit(0);

			}
		}

	}
}
