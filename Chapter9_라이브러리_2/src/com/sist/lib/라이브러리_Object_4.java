package com.sist.lib;
//getclass => 타입을 읽어 온단
/*
 *    class A
 *    
 *    A a=new A();
 *    a.getclass() => class A
 *    
 *    String s="";
 *    s.getclass() ==> java.lang.String
 *    
 *    
 * 
 */
class Student3
{
	
}
public class 라이브러리_Object_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s=new Student3();
		System.out.println(s.getClass()); //데이터형 확인
		String s2="";
		System.out.println(s2.getClass());

	}

}
