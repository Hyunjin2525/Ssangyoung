package com.sist.lib;
//toString() : 객체를 문자열화 시킨다
/*
 *  (String)
 *  .toString()
 *  --------------- 문자열 변환
 *  class A 
 *  {
 *  }
 *  A a=new A();
 *  1) 명시적 => System.out.println(a.toString()) => a의 주소값을 출력
 *  2) 묵시적 => System.out.println(a)
 */
class Member
{
	private int mno;
	private String name;
	
	public Member (int m, String n)
	{
		mno=m;
		name=n;
		//this.을 생력할 수 있다
		//지역변수,매개변수를 찾는다 ==> 없는 경우 멤버변수를 찾는다
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "회원번호:"+mno+",이름:"+name;
	}
	
}
//객체를 문자열로 변환
public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member(1, "박문수");
		Member m2=new Member(2, "심청이");
		// toString = 평상시에는 메모리 주소값을 출력하는데, 오버라이딩 하여서 값이 출력되게 함
		
		System.out.println("묵시적 m1"+m1);
		System.out.println("명시적 m1"+m1.toString());
		
		System.out.println("묵시적 m2"+m2);
		System.out.println("명시적 m2"+m2.toString());

	}

}
