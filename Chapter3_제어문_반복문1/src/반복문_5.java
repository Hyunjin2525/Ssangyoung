// 사용자의 입력 받아서 (구구단) => 3
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력:" );
		
	  int dan=scan.nextInt();
	  System.out.println("======"+dan+"========");
	  for(int i=1;i<=9;i++)
	  {
		  System.out.printf("%d*%d=%d\n",dan,i,dan*i);
	  }

	}

}
