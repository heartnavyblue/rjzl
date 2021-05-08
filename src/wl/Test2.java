package wl;



import java.lang.annotation.ElementType;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year, month, day;
		System.out.println("�������ꡢ�¡���: ");
		System.out.print("��: ");
		year = input.nextInt();
		System.out.print("��: ");
		month = input.nextInt();
		System.out.print("��: ");
		day = input.nextInt();
		Data data = new Data(year, month, day);
		data.add();
		data.show();

	}
}

class Data {
	private int year;
	private int month;
	private int day;
	private int flag = 0;

	public Data(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	void add() {
		if (year >= 1 && year <= 2050) {
			if (month == 1 || month == 3 || month == 5 || month == 7
					|| month == 8 || month == 10) {
				if (day > 0 && day < 31) {
					day++;
				} else if (day == 31) {
					month++;
					day = 1;
				} else {
					System.out.println("������");
					flag = 1;
				}
			} else if (month == 12) {
				if (day > 0 && day < 31) {
					day++;
				} else if (day == 31) {
					year++;
					month = 1;
					day = 1;
				} else {
					System.out.println("������");
					flag = 1;
				}
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day > 0 && day < 30) {
					day++;
				} else if (day == 30) {
					month++;
					day = 1;
				} else {
					System.out.println("������");
					flag = 1;
				}
			} else if (month == 2
					&& ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
				if (day > 0 && day < 29) {
					day++;
				} else if (day == 29) {
					month++;
					day = 1;
				} else {
					System.out.println("������");
					flag = 1;
				}
			} else if ((month == 2 && ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)))) {
				if (day > 0 && day < 28) {
					day++;
				} else if (day == 28) {
					month++;
					day = 1;
				} else {
					System.out.println("������");
					flag = 1;
				}
			}
		}
	}

	void show() {
		if (flag != 1) {
			System.out.println("��һ�죺" + year + "��" + month + "��" + day + "��");
		}
	}

}
