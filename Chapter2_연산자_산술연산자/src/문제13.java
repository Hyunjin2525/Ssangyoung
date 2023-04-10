import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num1=scan.nextInt();
//		
//
//		System.out.print("정수 입력:");
//		int num2=scan.nextInt();
//		
//		
//		System.out.print("정수 입력:");
//		int num3=scan.nextInt();
		int num1,num2,num3;
		System.out.print("정수 세개를 입력하세요(10 20 30):");
		 num1=scan.nextInt();
		 num2=scan.nextInt();
		 num3=scan.nextInt();
		
		
		System.out.printf("%d * %d + %d = %d", num1,num2,num3,num1*num2+num3);
		
		
		

	}

}
