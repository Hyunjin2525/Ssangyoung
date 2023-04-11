// 계산시 제작
import java.util.Scanner;
public class 메소드_2 {
	//+
	static int plus(int a, int b)
	{
		return a+b;
	}
	//-
	static int minus(int a, int b)
	{
		return a-b;
	}

	//*
	static int gop(int a, int b)
	{
		return a*b;
	}
	///
	static String div(int a,int b)
	{
	 String res=""; //초기값 시킨 것 (int였으면 int res=0;
	 if(b==0)
		 res="0으로 나눌 수 없습니다";
	 else
		 res=a+"/"+b+"="+(a/(double)b);
	 return res;
	}
	static void process() // 계산기 출력 따로 만들기(재사용)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int a=scan.nextInt();
		
		System.out.println("첫번째 정수 입력:");
		int b=scan.nextInt();
		
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		int res=0;
		switch(op)
		{
		case "+":
			res=plus(a,b);
			System.out.printf("%d+%d=%d",a,b,res);
			break;
		case "-":
			res=minus(a,b);
			System.out.printf("%d-%d=%d",a,b,res);
			break;
		case "*":
			res=gop(a,b);
			System.out.printf("%d*%d=%d",a,b,res);
			break;
		case "/":
			String s=div(a,b);
			System.out.println(s);
			
			
			
		
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
