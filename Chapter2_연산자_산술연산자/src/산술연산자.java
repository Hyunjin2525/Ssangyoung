/* 
 * -------------------------------------------
 * 1.변수, 2. 연산자, 3. 제어문, 4. 메소드, 5. 클래스
 * -------------------------------------------
 *   필수 
 * ------------------ 메소드(연산자+제어문)
 *  이항연산자 
 *  피연산자 2개 
 *  -----------
 *   ***1) 산술연산자 ( +, - , *, / , %)
 *   2) 쉬프트연산자 (비트이동연산자) (<<, >>)
 *   3) 비트연산자 (&, |, ^)
 *   ***4) 비교연산자 (==, !=,<, >, <=, >=)
 *   ***5) 논리연산자 (&&(직렬), ||(병렬) : 효율적인 연산
 *   ***6) 대입연산자 (= , +=, -=, op=)
 *    page 38 => 산술연산자
 *    ---------  
 *    +, -, * => 형변환 *** 자바에서 모든 연산은 같은 데이터형끼리만 연산이 된다
 *    			--------
 *    			int + double = double
 *    			double + double = double
 *    			'A' +10 (char+int)
 *    			----65+10 => 75
 *    			*** char는 모든 연산자를 이용해서 연산처리하면 => 자동으로 int로 변경됨
 *    			'A'<60
 *    			---
 *    			65
 *    		*** int이하(byte,short,char)데이터형 연산시에 결과값은 int다
 *    		char+char = int
 *    		byte+byte = int           
 *                  
 *   
 *   / : 정수/정수=정수
 *       5/2=2
 *       10/3=3
 *       => 평규 : 정수/실수
 *       0으로 나누면 에러 발생
 *       프로그램의 기본 (코테) 
 *       -----------
 *       1) 오류처리
 *       예) 문자열을 입력받아서 좌우대칭
 *          --------------------
 *   % : 결과값은 왼쪽 부호가 남는다
 *       5 % 2 = 1
 *       -5 % 2 = -1
 *       5 % -2 = 1
 *       -5 % -2 = -1
 *      --------------
 *          
 */ 
//사용자가 정수 세개를 입력 => 결과값 (1.총점, 2.평균)
import java.util.Scanner; // 외부에서 클래스를 불러온다
// 키보드로부터 입력된 값을 얻어오는 클래스 : Scanner (scanf())
/// BufferedReader => 예외처리
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//클래스 선언)
		//            --- 동적 메모리 할당
		//                         --------- 키보드 입력값
		System.out.print("국어점수 입력:");
		int kor=scan.nextInt();
		//System.out.println("kor="+kor);
		
		System.out.print("수학점수 입력:");
		int eng=scan.nextInt();
		//System.out.println("kor="+eng);
		
		System.out.print("영어점수 입력:");
		int math=scan.nextInt();
		//System.out.println("kor="+math);
		// 총점
		int total = kor+eng+math;
		//평균
		double avg = total/3.0; // 반드시 실수로 나워야 됨
		//결과값
		System.out.println("총점:"+total);
		//System.out.println("평균:"+avg);
		System.out.printf("평균:%.2f",avg); //소숫자 두자리 출력
		
	}

}
