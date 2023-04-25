package com.sist.lib;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Sawon2{
	private int sabun;
	private String name;
	// 초기화
	public Sawon2(int sabun,String name)
	{
		this.sabun=sabun;
		this.name=name;
	}
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s=(Sawon2)obj;   //(Student2)obj).name =한줄 형변환
		return name.equals(s.name) && sabun==s.sabun;
	}
	
	//오버라이딩
	
}

public class 라이브러리_Object_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1, "홍길동");
		Sawon2 s2=new Sawon2(1, "홍길동");
		// 오버라이딩을 하지 않는 경우 => 주소 (==)
		if(s1.equals(s2))
		{
			System.out.println("같은 사원입니다");
		}
		else
		{
			System.out.println("다른 사원입니다");
		}
	}

}
