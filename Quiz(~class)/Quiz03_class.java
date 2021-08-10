package day11_set_get;

import java.util.Scanner;

public class Quiz03_class {

	Scanner scan = new Scanner(System.in);
	int choice;
int total;
	String name;

	public int select() {
		this.choice = scan.nextInt();
		if (choice == 1) {
			total = total + 1000;
			name="에스프레소";
			return 1;
		} else if (choice == 2) {
			total = total + 1500;
			name="아메리카노";
			return 2;
		} else if (choice == 3) {
			total = total + 1300;
			name="룽고";
			return 3;
		} else if (choice == 4) {
			total = total + 2000;
			name="라떼";
			return 4;
		} else {
			return 0;
		}
	}

	public int Hce() {
		if (choice != 0) {
			choice = scan.nextInt();
			if (choice == 1) {
				total = total + 500;
				name= "아이스 "+name;
				return 1;
			} else {
				name="따듯한 "+name;
				return 0;
			}
		}
		return 0;
	}

	public int been() {
		choice=scan.nextInt();
		if(choice==1) {
			name=name+"(케냐)";
			return 1;
		}else if(choice==2) {
			name=name+"(에티오피아)";
			total=total+500;
			return 2;
			
		}else if (choice==3) {
			name=name+"(과테말라)";
			total=total+300;
			return 3;
		}else return 1;
		
	}
	public int buy () {
		choice = scan.nextInt();
		if (choice==1) {
			return 1;
		}else {
			return 2;
		}
		
		
	}
	
	
	public int total() {
		return total;
	}
	public String name() {
		return name;
	}
}
