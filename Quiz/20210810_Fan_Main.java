package day11_set_get;

public class 20210810_Fan_Main {

	public static void main(String[] args) {
		
		Quiz03_Fan f = new Quiz03_Fan();
		Quiz03_Fan_method fan = new Quiz03_Fan_method();
		
		while(true) {
			System.out.println("---��ǳ��---");
			System.out.println("1. ���� �ѱ�");
			System.out.println("2. ���� ����");
			System.out.println("3. �ٶ� ����");
			System.out.println("4. �ٶ� ����");
			System.out.println("5. ���� ����");
			int choice = fan.Input();
			
			switch(choice) {
			case 1 :
				System.out.println("������ �������ϴ�.");
				System.out.println(fan.windStrength(1) + " " + fan.windWay(3));
				break;
			case 2 :
				System.out.print("���� ���� : ");
				fan.view();
				break;
			case 3 :
				System.out.println("�ٶ� ���� ����");
				System.out.print("���� ���� : ");
				fan.view();
				System.out.println("1.1�ܰ� 2.2�ܰ� 3.3�ܰ� 4.4�ܰ�");
				int select = fan.Input();
				fan.windStrength(select);
				break;
			case 4 :
				System.out.println("�ٶ� ���� ����");
				System.out.print("���� ���� : ");
				fan.view();
				System.out.println("1.���� 2.�¿� 3.����");
				select = fan.Input();
				fan.windWay(select);
				break;
			case 5 :
				System.out.println("������ �������ϴ�");
				return;
			}
			
		}
		
	}
}
