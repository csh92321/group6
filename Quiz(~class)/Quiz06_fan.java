package day11_set_get;

import java.util.Scanner;

class fan {

	private int wind;
	private String str;

	public int getWind() {
		return wind;
	}

	public void setWind(int wind) {
		this.wind = wind;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int power(String s) {
		if (s.contains("on")) {
			return 1;
		} else if (s.contains("off")) {
			return 0;
		} else
			return 0;
	}

	public void powerup(int num) {
		if (num == 1) {
			setWind(1);
		} else if (num == 2) {
			setWind(2);
		} else if (num == 3) {
			setWind(3);
		} else if (num == 4) {
			setWind(4);
		} else {
			setWind(0);
		}
	}

	public void tn(String str) {
		if (str.contains("����")) {
			setStr(str);
		} else if (str.contains("�¿�")) {
			setStr(str);
		} else {
			setStr(null);
		}

	}
}

public class Quiz06_fan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		fan f = new fan();
		int num;
		System.out.println("==== ��ǳ�� ====");
		System.out.println("");
		System.out.println("��ǳ�� ����? (on/off)");
		System.out.print(">>>");
		String s = scan.next();
		int a = f.power(s);
		if (a == 1) {
			System.out.println("��ǳ�⸦ �մϴ�");
		} else {
			System.out.println("��ǳŰ ����");
			System.exit(0);
		}
		while (true) {
			System.out.println("===========");
			System.out.println("1.�ٶ����� 2.ȸ�� 3.����");
			System.out.print(">>>");
			num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("�ٶ����� ���� 1~4");
				System.out.print(">>>");
				num = scan.nextInt();
				f.powerup(num);
				if (f.getWind() == 0) {
					System.out.println("�ٶ��� 1~4�� �Դϴ�.");
					break;
				}
				System.out.println("�ٶ����� : " + f.getWind() + "��");
				break;

			case 2:
				System.out.println("��ǳ�⸦ ȸ���մϴ� ���� or �¿�");
				String str = scan.next();
				f.tn(str);
				if (f.getStr() == null) {
					System.out.println("����,�¿� �� �Է�");
					break;
				}
				System.out.println("��ǳ�Ⱑ " + f.getStr() + "�� ȸ�� �մϴ�.");
				break;
			case 3:
				System.out.println("�����մϴ�");
				System.exit(0);
			}

		}

	}
}
