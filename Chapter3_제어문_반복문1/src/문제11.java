import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int no=scan.nextInt();
//		    
//		for(int i=1; i<no; i++ )
//		{
//		 no=no+i;
//		}
//		System.out.println("1~10까지의 합:"+no);
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		int sum=0;
		for(int i=1; i<num; i++ )
			{
			 num=num+i;
			}
			System.out.println("1~10까지의 합:"+num);
			
		

	}

}
