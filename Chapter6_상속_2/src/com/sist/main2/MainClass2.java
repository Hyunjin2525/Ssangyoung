package com.sist.main2;
class Common
{
	int a=10;
	int b=20;
	public void display(){
		System.out.println("Common:display Call...");
		
	}
}
class Child extends Common //is-a 상속
{
	// a,b
	public void display(){
		System.out.println("Child:display Call...");
		
	}
	
	
}
class Child2{
	// 상속없이 오버라이딩 => 익명의 클래스
	Common c=new Common() {
		// a,b  //has-a 포함클래스
		public void display(){
		System.out.println("Child2:display Call...");
		
	}
	};
	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.display();
		
		Child2 c2=new Child2();
		System.out.println(c2.c.a);
		System.out.println(c2.c.b);
		c2.c.display();
		
	}

}
