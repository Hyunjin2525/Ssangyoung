package com.sist.main5;
//main=> 조립
/*
 *  1. 데이터형 (변수 묶음) => 사용자 정의 데이터형
 *  2. 기능을 가지고 있는 클래스 제작(메소드)
 *  3. 사용자에게 보여준다(조립) => 웹 (메인페이지)
 */
import com.sist.main3.*;
import com.sist.main4.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentSystem ss=new StudentSystem();
		ss.intit();
		ss.stdTotal();
		ss.stdAvg();
		ss.stdScore();
		ss.stdRank();
		ss.display();
		
		/*
		 *  1.변수 (개인마다 가지고 있는 속성 => 함부로 접근할 수 없다)
		 *    private : 은닉화
		 *  2. 요청 => 개인정보를 공개 (접근이 가능하게 만든다)
		 *            -----------
		 *                 |
		 *              getter/setter
		 *              ------------
		 *              name => setName(), getName() => 읽기/쓰기
		 *                      setXxx(), getXxx()
		 *  3. 메소드를 이용해서 접근한다 (public)
		 *  4. 다른 클래스에서 메모리 할당: 생성자(public)                    
		 */

	}

}
