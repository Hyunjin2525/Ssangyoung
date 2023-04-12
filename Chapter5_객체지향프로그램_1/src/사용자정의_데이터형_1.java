/*
 *  1. 클래스의 구성요소
 *  class ClassName
 *  {
 *   -------------------
 *   1) 변수 설정
 *   -------------------
 *   3) 생성자 설정 => 필요시에만 사용 => 설정하지 않는 경우에는 컴파일러가 자동으로 생성자를 만들어 준다
 *   -------------------
 *   2) 메소드 설정
 *   -------------------
 *  }
 * 
 *  1) 변수의 종류
 *    ----------
 *    클래스 영역에 선언하는 변수(멤버 변수) ==== heap
 *      = 인스턴스 변수 : new를 사용할 때 저장되는 변수(new설정에 따라 따로 저장)
 *         = 클래스객체명.변수명
 *         Card c1=new Card()  //예) 안에 number,무늬 변수가 있음
 *         c1.number=10
 *      = 정적 변수 : 한개의 공간에 저장되는 변수
 *         Card c1=new Card()
 *         c1.number
 *         Card.nember(******)
 *      ------------ 프로그램 종료시까지 사용 변수
 *    메소드 영역에 선언하는 변수 (지역 변수) ==== stack
 *    ------- 메소드가 종료되면 사라지는 변수
 *    1) 메소드 영역에 선언되는 변수
 *       void aaa()
 *       {
 *          int a=10;
 *       
 *       }
 *    2) 매개변수
 *    void aaa(int a)
 *    {
 *    
 *    }
 *    
 *    자바 메모리 구조
 *    ---------------
 *    Method Area => method,static
 *    ---------------
 *    Stack: 메모리 자체에서 관리(생성/소멸) => 블럭변수
 *           매개변수, 지역변수
 *           => 변수의 초기화가 안된다
 *           (반드시 초기화를 한 다음에 사용)
 *    --------------- => 메모리에서 자동으로 저장
 *    Heap : 프로그래머 영역 (직접 메모리 크기를 만들어서 저장)
 *           자동 소멸이 안된다 => GC (System.gc())
 *    ----------------------------
 *    heap, method area => 변수 저장시에 자동 초기화된다
 *    class CalssName{
 *      int a; => 0 (자동 초기화 됨)
 *      double d; =>0.0
 *      boolean c; => false
 *      char c; => '\u00000'
 *      long l; => 0L
 *      String s; => null
 *      **null은 참조타입 => 주소를 가지고 있지 않은 상태
 *      예)
 *       String s;= null값   String s="";  ""=주소
 *       int[] arr;
 *      
 *    }
 *    ---------------
 * 
 *   ---------------------------------------------------------------------------
 *    변수유형        선언위치                 메모리 저장                사용범위
 *   ---------------------------------------------------------------------------
 *    인스턴스변수    클래스블록            new: 새로운 저장공간을 만든다     클래스 전체
 *                 class ClassName    heap메모리에 저장
 *                 {
 *                 int a;
 *                 }
 *   -----------------------------------------------------------------------------
 *    정적변수       클래스 블럭            컴파일시 자동 저장
 *                 classs CalssName
 *                 {
 *                   static int a;
 *                   =>많이 사용되는 변수는 아니다
 *                 }
 *   ------------------------------------------------------------------------------
 *    지역변수      class ClassName        메소드 호출시마다          메소드안에서만 사용 가능
 *                {
 *                   void display()
 *                   {
 *                       int a=10;
 *                   }
 *                }
 *                반드시 초기화
 *   --------------------------------------------------
 *   1) 메모리 저장
 *      메모리에 저장된 상태 : 인스턴스 (객체)
 *      설계(어떤 데이터를 저장) ==> 메모리에 저장  ===============> 활용 ==========> 소멸(메모리 해제)
 *      class ClassName      ClassName c=new ClassName()     C.변수명           c=null gc()
 *                                           -----------     C.메소드명()
 *      {                                      생성자
 *         String s; 
 *         int a;
 *      }
 *      
 *      String s=" ";
 *      s.substring()
 *      s.trim()
 *      
 *      String ss="Java";
 *      ss.substring()
 *      Scanner scan=new Scanner(System.in)
 *      scan.nextInt()
 *      
 *      *** 클래스는 한개에 대한 정보를 설계
 *      맛집: 5000개
 *      ------------ new (메모리 공간이 따로 생겨서 하나 하나씩 관리할 수 있음)
 */

class Student
{
	String name;
	int kor;
	int eng;
	int math;
	
}
public class 사용자정의_데이터형_1 {
	/*
	 *      Student
	 *      ---------name
	 *      
	 *      ---------kor
	 *      
	 *      ---------eng     
	 *      
	 *      ----------math
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Student s1=new Student();
		// int a = 10 ===> 주소
		System.out.println("s1="+s1);
		//s1= name,kor,eng,math
		s1.name="홍길동";
		s1.kor=90;
		s1.eng=80;
		s1.math=70;
				
		Student s2=new Student();
		System.out.println("s2="+s2);
		//s2= s1변수와 동일
		s2.name="심청이";
		s2.kor=80;
		s2.eng=60;
		s2.math=60;
		Student s3=new Student();
		System.out.println("s3="+s3);
		s3.name="강감찬";
		s3.kor=50;
		s3.eng=90;
		s3.math=90;
		
	   System.out.println(s1.name+" "+s1.kor+" "+s1.eng+" "+s1.math);
	   System.out.println(s2.name+" "+s2.kor+" "+s2.eng+" "+s2.math);
	   System.out.println(s2.name+" "+s3.kor+" "+s3.eng+" "+s3.math);
		
	}

}
