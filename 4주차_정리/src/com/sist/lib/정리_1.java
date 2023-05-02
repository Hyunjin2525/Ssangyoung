package com.sist.lib;
/*
 *  8장 => 예외처리
 *        => 목적 : 사전에 에러를 방지하는 프로그램을 제작
 *                 비정상 종료를 방지하고 정상상태 유지
 *       => 예외처리의 방법
 *           ------ 수정이 가능한 에러
 *           1) 상속도 => 예외처리 방법에 손서 존재
 *                  Object
 *                     |
 *                 Throwable (Spring => AOP)
 *                 	   |
 *            ----------------------
 *            |                    |
 *          Error			    Exception (예외처리의 최상위 클래스)
 *                                 |
 *                CheckedExeption          UnCheckedExeption
 *             컴파일시에 예외처리여부 확인       예외처리 여부를 미확인    
 *             => 예외처리를 반드시 한다         => 필요시에만 작업
 *                                          => 자주 오류나는 부분은 예외하는 것이 좋다
 *                                          => NumberFormatException
 *                                             (사용자 입력)
 *                                           ***에러 : 사용자 입력
 *                                          =>NullPointerException
 *                     javac                             java
 *                       ---------------------------------------
 *                       |                                |
 *            IOException : file명/디렉토리명              실행시 에러 (인터프리터)
 *            ClassNorFoundException                     RuntimeException
 *            => Class.forName("패키지명. 클래스명");         |
 *            => 웹 (MVC)                                NullPointerException
 *            InterruptedException                       String s;
 *            MalforedURLException (ip,web:네트워크)       s.replace()
 *            SQLException (문법 => 오라클)                NumberFormatException
 *                                                      Integer.parseInt(" 10")
 *                                                      web
 *                                                      ---
 *                                                      데이터 전송
 *                                                      웹주소/파일?no= 10
 *                                                      ArrayIndexOutOfBoundExcception
 *                                                      ClassCastException
 *             
 *             2) 예외처리의 종류
 *                  ***= 예외복구 (프로그램머가 주로 사용)
 *                  try
 *                  {
 *                    정상적으로 수행
 *                    => 지금까지 코딩한 모든 내용
 *                    => 에러발생시 catch로 이동
 *                    
 *                  }catch(예외처리 클래스)
 *                  {
 *                    try수행시 에러가 발생할때 처리되는 문장
 *                    여러개를 사용할 수 있다
 *                    => 순서가 존대 (상속도)
 *                    => 상속을 내리는 클래스가 처리하는 예외가 많다
 *                  }
 *                  finally
 *                  {
 *                    생략이 가능
 *                    try,catch수행 상관없이 무조건 수행
 *                    => File닫기
 *                    => 오라클 연결 해제
 *                    => 서버 연결 해제
 *                  }
 *                  ***= 예외회피: 예외 떠넘기기 (라이브러리)
 *                  => 사용법 
 *                  메소드 선언 뒤에 예상되는 에러를 선언
 *                  => 메소드 호출시에는 처리할 수 있게 만든다
 *                      =======> 사용하는 프로그래머가 처리해서 사용
 *                      =======> 1) 선언
 *                               2) try~catch
 *                          예) public void method() throws 예외처리클래스, 예외처리클래스...
 *                                                         ------------------------- 순서가 없다
 *                                                          method 호출시에 예상되는 에러 체크
 *                              => 메소드 호출
 *                               public void method() throws 예외처리클래스, 예외처리클래스...
 *                               {
 *                                  method()
 *                               }
 *                               public void display()
 *                               {
 *                                 try
 *                                 {
 *                                   method();
 *                                 } catch(예외처리클래스){}
 *                                 
 *                               }
 *                               
 *                               선언된 에외클래스가 많은 경우
 *                               => 1) 전체를 사용 catch()를 여러개 사용
 *                               => 2) 전체를 포함 클래스로 통합 
 *                                     -------------------- Exception / Throwable
 *                                   
 *                                  예) 
 *                                  public void method() throws IOExcpetion,InterruptedException,SQLException
 *                                  {
 *                                  }
 *                                  
 *                                  public void display() ===> 오류
 *                                  {
 *                                     try
 *                                     {
 *                                     }catch(IOExcpetion ex)
 *                                  }
 *                              
 *                  = 예외 임의 발생 : throw (텍스트용으로 사용) => 배포
 *                  = 사용자 정의 예외처리 : 거의 상용빈도가 없다
 *                     class MyException extends Exception
 *                     =>  if문
 *              -------------------- 자바의 문법 (8장)
 *              => 프로그램에서 제어가 안되는 경우가 많다
 *                => 다른 프로그램과 연동 
 *                => 브라우저, 오라클 ...
 *                => 파일읽기 / 쓰기
 *                => 프로그램안에 다른 프로그램을 동시 도작
 *                => 자료구조 (메모리 관리)
 *                ---------------------> 직접 만들어서 제공 (라이브러리)
 *                ---------------------> 사용자 정의 클래스 + 라이브러리 => 조립
 *  9장/10장 => 라이브러리                                  
 *  -------------------
 *  java.lang : 자바 프로그램의 기본 라이브러리 (가장 많이 사용) 
 *              => import를 생략
 *       라이브러리 => 변수는 없다 / 메소드 (기능)
 *       =>Object
 *           => Object clone() : 복제 (prototype: Spring)
 *              새로운 메모리 생성
 *           => equals() : 객체 비교 (오버라이딩을 하기 전까지는 메모리 주소를 비교)
 *                                   ------- 값을 비교 = String
 *           => toString() : 객체를 문자열화 (디폴트는 메모리 주소 리턴)
 *           => finalize() : 소멸자 (객체 메모리 해제 => 자동호출)
 *       =>String
 *      
 *      ***1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
            ---------------------
		 boolean startsWith(String s)
		 => 검색기(Search Bar)

        2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
			--------------------
			boolean endsWith(String e)

	    3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
		   ------------------------
		   boolean equals(String s)
		   => 로그인 처리, 아이디 중복 ... 상세보기

		***4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
		      --------- String char[] => 인덱스 번호
		      int indexOf(String s), int indexOf(char c)

		***5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
			  --------------------------
			  int lastIndexof(String s), int lastIndexOf(char c)
			  
		***6. 문자열의 길이를 반환한다
		      ------- 문자 갯수
		      int length()

        7.정규표현식을 지정한 문자로 바꿔서 출력한다.
           ------------------- 통계/분석 => 추천
           문자형식(패턴)을 만들어서 변경하는 역할
           String replaceAll(String regex, String s)
           => 머신 런닝


		8. 지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
 		   ------------------------
			String[] split(String regex)
			=> 패턴
			[가-힣] 한글 전체
			[A-Za-z] 영문 전체
			[0-9] 숫자 전체
			==> 파일 입출력 
			--------------- 크롤링
			
		***9.문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다
		------------------------------------------------------
		   String replace(String s,String s1)
		   -------------------------------------
		   String replace(char c,char c1)
		***10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
			   -----------------------------------
			   String substring(int start,int end)
			                          ----- e-1

		11.  문자열에 대문자를 소문자로 변환한다.
		     String toLowerCase() => 오라클 (LOWER())
		
		12. 문자열에 소문자를 대문자로 변환한다.
		    Stirng toUpperCase=> 오라클 (UPPWER())		
			** 오라클은 대소문자를 구분하지 않는다
				(대소문자 구분은 실제 저장된 값)

		13. 문자열을 그대로 반환해준다.
		   String toString()


		14. 문자열에 공백을 제거해 준다.
 			=> 좌우에 있는 공백만 제거
			String trim()

		15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
			String valueOf(모든 데이터형)		
 			==> static
		16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
			boolean contains(String s)
			=> 검색

		17. 지정한 index번째에 문자를 반환한다.
			char charAt(int index)	

		18. 문자와 문자를 결합해준다.
			+, String concat(String s)

		19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.
			String format("%d%d...")
			=>static

 *       =>StringBuffer : 문자열 결합 => append()
 *       =>Wrapper
 *         ------
 *         기본데이터형을 사용하기 쉽게 기능을 부여 => 클래스
 *         int ==> integer
 *         double ==> Double
 *         boolean ==> Boolean
 *         long ==> Long
 *         => 문자열을 해당 데이터형으로 변경할 때 주로 사용
 *             "10" => 10
 *             Integer.parseInt("10")
 *             Double.parseDouble("10.5") => 10.5
 *             Boolean.parseBoolean("true") => true
 *             Long.parseLong("10") => 10L
 *         => 제네릭 사용시
 *         	  컬렉션 정수 저장
 *            List<Integer> => List<int> X
 *            ------------
 *            List<Double> 제네릭 => 항상 클래스형으로만 등록이 가능
 *          => 호환
 *           Integer i=10 => 오토박싱(박싱)
 *           int i=new Integer(10) => 언박싱
 *       =>System : gc()
 *       =>Math : ceil(), round(), random()
 *     
 *  java.util
 *  ---------
 *      => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *      => 날짜
 *         Date / Calendar
 *         Date => 기능이 없다 (단지 날짜를 저장할 목적)
 *         Calendar는 Date에 없는 기능을 보완 => 달력
 *            => 날짜 설정
 *               set(Calendar.YEAR,2023)...
 *                        ------ MONTH, DATE
 *            => 설정된 날짜 읽기
 *               get(Calendar.TEAR), MONTH, DATE
 *            => 요일 읽기 get(Calendar.DAT_OF_WEEK)
 *            => 월 (month) => 0부터 시작한다
 *                => 등록시dp month-1
 *            => 요일 (week) => 1부터 시작한다
 *                 => 사용시에 week-1
 *           
 *      => 문자열 분해 
 *      StringTokenizer
 *         => counterTokens() : 분해된 문자열의 갯수
 *         => hasMoreTokens() : 데이터가 존재할때까지 => true
 *            while을 이용해서 주로 사용
 *         => nextTokens() : 실제 분해된 데이터 읽을 경우에 주로 사용
 *         => 오라클 연동/ 네트워크로 상대방에 값을 전송
 *      => 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *         ------ 컬렉션 (데이터를 모아서 관리) => 가변형 (크기를 결정하지 않는다)
 *         ------ 관리프로그램 제작 (사람,영화 ...)
 *         ------ 표준화(모든 프로그래머가 동일하게 사용)
 *                ---- 인터페이스
 *                   Collection
 *                       |
 *           -------------------------
 *           |  		 			|
 *        List					   Set         Map=> 인터페이스
 *          |						|           |
 *        ArrayList			   ***HashSet	  ***HashMap => 구현된 클래스
 *        Vector				 TreeSet      Hashtable
 *        LinkedList   
 *        
 *        List: 순서가 존재(인덱스번호 0번부터 시작) , 중복된 데이터 허용
 *              오라클(데이터베이스) 연동시 주로 사용되는 클래스
 *                   --------- 메모리, 파일 , RDBMS(관계형 데이터베이스)
 *                   	|             ----------- 영구적인 저장 장치
 *                    변수, 배열, 클래스 => 메모리 => 파일 => 오라클 서버
 *                    									  구분 (제약조건)
 *                    										=> key
 *        => ArrayList 
 *        => 많이 사용 : WEB => 데이터를 모아서 전송할 때 (목록)
 *        => 주로 사용 기능(메소드)
 *           ***1) 데이터 추가 : add()
 *           2) 데이터 수정 : set()
 *           ***3) 저장된 데이터 읽기 : get(int index)
 *           ***4) 저장 갯수 : size()
 *           ***5) 전체 삭제 : clear()
 *           6) 데이터 존재여부 : isEmpty()
 *       Set : 순서가 없다, 데이터 중복을 허용하지 않느나
 *       		=> List에서 중복된 데이터를 추출
 *           ***1) 데이터 추가 : add()
 *           ***3) 저장된 데이터 읽기 : get(int index)
 *           ***4) 저장 갯수 : size()
 *           ***5) 전체 삭제 : clear()
 *       => HashSet
 *       => 많이 사용 : 네트워크에서 서버에 접속하는 클라이언트의 IP
 *       => WEB 채팅
 *       Map : 순서가 없다 , Key-value=> 두개를 동시에 저장
 *       => HashMap
 *       => 많이 사용 : WEB(지원하는 클래스 => Map)
 *       			  클래스를 여러개 모아서 관리 (Spring,MyBatis)
 *       => put() : 저장시에 사용
 *       => get(key) : 저장된 데이터 읽기
 *     1) 기본 생성자를 사용하게 되면 모든 데이터형은 Object
 *        List list=new ArrayList();
 *        => 저장
 *            add(Object)
 *            Object get(int index)
 *        Map map=new HashMap();
 *             put(String s, Object o)
 *             Object get(key)
 *        Set set=new Hashset();
 *         add(Object)
 *            Object get(int index)
 *            => 관리하기 어렵다
 *            => Objcet가 추가 되면 모든 데이터형을 첨부
 *              => 데이터형이 섞여 있으면 관리가 어려운 것은 => for문 수행이 어렵다
 *              => 같은 데이터형을 첨부하는 것이 편리하다
 *              => Object리턴이면 반드시 형변환을 시킨다
 *              => 메소드에서 사용되는 모든 매개변수, 리턴형을 통일화 (제네릭)
 *              => 형변환 할 필요가 없기 때문에 소스가 간결하다
 *              => 표준화 시킬 수 있다
 *              => 클래스뒤에 <데이터형: 반드시 클래스형으로만 사용>
 *              예) 
 *                문자열
 *                 List<String> => add(String s), String get(index)
 *                 정수
 *                 List<Integer> => add(Integer i), Integer get(index)
 *                                      ----------  -------------------
 *                                       int(오토박싱)      int(언박싱)
 *        ---------------------------------------------------------------------
 *                    
 *  java.text
 *       날짜 변경(출력 형식) : SimpleDateFormat()
 *       		<fmt:formatDate>
 *       		<fmt:formatNumber>
 *           년도 : yyyy
 *           월 : MM , M
 *           일 : dd , d
 *           시간 : hh , h
 *           분 : mm , m
 *           초 : ss , s
 *            ==> yyyy/MM/dd , yyyy-MM-dd
 *       숫자 : DecimalFormat ==> ##,###
 *       =====> 오라클 (TO_CHAR)
 *     ------------------------------------------------------------------------------ 
 *  java.io
 *  java.net
 *  java.sql
 *  
 */
