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
			name="����������";
			return 1;
		} else if (choice == 2) {
			total = total + 1500;
			name="�Ƹ޸�ī��";
			return 2;
		} else if (choice == 3) {
			total = total + 1300;
			name="���";
			return 3;
		} else if (choice == 4) {
			total = total + 2000;
			name="��";
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
				name= "���̽� "+name;
				return 1;
			} else {
				name="������ "+name;
				return 0;
			}
		}
		return 0;
	}

	public int been() {
		choice=scan.nextInt();
		if(choice==1) {
			name=name+"(�ɳ�)";
			return 1;
		}else if(choice==2) {
			name=name+"(��Ƽ���Ǿ�)";
			total=total+500;
			return 2;
			
		}else if (choice==3) {
			name=name+"(���׸���)";
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
