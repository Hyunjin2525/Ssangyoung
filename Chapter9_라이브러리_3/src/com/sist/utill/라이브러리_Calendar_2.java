package com.sist.utill;
// Date => Calendar
import java.util.*;
public class 라이브러리_Calendar_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);//설정시      //Month= 0부터시작하기때문에
		cal.set(Calendar.DATE, day);

		System.out.println("======== 설정된 날짜 =======");
		System.out.println("년도:"+cal.get(Calendar.YEAR));
		System.out.println("월:"+(cal.get(Calendar.MONTH)+1));//읽기시 month+1
		System.out.println("일:"+cal.get(Calendar.DATE));
		String[] week= {"","일","월","화","수","목","금","토"};
		System.out.println("요일:"+week[cal.get(Calendar.DAY_OF_WEEK)]);// week-1
		
		

	}

}
