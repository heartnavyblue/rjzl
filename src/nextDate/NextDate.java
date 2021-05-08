package nextDate;

import java.util.Scanner;

public class NextDate {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int year,month,day;	
		System.out.println("请分别输入年、月、日:");
		System.out.print("年:");
		year = in.nextInt();
		while(!(year>=1000&&year<=9999))
		{
			System.out.println("不可能");
			return;
		}
		System.out.print("月:");
		month = in.nextInt();
		while(month>12||month<1)
		{
			System.out.println("不可能");
			return;
		}
		System.out.print("日:");
		day = in.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			while(day>31||day<1)
			{
				System.out.println("不可能");
				return;
			}
		}
		if(month==4||month==6||month==9||month==11)
		{
			while(day>30||day<1)
			{
				System.out.println("不可能");
				return;
			}
		}
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			if(month==2)
			{
				if(day>29)
				{
					System.out.println("不可能");
					return;
				}
				else
				{
					if(day==29)
						day=1;
					else
						day++;
				}
			}
		}
		else
		{
			if(month==2)
			{
				if(day>28)
				{
					System.out.println("不可能");
					return;
				}
				else
				{
					if(day==28)
						day=1;
					else
						day++;
				}
			}
		}
		switch (month) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if(day==31)
			{
				month++;
				day=1;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
			else
			{
				day++;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
		case 2:
			if(day==1)
			{
				month++;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
			else
			{
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if(day==30)
			{
				month++;
				day=1;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
			else
			{
				day++;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
		case 12:
			if(day==31)
			{
				year++;
				month=1;
				day=1;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
			else
			{
				day++;
				System.out.println("下一天："+year+"年"+month+"月"+day+"日");
				break;
			}
		}
	}

}
