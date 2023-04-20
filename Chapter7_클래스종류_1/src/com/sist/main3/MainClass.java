package com.sist.main3;
/*
 *  인터페이스 간의 상속
 *  interface A
 *  interface B extends A
 *              ------
 *  interface A
 *  {
 *   void aaa();
 *  }
 *  interface B
 *  {
 *   void bbb();
 *   //void aaa()
 *  }            
 *  
 *  class C implements B
 *  {
 *    public void aaa(){}
 *    public void bbb(){}
 *    
 *  }
 *  
 */
interface A
{
	
}
interface B extends A //A>B
{
	
}
class C implements B //C>B => interface 클래스와 동일 => 구분(클래스는 단일상속,인터페이스 다중상속)
{
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new C();
		B b=new C();
		C c=new C();// 한번에 다 처리할 수 있어서 선호
		
//		if(c instanceof A) //c객체는 A에 포함 C<A     //객체 크기 비교 = instanceof
//		{
//			System.out.println("OK");
//		}
//		if(c instanceof B) // C< B
//		{
//			System.out.println("OK2");
//		}
//		if(b instanceof A) //B < A
//		{
//			System.out.println("OK3");
//		}
//		if(a instanceof C) //A==C
//		{
//			System.out.println("OK4");
//		}
//		if(a instanceof B) //A<B
//		{
//			System.out.println("OK5");
//		}
		
		String s="";
		StringBuffer sb=new StringBuffer();
		Object o=new Object();
		if(s instanceof Object)
			System.out.println("OK");
		if(sb instanceof Object)
			System.out.println("OK2");
		if(o instanceof String)
			System.out.println("OK3");
		//instanceof는 객체 크기
		// 오른쪽 클래스가 크거나 같으면 => true false
		//if(s instanceof StringBuffer) => 오류 (상속,포함관계가 아닌 경우는 크기 잴 수 없다)



	}

}
