import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int no=scan.nextInt();
		
		if(no<0)
		{
			System.out.println(-no);
		}
		else
		{
			System.out.println(no);
		}
		
		
		

	}

}
