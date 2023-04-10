

/*
 * 
 *  메소드 : 클래스의 구성 요소 (동적)
 *  -----
 *  1) 특정 기능을 수행하는 명령문의 집합
 *                     ----- 연산자 / 제어문
 *  2) 한가지 기능만 수행 할 수 있게 한다
 *      예) 
 *      댓글
 *      ------------- 댓글(class)
 *      댓글 목록 출력
 *      댓글 쓰기
 *      댓글 수정
 *      댓글 삭제
 *      -------------
 *      게시판 (class)
 *      -------------
 *      글쓰기 
 *      목록출력
 *      상세보기  ------ 메소드
 *      수정 
 *      삭제
 *      --------------
 *      
 *      영화(class)  ====> 상속 (메가박스) ====> 상속 (롯데시네마)
 *      ---------
 *      목록출력
 *      상세보기
 *      예약하기   ----- 메소드
 *      추천하기
 *      검색하기
 *      --------
 *      
 *     3) 메소드 구성 요소
 *        선언부
 *        void display()
 *        구현부
 *        {
 *          처리
 *          
 *        }
 *        
 *        선언부  
 *        [접근지정어] [옵션] 리턴형 메소드명(매게변수..)-- 사용자가 요청한 값(0개 이상)
 *                               ---- 알파벳,한글로 시작(알파벳은 대소문자 구분)
 *                               숫자 사용이 가능 (앞에 사용 금지)
 *                               키워드는 사용 금지
 *                               특수문자 사용가능 (_,$)
 *                               공백을 사용할 수 없다
 *                               *** 소문자로 시작한다
 *                        ----- 기본형(int, long, byte, double,char,boolean)
 *                        ----- 배열, 클래스
 *        ---------- static/final/abstract
 *        public /protected/default/private
 *        
 *        static int add(int a, int b)
 *        {
 *           return a+b;
 *        }
 *        
 *        호출
 *        넘겨준 데이터를 받아서 저장
 *        int result=add(10,20);
 *            ------ 30
 *            
 *        *** 메소드를 호출시에는 메소드는 처음부터 끝까지 수행한후에 호출된 위치로 온다
 *        
 *       메소드 만드는 방법
 *       --------------
 *       리턴형    매개변수 
 *        O        O => String substring(int s,int e)
 *                      String s="Hello Java";
 *                      String ss=s.substring(0,5) //변수를 받아와야 한다
 *        O        X 
 *        X        O
 *        X        X
 *       --------------
 *        
 */
public class 문제풀이 {
	static void me()
	{
		System.out.println("me1 진입...");
	   System.out.println("me1 기능 처리...");
	   System.out.println("me1 종료...");
	}
//	static boolean idLogin(String id)
//	{
//		
//	}
//	
//	static String[] post(String adr) 
//	{
//		
//	}
//	
//	static void gugudan()
//	{
//		
//	}
	
	static void method1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println();
	}
	
	
	static int method2()
	{ 
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
		
	}
	
	static int method3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	
	static double method4(int a,int b)
	{
		return a/(double)b;
	}
	
	static String method5(String s)
	{
//		String result="";
//		for(int i=0;i<s.length();i++)
//		{
//			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
//				result+=s.charAt(i);
//			else if(s.charAt(i)>='a'&& s.charAt(i)<='z')
//				result+=(char)(s.charAt(i)-32);
//			
//		}
		return s.toUpperCase();
	}
	 static void method6(String s)
	 {
//		 for(int i=s.length()-1;i>=0;i--)
//		 {
//			 System.out.print(s.charAt(i));
//		 }
		 StringBuffer sb=new StringBuffer();
		 sb.append(s);
		 String ss=sb.reverse().toString();
		 System.out.println(ss);
	 }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*System.out.println("me1 진입 전..");
	me();
	System.out.println("프로그램 종료");
     */
	String s="Hello java";
	String ss=s.substring(0,5);
	System.out.println(s);
	System.out.println(ss);
	int sum=method2();
	System.out.println("sum="+sum);
	
	double d=method4(10,3);
	System.out.printf("%.2f\n",d);
	String sss=method5("Hello Java");
	System.out.println(sss);
	method6("hello java");
	
	
	}

}
