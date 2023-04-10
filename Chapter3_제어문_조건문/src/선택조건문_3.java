//중첩 ==> if~else
// 사칙연산 +,-,*,/
import java.util.Scanner;
public class 선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두개의 정수를 입력(10 20):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("연산자 입력:");
		char op=scan.next().charAt(0);
		//문자열에서 문자 한개 추출할 경우에 사용되는 기능
		if (op=='+' || op=='=' || op== '*' || op=='/') 
		{
			if (op=='+') 
				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		    if (op=='-') 
			   System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			if (op=='*') 
				System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
				if (op=='/') 
				{
					if(num2==0)
					System.out.printf("0으로 나눌 수 없습니다");
					else 
						System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
				
				}
			
	    }
		else 
		{
			System.out.println("잘못 입력된 연산자 입니다!!");
	
		}
   }
}
			
	 
			
			
		


