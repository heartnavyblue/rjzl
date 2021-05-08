package triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("请输入三个1到200的整数：");
		System.out.print("A:");
		a=in.nextInt();
		System.out.print("B:");
		b=in.nextInt();
		System.out.print("C:");
		c=in.nextInt();
		in.close();
		System.out.print("形状:");	
		if(a>0 && b>0 && c>0 && a<200 && b<200 && c<200)
		{
			if(a+b<=c || a+c<=b || b+c<=a)
				System.out.println("不能构成三角形");
			else
			{
				System.out.println("能构成三角形");
				if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
				{
					if(a==b || a==c || b==c)
						System.out.println(" 是等腰直角三角形");
					else
						System.out.println(" 是一般直角三角形");
				}
				else if(a==b && a==c && b==c)
					System.out.println(" 是等边三角形");
				else if(a==b && a!=c || a==c && a!=b || b==c && a!=b)
					System.out.println(" 是等腰三角形");
				else
					System.out.println(" 是一般三角形");
			}
		}
		else
			System.out.println("参数输入超限");
		
	}

}
