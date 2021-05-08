package wl;



import java.util.Scanner;

public class Test1 {
	public static void main(String[] ars) {
		Scanner input = new Scanner(System.in);
		String a, b, c;
		int num_a, num_b, num_c;

		try {
			System.out.println("请输入三角形的三条边（只能为整数）：");
			System.out.print("请输入a的边长：");
			a = input.nextLine();
			System.out.print("请输入b的边长：");
			b = input.nextLine();
			System.out.print("请输入c的边长：");
			c = input.nextLine();

			num_a = Integer.parseInt(a);
			num_b = Integer.parseInt(b);
			num_c = Integer.parseInt(c);

			if (num_a > 0 && num_a <= 200 && num_b > 0 && num_b <= 200
					&& num_c > 0 && num_c <= 200) {
				if (num_a + num_b > num_c && num_a + num_c > num_b
						&& num_b + num_c > num_a) {
					if (num_a != num_b && num_a != num_c && num_c != num_b) {
						System.out.println("一般三角形");
					} else if (num_a == num_b && num_a == num_c
							&& num_c == num_b) {
						System.out.println("等边三角形");
					} else if (num_a == num_b || num_a == num_c
							|| num_c == num_b) {
						System.out.println("等腰三角形");
					}
				} else {
					System.out.println("不能构成三角形");
				}
			} else {
				System.out.println("参数输入超限");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("参数输入非法");
		}
	}
}