/*
 *  try
 *  {
 *     for(int i = 0; i <= 2; i++ )
 *     {
 *        i=0 : 정상수행
 *        i=1 : 에러발생 ==> 종료 ==> for
 *      }
 *  }catch(Excpetion e)
 *  {
 *     수행
 *   }
 *   
 *     for(int i = 0; i <= 2; i++ )
 *     {
 *        try
 *        { i=0 정상
 *          i=1 에러
 *        }
 *        catch(Exception e)
 *        {
 *        }
 *        
 *     }
 */
public class 정리_1 {

	public static void main(String[] args){
//		try
//		   {
//		      for(int i = 0; i <= 3; i++ )
//		      {
//		         if(i==2)
//		         {
//		        	 System.out.println(i/0);
//		         }
//		         System.out.println("i="+i);
//		       }
//		   }catch(Exception e)
//		   {
//		     System.out.println("예외발생");
//		    }
//		
		  
		//크롤링 => try를 for문 안쪽에 배치
		      for(int i = 0; i <= 3; i++ )
		      {
		    	  try {
		         if(i==2)
		         {
		        	 System.out.println(i/0);
		         }
		         System.out.println("i="+i);
		    	  }
		   catch(Exception e)
		   {
		     System.out.println("예외발생");
		    }
		      }
		
		

    }

}
