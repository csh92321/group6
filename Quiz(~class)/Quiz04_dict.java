package day11_set_get;

import java.util.Scanner;

class ff {

	public int word(String str) {
		if (str.contains("강")) {
			return 1;
		} else if (str.contains("바다")) {
			return 2;
		} else if (str.contains("산")) {
			return 3;
		} else if (str.contains("물")) {
			return 4;
		} else
			return 0;
	}
}

public class Quiz04_dict {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ff wo = new ff();

		System.out.println("====백과사전====");
		System.out.print("입력 : ");
		String str = scan.next();

		switch (wo.word(str)) {
		case 0:
			System.out.println(str + "은 없는 단어 입니다");
			break;
		case 1:
			System.out.println("River");
			break;
		case 2:
			System.out.println("Sea");
			break;
		case 3:
			System.out.println("Mountain");
			break;
		case 4:
			System.out.println("Water");
			break;

		}

	}
}
