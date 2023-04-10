/*
 *  다중 조건문 : 조건이 맞는 문장을 수행하고 종료 (한개 문장만 수행)
 *  			=> 여러개를 수행 : 단일 조건문을 사용해야 된다
 *  예) 1~100까지 숫자중 3의 배수, 5의 배수, 7의 배수의 합을 출력한다
 *                    ----------------------- 단일 3개 사용
 *                    15(중복 수행이 있기 때문에 단일을 사용)
 *                    
 *  형식)
 *      if(조건문)
 *      {
 *         true일때 수행하는 문장 작성 ==> 종료
 *         false
 *           ↓
 *      }
 *      else if(조건문)
 *      {
 *      true일때 수행하는 문장 작성 ==> 종료
 *         false
 *           ↓
 *      }
 *      else if 
 *      {
 *      true일때 수행하는 문장 작성 ==> 종료
 *         false
 *           ↓
 *      }
 *      else ==> 생략이 가능 //전체의 대한 else문장
 *      {
 *         해당 조건이 없는 경우에 처리되는 문장
 *      }
 *      
 *      사칙연산 (+,-,*,/) ==> %
 */
//사칙연산 처리
import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		int num2= scan.nextInt();
		System.out.println("연산자 (+,-,*,/) 입력:");
		char op= scan.next().charAt(0);//문자열중에 첫번째에 있는 문자를 주출
		
		//경우 
		if(op=='+')
		{
			System.out.printf("d%+%d=%d\n",num1,num2,num1+num2);
		}
		else if (op=='-') {
			System.out.printf("d%+%d=%d\n",num1,num2,num1-num2);
			
		}
	    else if (op=='*') {
	    	System.out.printf("d%+%d=%d\n",num1,num2,num1*num2);
			
		}
	    else if (op=='/') {
	    	if(num2==0)
	    		System.out.println("0으로 나눌 수 없습니다!!");
	    	else //0이 아니라면
	    	System.out.printf("d%+%d=%.2f\n",num1,num2,num1/(double)num2);
		
	    }
	    else{
		
	    }
		
		

		

	}

}
