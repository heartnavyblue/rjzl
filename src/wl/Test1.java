package wl;



import java.util.Scanner;

public class Test1 {
	public static void main(String[] ars) {
		Scanner input = new Scanner(System.in);
		String a, b, c;
		int num_a, num_b, num_c;

		try {
			System.out.println("�����������ε������ߣ�ֻ��Ϊ��������");
			System.out.print("������a�ı߳���");
			a = input.nextLine();
			System.out.print("������b�ı߳���");
			b = input.nextLine();
			System.out.print("������c�ı߳���");
			c = input.nextLine();

			num_a = Integer.parseInt(a);
			num_b = Integer.parseInt(b);
			num_c = Integer.parseInt(c);

			if (num_a > 0 && num_a <= 200 && num_b > 0 && num_b <= 200
					&& num_c > 0 && num_c <= 200) {
				if (num_a + num_b > num_c && num_a + num_c > num_b
						&& num_b + num_c > num_a) {
					if (num_a != num_b && num_a != num_c && num_c != num_b) {
						System.out.println("һ��������");
					} else if (num_a == num_b && num_a == num_c
							&& num_c == num_b) {
						System.out.println("�ȱ�������");
					} else if (num_a == num_b || num_a == num_c
							|| num_c == num_b) {
						System.out.println("����������");
					}
				} else {
					System.out.println("���ܹ���������");
				}
			} else {
				System.out.println("�������볬��");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��������Ƿ�");
		}
	}
}
