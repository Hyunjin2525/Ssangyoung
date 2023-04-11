 //중첩 switch
/*
 *   if문 중첩
 *   if()
 *   {
 *     if() {
 *     }
 * 	 }
 *  // 특별한 경우가 아니면 거의 사용빈도가 없다
 *  switch()
 *  {
 *   case 값:
 *     switch()
 *     {
 *     }
 *   
 *  }
 */
// 가위바위보
/*
 *   가위
 *      가위
 *      바위
 *      보
 *   바위
 *      가위
 *      바위
 *      보
 *   보
 *      가위
 *      바위 
 *      보
 *    
 * 
 */
import java.util.Scanner;
public class 선택문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터가 먼저 가위바위보를 설정
		int com=(int)(Math.random()*3); //0 가위, 1 바위, 2 보
		//사용자가 입력
	    Scanner scan=new Scanner(System.in);
	    System.out.println("가위(0),바위(1),보(2):");
	    int user=scan.nextInt();

	    switch(com)
	    {
	    case 0:
	    	System.out.println("컴퓨터:가위");
	    	break;
	    	//break밑에는 소스 코딩이 있는 경우에 오류 발생
	    case 1:
	    	System.out.println("컴퓨터:바위");
	    	break;
	    case 2:
	    	System.out.println("컴퓨터:보");
	    	break;	
	    }
	    
	    switch(user)
	    {
	    case 0:
	    	System.out.println("플레이어:가위");
	    	break;
	    	//break밑에는 소스 코딩이 있는 경우에 오류 발생
	    case 1:
	    	System.out.println("플레이어:바위");
	    	break;
	    case 2:
	    	System.out.println("플레이어:보");
	    	break;	
	    }
		//비교(처리) => 결과값을 출력
	    switch(com)
	    {
	    case 0:// 가위
	    	switch(user)
	    	{
	    	case 0:
	    		System.out.println("비겼다");
	    		break;
	    	case 1:
	    		System.out.println("사용자 Win");
	    		break;
	    	case 2:
	    		System.out.println("컴퓨터 Win");
	    		break;
	    	}
	    	break;
	    }
	  //바위
	    	switch(com)
	    	{
	    case 1:
	    	switch(user)
	    	{
		case 0:
    		System.out.println("컴퓨터 win");
    		break;
    	case 1:
    		System.out.println("비겼다");
    		break;
    	case 2:
    		System.out.println("사용자 Win");
    		break;
    		}
	    	break;
	    	}
	    	switch(com)
	    	{
	    case 2://보
	    	switch(user)
	    	{
		case 0:
    		System.out.println("비겼다");
    		break;
    	case 1:
    		System.out.println("사용자 Win");
    		break;
    	case 2:
    		System.out.println("컴퓨터 Win");
    		break;
    		}
	    	break;
	    	}
	    }
		//변수 설정 => 변수에 대한 처리(연산자,제어문) => 결과값을 출력
		

	}


