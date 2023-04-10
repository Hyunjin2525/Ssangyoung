import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int no=scan.nextInt();
		
		if(no>=60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}

	}

}
