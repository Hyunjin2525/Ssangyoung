import java.util.Scanner;// 라이브러리, 사용자 정의=> 클래스가 다른 폴더에 저장된 경우
//import가 생략이 가능 라이브러리 => java.lang.*
//math,String,Object
/*
 * java.util
 * java.text
 * java.io
 * java.net
 * ----------
 * java.sql => 1.0
 * javax~~ ==> 1.2(Web)
 * 기타=> 외부에서 만든 라이브러리 => org/com
 * 
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		
		int no=scan.nextInt();
		
		if(no>0)
		{
			System.out.println(no+"양수입니다");
		}
		else {
			System.out.println(no+"음수입니다");
		}

	}

}
