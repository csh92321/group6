package day11_set_get;

import java.util.Map;
import java.util.Scanner;

class Tv {
	private int SBS = 5, KBS2 = 7, KBS = 9, MBC = 11, EBS = 13;
	private int cnum;
	

	public void ch() {
		System.out.println("SBS : " + SBS + "��");
		System.out.println("KBS2 : " + KBS2 + "��");
		System.out.println("KBS : " + KBS + "��");
		System.out.println("MBC : " + MBC + "��");
		System.out.println("EBS : " + EBS + "��");
		System.out.println("==============");
	}

	public void cn(int num) {
		if (num == 5) {
			System.out.println(SBS + "��" + "SBS�� ����Ǿ����ϴ�");
			cnum = 5;
		} else if (num == 7) {
			System.out.println(KBS2 + "��" + "KBS2�� ����Ǿ����ϴ�");
			cnum = 7;
		} else if (num == 9) {
			System.out.println(KBS + "��" + "KBS�� ����Ǿ����ϴ�");
			cnum = 9;
		} else if (num == 11) {
			System.out.println(MBC + "��" + "MBC�� ����Ǿ����ϴ�");
			cnum = 11;
		} else if (num == 13) {
			System.out.println(EBS + "��" + "EBS�� ����Ǿ����ϴ�");
			cnum = 13;
		}else {
			cnum=num;
			System.out.println("���� ä�� : " + cnum);
		}

		}

	public void cn2(String str) {
		if (str.contains("��")) {
			cnum++;
			cn(cnum);
		} else if (str.contains("�Ʒ�")) {
			cnum--;
			cn(cnum);
		}

	}

}

public class Quiz05_Tv {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Scanner scan = new Scanner(System.in);
		int num, select;
		String str;
		System.out.println("1.Ƽ���ѱ� 2.����");
		select = scan.nextInt();
		if (select == 1) {
		while (true) {
				System.out.println("ȯ���� �޴� �Է�");
				System.out.println("1. ä�θ�� Ȯ��");
				System.out.println("2. ��ȣ�� ä�� ����");
				System.out.println("3. ä�� �� �Ʒ� ����");
				System.out.println("4. Ƽ�� ����");
				System.out.print(">>>");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("==== TV =====");
					System.out.println("----ä�� ���----");
					tv.ch();
					break;
				case 2:
					System.out.print("ä�� ��ȣ �Է� : ");
					num = scan.nextInt();
					tv.cn(num);
					break;
				case 3:
					
					System.out.print("ä�� ���� :");
					str = scan.next();
					tv.cn2(str);
					break;
				case 4:
					System.out.println("����");
					System.exit(0);

				}

			} 
		}else {
			System.out.println("����");
			System.exit(0);

		}

	}
}
