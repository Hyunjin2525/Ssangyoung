package com.sist.main;
//private < default < protected < public
class Member{
	private int mno; //Member클래스에서만 사용 가능
	public String name;// 모든 클래스(패키지가 달라도 된다)
	/////////////////////
	protected String address;
	String tel;
	///////////////////// 같은 패키지에서만 사용이 가능
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	
}

public class 접근지정어_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Member m=new Member();
	    m.name="홍길동";
	    m.address="서울";
	    m.tel="010-1111-1111";
	    m.setMno(1);
	    
	    System.out.println(m.getMno()+" "+m.name+" "+m.address+" "+m.tel);
	    
	    

	}

}
