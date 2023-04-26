package com.sist.utill;
import java.text.SimpleDateFormat;
import java.util.*;
public class 라이브러리_Calendar_3 {
	public static void log()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("mm분 ss초");
		long start=System.currentTimeMillis();
		Date date1=new Date(start);
		System.out.println(sdf.format(date1));
		for(int i=0;i<100;i++)
		{
			try {
				Thread.sleep(10);
			}catch (Exception e) {}
		}
		long end=System.currentTimeMillis();
		long result=end-start;
		System.out.println(result);
		Date date2=new Date(end);

		System.out.println(sdf.format(date2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long a=System.currentTimeMillis();
		//Date date=new Date(a);
		//System.out.println(date);
		log();
	}

}
