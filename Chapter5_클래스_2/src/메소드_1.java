/*
 *  변수   연산자  제어문   출력
 *  ---   -----------   ---
 *   |         |         |
 *  배열      명령문       Application
 *  클래스     ----      ------------
 *           메소드       Web Application
 *  ------------------------------------
 *  클래스
 *  ------
 *  1. 메소드 (*****)
 *  = 사용자 정의
 *  = 라이브러리 (암기) => 리턴형/ 매개변수 / 기능
 *  String trim() => 좌우 공백 제거
 *  double random() => 0.0~0.99 => 임의의 수를 추출
 *  2. 변수(맴버) => 프로그램 종료시까지 메모리 유지 (사라지지 않음)
 *  3. 생성자
 *  -----------------------------------------------------        
 *  객체 지향 프로그램 : 유지보수 (데이터보호, 재사용, 수정, 추가)
 *                            캡슐화    상속/포함    오버라이딩/오버로딩
 *  4. 비정상 종료를 방지하는 프로그램 : 견고한 => 예외처리
 *  ------------------------------------------ 8장 (기본)
 *  5. 자바에서 지원하는 라이브러리 => 조립식
 *  -------------------------------------------------------
 *  *** 오라클 연결 => 웹
 *  *** 브라우저 연결
 *      ---------- => 통합 (Spring) 
 */
// 년도를 입력받아서 윤년 여부 확인
/*
 *  메소드안에서 출력  ==> void
 *  결과값을 받아서 출력 ==< boolean
 *  ---------------------------- 리턴형 
 *  매개변수 ==> 년도 입력
 *  
 */
import java.util.Scanner;

public class 메소드_1 {
	static void isYear(int year)
	{
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.println(year+"년도는 윤년입니다");
		else System.out.println(year+"년도는 윤년이 아닙니다");
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		//isYear(year);
		boolean bCheck= isYear2(year);
		if(bCheck==true)
			System.out.println(year+"년도는 윤년입니다");
		else
			System.out.println(year+"년도는 윤년이 아닙니다");
	}
	
	static boolean isYear2(int year)
	{ 
		boolean bCheck=false;
	if((year%4==0 && year%100!=0)||(year%400==0))
		bCheck=true;
	return bCheck;
	
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	process();

	}

}
