package com.sist.main6;
class Super
{
	int a=10;
	int b=20;
	
	
}
class Sub extends Super
{
	int a=100;  // 공간을 따로 만든다 (변수 오버라이딩) 변수 오버라이딩을 하면 Sub클래스에 변수 값을 변경해도 Super클래스의 
	int b=200;  //변수 값이 바뀌지 않는다
	public Sub()
	{
		System.out.println("a="+a+",b="+b);
		this.a=1000;
		this.b=2000;
		System.out.println("a="+a+",b="+b);
		System.out.println("a="+super.a+",b="+super.b);
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		
			

	}

}
