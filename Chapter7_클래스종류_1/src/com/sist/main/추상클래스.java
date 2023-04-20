package com.sist.main;
/*
 *   232 page
 *   ---------- 추상클래스 (abstract)
 *               => 메소드 관현 (구현이 안된 메소드)
 *                  --------------------------- 상속 관련 (오버라이딩)
 *                  ** 오버라이딩 조건
 *                     -------
 *                     => 상속을 받아서 기존의 기능을 변경해서 사용하는 기법(modify)
 *                     => 조건 
 *                     1) 상속관계가 존재
 *                        => 추상클래스는 단독으로 사용이 불가능
 *                           미완성된 클래스
 *                        => 사용법은 상속을 내린후에 상속을 받을 클래스를 통해서 
 *                           메모리 할당이 되는 상태
 *                           class A
 *                           class B extends A
 *                           => A a=new B();
 *                           => A a=new A(); => 오류
 *                     2) 메소드명 동일
 *                     3) 리턴형 동일
 *                     4) 매개변수가 동일 (매개변수가 다른 경우 => 오버로딩)
 *                     5) 접근지정어는 확대/ 축소하면 오류 발생
 *                        -------
 *                        private < default < protected< public
 *             *** 기본 목적: 여러개의 클래스를 모아서 한개의 이름으로 제어
 *                          -----              ----
 *             *** 프로그램 설계 (미완성된 클래스)
 *                 = 요구사항분석 
 *                   벤치마킹 : 여러개 사이트를 참조
 *                   예) 로그인 => 10000개의 레시피
 *                       회원가입 => 망고플레이트
 *                       예약 => CGV
 *                       결제 => 옵션
 *                 = 프로그램에 맞게 구현해서 사용
 *                   예) 
 *                     void btnClick();
 *                     {
 *                       계산기 1번 버튼
 *                     }
 *                     => 로그인 버튼 
 *                 = 한개의 객체로 여러개를 제어하는 프로그램
 *                      게시판 
 *                      갤러리게시판
 *                      댓글형게시판
 *                      묻고답하기
 *                      --------         
 *        
 *      추상클래스
 *      =========
 *      ==> 공통적으로 사용하는 부분(코딩 내용이 다르게 만들 경우)
 *      예)
 *          게시판    : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기
 *          묻고답하기 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 답변하기
 *          댓글게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 댓글
 *          후기게시판 : 목록출력, 찾기, 글쓰기, 내용보기, 수정하기, 삭제하기, 업로드
 *          
 *          abstract class Board
 *          {
 *            목록출력();// 기능이 서로 다르게 사용하면 선언만 한다
 *            찾기(){};  // 찾기기능은 사용법이 동일할 것이기 때문에 구현을 시킨다
 *            글쓰기();
 *            내용보기(){};
 *            수정하기(){};
 *            삭제하기(){};
 *          }
 *        *** 권장 사항 ==> 한개이상의 추상메소드를 포함한다
 *                                 ------ 구현이 안된 메소드 
 *            abstract void find();  //abstract가 붙여있으면 추상메소드 (구현이 안된 메소드)
 *            Board content(){};
 *            void write(){};
 *            
 *       추상클래스의 특징
 *       1) 단일상속 => extends
 *       2) 메소드가 구현이 안된것이 있으면 미완성 클래스 => 메모리에 단독으로 저장이 불가능
 *           abstract class A
 *           => A a=new A() => X
 *       3) 상속을 내려서 구현된 클래스를 이용해서 메모리 할당
 *           abstract class A
 *           class B extends A
 *           ----------------- 구현이 안된 메소드를 구현한다
 *           => A a=new B()(하위클래스); 묵시적 형변환 
 *              double d=10; 자동형 형변환
 *           => A a=new B();
 *              B b=(B)a; ====> 명시적 형변환   
 *           *** 클래스는 상속관계,포함관계 => 크기를 잴수 있다
 *           상속을 내리는 클래스 > 상속을 받는 클래스 
 *           포함하고 있는 클래스 > 포함되는 클래스 보다 크다
 *           class A
 *           class B extends A ==> A>B ==> is-a
 *           {
 *           B b=new B();
 *           }
 *           class B ==>A>B ==> has-a
 *        4) 목적 : 관련된 여러 클래스를 묶어서 한개의 이름으로 관리
 *                 -------------
 *                 => 공통적인 기능 
 *                 => 버스, 마을버스,고속버스,좌석버스
 *                    -------------------------- 버스 --추상클래스
 *                 => 개,돼지,말 ...
 *                    ------------------------- 동물 --추상클래스        
 *                 => 선 , 네모 , 삼각형 , 원....
 *                    -------------------------- 도형 --추상클래스
 *        5) 선언된 메소드가 있는 경우 => 상속시 반드시 구현해야 된다(강제성)
 *                        
 *                                        
 */

import java.io.*;
abstract class 도형
{   
	//무조건 구현 필요
	public abstract void draw();
	//필요시에 오버라이딩
	public void color() {
		System.out.println("검정색");
	}
}
class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	 System.out.println("선");
	}
	
}

class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("원");
	}
	
}

class 네모 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		 System.out.println("네모");
	}
	
}
interface A1
{
	
}
/*
 *  1. 일반 클래스 => new (O)
 *  2. 추상 클래스 => 구현후 사용
 *  3. 인터페이스 => 추상클래스와 동일(O)
 *  4. 종단클래스 => 상속해서 확장 불가능
 *  5. static  => 메모리=> 클래스명으로 접근
 *  -----------------------------------------
 */
abstract class A
{
	public abstract void aaa();
	public abstract void bbb();
	public abstract void ccc();
	public abstract void ddd();
	public abstract void eee();
}
class B extends A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub       //메소드는 블록만 열고 닫아고 빈공간이여도 구현된 것으로 인식
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ddd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eee() {
		// TODO Auto-generated method stub
		
	}
	
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩 기법
		도형 a=new 선();
		a.draw();
		a=new 원();
		a.draw();
		a=new 네모();
		a.draw();
		//OutputStream out;
		

	}

}
