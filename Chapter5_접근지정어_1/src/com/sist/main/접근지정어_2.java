package com.sist.main;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private int pay;
	
}
// 객체지향의 3대 특성은 문법사항은 아니다 => 권장 (실무 => 캡슐화) 


public class 접근지정어_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1명 저장
		Sawon sa=new Sawon();
		// sa => sabun,name,dept,loc,pay
		sa.setSabun(1);
		sa.setName("홍길동");
		sa.setDept("개발부");
		sa.setLoc("서울");
		sa.setPay(3000);
		
		System.out.println(sa.getSabun()+" "+sa.getName()+" "+sa.getDept()+" "+sa.getLoc()+" "+sa.getPay());

	}

}
