package com.sist.main4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human man=new Human();
		man.setData("심청이");
		System.out.println(man.getData());
		Student s=new Student();
		s.setData("박문수");
		System.err.println(s.getData());
		System.out.println(man.getData());
		
		//static이기 때문에 박문수로 출력 됨
				

	}

}
