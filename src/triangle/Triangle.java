package triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner in=new Scanner(System.in);
		int a,b,c;
		System.out.println("����������1��200��������");
		System.out.print("A:");
		a=in.nextInt();
		System.out.print("B:");
		b=in.nextInt();
		System.out.print("C:");
		c=in.nextInt();
		in.close();
		System.out.print("��״:");	
		if(a>0 && b>0 && c>0 && a<200 && b<200 && c<200)
		{
			if(a+b<=c || a+c<=b || b+c<=a)
				System.out.println("���ܹ���������");
			else
			{
				System.out.println("�ܹ���������");
				if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
				{
					if(a==b || a==c || b==c)
						System.out.println(" �ǵ���ֱ��������");
					else
						System.out.println(" ��һ��ֱ��������");
				}
				else if(a==b && a==c && b==c)
					System.out.println(" �ǵȱ�������");
				else if(a==b && a!=c || a==c && a!=b || b==c && a!=b)
					System.out.println(" �ǵ���������");
				else
					System.out.println(" ��һ��������");
			}
		}
		else
			System.out.println("�������볬��");
		
	}

}
