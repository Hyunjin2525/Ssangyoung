/*
 *  피연산자 / 연산자
 *  ------ 연산 대상
 *  
 *  피연산자 1개 : 단항 연산자
 *  a++
 *  피연산자 2개 : 이항 연산자
 *  10 + 20
 *  ---  --- 피연산자
 *  피연산자 3개 : 삼항 연산자
 *  
 *  
 *  1. 단항연산자 
 *   = 증감연산자 ( ++ , -- ) 한개 증가/ 한개 감소 => 반복문
 *   	int a=10;
 *   	a++;
 *      => 11
 *      int b=10;
 *      b--;=> 9
 *   = 부정연산자 (boolean만 사용이 가능) ! => 턴
 *   	boolean b = true;
 *   	!b;
 *   	false
 *   ===> 예약가능한 날
 *   = 형변환연산자 (데이터형)
 *      (int)10.5 => 소수점 제거 10
 *      (char)65 ==> 'A'
 *      ===================== downcasting (강제형변화)
 *      (double)10 ==> 10.0
 *      (int)'A' ==> 65
 *     	===================== upcasting (자동형변환)
 *   = 반전연산자 ( 양수-> 음수) 음수표현 = ~
 *  
 *   10.5+10=20.5 ==> 데이터형이 동일할 때 연산이 가능
 *        ---
 *        10.0 ==> 20.5  ( 큰 데이터로 바꿔놓기)
 *        
 *        int이하는 데이터형은 연산시에 결과값이 int다
 *        ------ byte/short/char
 *        
 *        int + double => double
 *        char + long  => long
 *        int + long   => long
 *        long + double => double
 *        
 *        byte + char => int
 *        
 *      ex)  byte b=10;
 *           char c="A";
 *           int a=b+c;
 *           
 *         1. 단항연산자
 *         	++ : 1개 증가
 *          -- : 1개 감소
 *          
 *          형식
 *           = 전치연산자 : 먼저 증가/감소
 *           ++a
 *           = 후치연산자 : 나중에 증가/감소
 *           a++
 *        
 *       ** int a=10;
 *          int b=  ++a; // 증가후 대입
 *             -- --
 *        
 *       ** int a=10;
 *          int b= a++; // 대입후 증가
 *  		  -- --
 *        
 *        int a=10;
 *        int b= a
 *         
 *  	int a=10;
 *      int b= ++a + ++a
 *      
 *      2. 부정연산자 (!) ==> true/false
 *         !true => false	
 *         !false => true
 *         
 *         ==,!=. !(조건)
 *         
 *         3. 형변환연산자
 *         10.5 + 10.5 ==> 21.0
 *       (int)10.5 + (int)10.5 ==> 20
 *       (int)(10.5+10.5) = 21
 *        
 *  	double d=10; ==> 10.0
 *  	int a='A' = 65
 *  	-----------------
 *  
 *       ==> int 이하 데이터형은 연산시 = int
 *          ------ byte, short, char
 *            char+double = (x)
 *            
 *       ==> char는 연산이 되면 정수로 변경된다
 *       
 *       
 *       이항연산자
 *       -------
 *       산술연산자 : +, -, *, /, %
 *         => +, -, * : 데이터형
 *         => +
 *           산술연산, 문자열 결합
 *         => / 
 *         	 정수/정수 = 정수 ==> 10/3 = 3
 *         	 정수/실수 ==> 10/3.0	
 *         	 0으로 나누면 오류발생 
 *         => % /나누고 나머지
 *           10%2 ==> 0
 *           11%2 ==> 1
 *           -------------
 *           5%2=1
 *           -5%2= -1
 *           5%-2= 1
 *           -5&-2= 1
 *           ----------부호는 왼쪽편을 따라간다 
 *         
 *         ***** + 10+9=19
 *               + : 문자열 결합
 *               "7" + 77 ==> "777"
 *               7 + "7" + 7 ==> "777"
 *               7+7+"7" = "147" 
 *               7+"7"+7+7 = 7777
 *               7+"7"+(7+7) = 7714 
 */
public class 연산자의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = (int)(Math.random()*100)+1; //1부터 100까지 숫자를 가져올 때
		            //============
						//0.00~0.99
		//System.out.println(a);
		System.out.println(10/3);
		System.out.println(10/3.0);
//		byte b= 10;
//		byte d= 20;
//		int a = b+d;
		//System.out.println(~10);
		
//		int a=10;
//		int b= a++ + ++a;
//		System.out.println("a=" +a);
//		System.out.println("b=" +b);
//		boolean bCheck=false;
//		System.out.println(bCheck);
//		System.out.println(!bCheck); //! = 반대

		
		
	}

}
