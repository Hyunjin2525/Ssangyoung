// && ||
/*
 *  (조건) && (조건)
 *  -----    -----
 *    |        |  
 *    ----------
 *         |
 *        결과
 *   && => 범위나 기간에 포함
 *        
 *   -----------------
 *    true true = true  
 *   ------------------
 *   true  false = false
 *   -----------------
 *   false  true = false
 *   -------------------
 *   false  false = false
 *   ----------------------
 *   
 *  || => 범위나 기간을 벗어난 경우: 행사
 *   -----------------
 *    true true = true  
 *   ------------------
 *   true  false = true
 *   -----------------
 *   false  true = true
 *   -------------------
 *   false  false = false
 *   --------------------
 *   
 *   => **효율적 연산 
 *    () && ()
 *          --
 *    false      
 *    () || ()
 *          --
 *    true
 *    
 *    int a=10;
 *    int b=9;
 *    
 *    (a<b) && ++b==a  ==> false // b=9가 된다, 앞이 false가 나와서 뒤에 ++b는 증가할 수 없게 된다
 *    
 *    
 *    
 *    
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int a=10;
//        int b=9;
//        boolean bCheck = (a<b) || ++b==a;
//        
//        System.out.println(bCheck);
//        System.out.println("b="+b);
//		int a=100;
//		int b=99;
//		boolean bCheck = (a>b) && (b==a);
//		System.out.println(bCheck);
//		
//		bCheck = (a>b) || (b==a);
//		System.out.println(bCheck);
//		
		
//		char c=(char)((Math.random()*26)+65);
//		boolean bCheck= c>= 'A' && c<='Z';
//		System.out.println("c="+c);
//		System.out.println(bCheck);
        
//		char sex='M';
//		int score=87;
//		boolean bCheck= (sex=='M' && score<=80); // and연산은 로그인할 때 많이 사용
//		System.out.println(bCheck);
		
		//int a=10;
		//boolean bCheck= a%2==0 && a>2;
		//System.out.println(bCheck);
		
		int year=2024;
		boolean bCheck=((year%4==0 && year%100!=0)||(year%400==0)); //윤년 계산
		System.out.println(bCheck);
		
	}

}
