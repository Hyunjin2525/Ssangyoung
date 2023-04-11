/*
 * 
 *   swith ~ case
 *   => 범위를 지정하는 것이 아니라 특정값으로 설정
 *   => 사용이 가능한 특정값은 char(문자), 정수, 문자열
 *                          ' '            " "
 *   => 많이 사용되는 위치: 게임(키보드별 처리), 메뉴, 네트워크(기능별 처리)
 *      웹 ==> 화면 전환
 *   => 형식)
 *              'B' => 문장 2, 문장3, 문장 4
 *               |
 *     switch(문자,문자열,정수)
 *     {
 *       case 'A': => case 1:, case 2:
 *          문장 1
 *          break;//switch 종료
 *        case 'B' :
 *          문장 2
 *          break;
 *        case 'C' :
 *          문장 3
 *          break; // break가 없으면 모든 문장을 다 시행한다
 *         default :
 *         문장 4 ==> A,B,C가 아닌 경우에 처리 =>  생략이 가능
 *     }                            
 */
import java.util.Scanner;
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======메뉴======");
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.로그아웃");
		System.out.println("4.맛집추천");
		System.out.println("5.레시피만들기");
		System.out.println("6.프로그램 종료");
		System.out.println("================");
		
	    Scanner scan=new Scanner(System.in);
	    System.out.print("메뉴 클릭(1~6):");
	    int menu=scan.nextInt();
	    switch(menu) {   //범위가 많으면 iF문쓰기
	    case 1:
	    	System.out.println("로그인 요청하였습니다");
	    	break;
	    case 2:
	    	System.out.println("회원가입을 요청하였습니다");
	    	break;
	    case 3:
	    	System.out.println("로그아웃을 요청하였습니다");
	    	break;	
	    case 4:
	    	System.out.println("맛집 추천을 요청하였습니다");
	    	break;
	    case 5:
	    	System.out.println("레시피 만들기 요청");
	    	break;
	    case 6:
	    	System.exit(0); // 프로그램 완전 종
	    	//0이면 정상 종료, 다른번호일 시 비정상 종료
	    	break;	
	    default:
	    	System.out.println("메뉴에 없는 번호입니다");
	    }
	}

}
