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
		if (str.contains("상하")) {
			setStr(str);
		} else if (str.contains("좌우")) {
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
		System.out.println("==== 선풍기 ====");
		System.out.println("");
		System.out.println("선풍기 가동? (on/off)");
		System.out.print(">>>");
		String s = scan.next();
		int a = f.power(s);
		if (a == 1) {
			System.out.println("선풍기를 켭니다");
		} else {
			System.out.println("선풍키 종료");
			System.exit(0);
		}
		while (true) {
			System.out.println("===========");
			System.out.println("1.바람세기 2.회전 3.종료");
			System.out.print(">>>");
			num = scan.nextInt();
			switch (num) {
			case 1:
				System.out.println("바람세기 조절 1~4");
				System.out.print(">>>");
				num = scan.nextInt();
				f.powerup(num);
				if (f.getWind() == 0) {
					System.out.println("바람은 1~4단 입니다.");
					break;
				}
				System.out.println("바람세기 : " + f.getWind() + "단");
				break;

			case 2:
				System.out.println("선풍기를 회전합니다 상하 or 좌우");
				String str = scan.next();
				f.tn(str);
				if (f.getStr() == null) {
					System.out.println("상하,좌우 중 입력");
					break;
				}
				System.out.println("선풍기가 " + f.getStr() + "로 회전 합니다.");
				break;
			case 3:
				System.out.println("종료합니다");
				System.exit(0);
			}

		}

	}
}
