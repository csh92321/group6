package day11_set_get;

import java.util.Scanner;

public class Quiz03_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Quiz03_class cf = new Quiz03_class();

		int c1 = 1000, c2 = 1500, c3 = 1300, c4 = 2000, money = 0;
		String total;

		while (true) {
			System.out.println("1.�̿� 2.����");
			System.out.print(">>>");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("====�޴���====");
				System.out.println("1.����������(1000)");
				System.out.println("2.�Ƹ޸�ī��(1500)");
				System.out.println("3.���(1300)");
				System.out.println("4.��(2000)");
				System.out.print(">>>");
				cf.select();
				System.out.println("==================");

				System.out.println("1.ice(+500) 2.hot");
				System.out.print(">>>");
				if (cf.Hce() == 1) {
					System.out.println("ice ���� 500�� �߰�");
				} else {
					System.out.println("hot ����");
				}
				System.out.println("==================");
				System.out.println("���μ���");
				System.out.println("1.�ɳ�(+0��) 2.��Ƽ���Ǿ�(+500��) 3.���׸���(+300��)");
				System.out.println("���θ� �����ϼ��� ");
				System.out.print(">>>");
				cf.been();
				System.out.println("==================");
				System.out.println("�ֹ� �ݾ�,���� :" + cf.name + " :" + cf.total + "��");
				System.out.println("==================");
				System.out.println("Ŀ�� �� ���");
				System.out.println("1.ī�� 2.����");
				System.out.print(">>>");
				if (cf.buy() == 1) {
					System.out.println("ī����� �Ϸ�");
					System.out.println("����");
					break;
				} else {
					System.out.print("���� ���� :");
					money = scan.nextInt();
					money = money - cf.total;
					System.out.println(cf.name + " " + cf.total + "�� �� �� �Ž�����" + money + "��");
					System.out.println("����");
					break;
				}

			} else {
				System.out.println("�����մϴ�");
				System.exit(0);
			}

		}
		
		
	}
}
