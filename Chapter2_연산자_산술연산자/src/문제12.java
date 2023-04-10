/*
 * 데이터 저장 ======> 데이터 가공 =====> 결과값 출력
 *     |								System.out.println()
 *1) 직접 값을 입력
 *2)사용자로부터 입력을 받는다
 *3) 난수
 *----------------- 메모리
 *4) 파일에 읽기
 *5) 오라클에서 읽기 
 * 
 * 
 */



import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//in은 입력값을 받는다
//		System.out.print("정수 입력:");// 두번에 받는법
//		int num1=scan.nextInt();
//		System.out.print("정수 입력:");
//		int num2=scan.nextInt();
		
		System.out.println("정수 두개를 입력하세요(20 30):");//한번에 받는 법
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		
		System.out.println("뺄셈:" + (num1-num2)+","+ "곱셈:" + (num1*num2));
		

	}

}
