package day11_set_get;

import java.util.Scanner;

public class 20210810_Fan_method {

	Quiz03_Fan fan = new Quiz03_Fan();
	
	public int Input() {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>> ");
		int input = sc.nextInt();
		return input;
	}
	
	public String windStrength(int num) {
		String str=null;
		switch (num) {
		case 1 : 
			str = "바람 1단계";
			fan.setStage(str);
			return str;
		case 2 :
			str = "바람 2단계";
			fan.setStage(str);
			return str;
		case 3 :
			str = "바람 3단계";
			fan.setStage(str);
			return str;
		case 4 :
			str = "바람 4단계";
			fan.setStage(str);
			return str;
		}
		return str;
	}
	
	public String windWay(int num) {
		String way=null;
		switch(num) {
		case 1 :
			way = "상하";
			fan.setWay(way);
			return way;
		case 2 :
			way = "좌우";
			fan.setWay(way);
			return way;
		case 3 :
			way = "고정";
			fan.setWay(way);
			return way;
		}
		return way;
	}
	
	public void view() {
		System.out.println(fan.getStage() + " " + fan.getWay());
	}
	
	
}
