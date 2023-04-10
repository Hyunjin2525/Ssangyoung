import java.util.Scanner;
//년도 / 월 / 일 -> 요일 => Calendar
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		//요일
		char [] strweek= {'일','월','화','수','목','금','토'};
		//각달의 마지막 날
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		//1. 1년도 1월 1일 ~ 전년도 까지의 총날수
		
		int total=(year-1)*365
				  +(year-1)/4
				  -(year-1)/100
				  +(year-1)/400;
		//2. 전달까지의 합
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total+=day;
		//3.요일 구하기
		int week=total%7;
		
		System.out.printf("%d년도 %d월 %d일은 %c요일입니다 ",year,month,day,strweek[week]);
		
		
		
		

	}

}
