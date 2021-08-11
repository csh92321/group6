package day11_set_get;

import java.util.Map;
import java.util.Scanner;

class Tv {
	private int SBS = 5, KBS2 = 7, KBS = 9, MBC = 11, EBS = 13;
	private int cnum;
	

	public void ch() {
		System.out.println("SBS : " + SBS + "번");
		System.out.println("KBS2 : " + KBS2 + "번");
		System.out.println("KBS : " + KBS + "번");
		System.out.println("MBC : " + MBC + "번");
		System.out.println("EBS : " + EBS + "번");
		System.out.println("==============");
	}

	public void cn(int num) {
		if (num == 5) {
			System.out.println(SBS + "번" + "SBS로 변경되었습니다");
			cnum = 5;
		} else if (num == 7) {
			System.out.println(KBS2 + "번" + "KBS2로 변경되었습니다");
			cnum = 7;
		} else if (num == 9) {
			System.out.println(KBS + "번" + "KBS로 변경되었습니다");
			cnum = 9;
		} else if (num == 11) {
			System.out.println(MBC + "번" + "MBC로 변경되었습니다");
			cnum = 11;
		} else if (num == 13) {
			System.out.println(EBS + "번" + "EBS로 변경되었습니다");
			cnum = 13;
		}else {
			cnum=num;
			System.out.println("현재 채널 : " + cnum);
		}

		}

	public void cn2(String str) {
		if (str.contains("위")) {
			cnum++;
			cn(cnum);
		} else if (str.contains("아래")) {
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
		System.out.println("1.티비켜기 2.종료");
		select = scan.nextInt();
		if (select == 1) {
		while (true) {
				System.out.println("환영함 메뉴 입력");
				System.out.println("1. 채널목록 확인");
				System.out.println("2. 번호로 채널 변경");
				System.out.println("3. 채널 위 아래 변경");
				System.out.println("4. 티비 끄기");
				System.out.print(">>>");
				int choice = scan.nextInt();
				switch (choice) {
				case 1:
					System.out.println("==== TV =====");
					System.out.println("----채널 목록----");
					tv.ch();
					break;
				case 2:
					System.out.print("채널 번호 입력 : ");
					num = scan.nextInt();
					tv.cn(num);
					break;
				case 3:
					
					System.out.print("채널 변경 :");
					str = scan.next();
					tv.cn2(str);
					break;
				case 4:
					System.out.println("종료");
					System.exit(0);

				}

			} 
		}else {
			System.out.println("종료");
			System.exit(0);

		}

	}
}
