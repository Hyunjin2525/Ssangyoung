import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int no=scan.nextInt();
		
		if(no%3==0)
		{
			System.out.println(no+"는(은) 3의 배수입니다");
		}
		else
		{
			System.out.println(no+"는(은) 3의 배수가 아닙니다");
		}
		
	
		

	}

}
