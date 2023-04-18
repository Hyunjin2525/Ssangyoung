package com.sist.exam3;
//A ==> a,b,name,A(),print()
//공유=> addr,display()=> A가 마음대로 제어를 못한다
class A
{
	int a;
	int b;
	String name;
	static String addr;
	public A()
	{
		/*
    int a;
	int b;
	String name;
	static String addr;
	print()
	display()
		 */
	}
	public void print()
	{
		
	}
	public static void display()
	{
		// addr => static은 static만 사용이 가능
		A aa=new A(); //인스턴스는 객체 생성후에 사용이 가능하다
		aa.addr="";
		aa.a=10;
		aa.a=20;
		aa.name="shim";
		aa.print();
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
