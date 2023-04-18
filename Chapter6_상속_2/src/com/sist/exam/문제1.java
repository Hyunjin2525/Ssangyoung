package com.sist.exam;
/*
 *  1.캡슐화
 *  => 데이터 보호
 *  => 데이터를 은닉화 (private)/ 메소드를 통해서 접근이 가능
 *  
 */

//사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
//사용자 정의 데이터형 => ~VO  (변수의 값만 가지고 있음)
class StudaCard
{
	private int num;
	private boolean isKwang;
	//getter => 읽기
	//setter => 저장
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {    //is=boolean
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
    
}

class Student
{
  private String name;
  private int ban;
  private int no;
  private int kor;
  private int eng;
  private int math;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBan() {
	return ban;
}
public void setBan(int ban) {
	this.ban = ban;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public int getKor() {
	return kor;
}
public void setKor(int kor) {
	this.kor = kor;
}
public int getEng() {
	return eng;
}
public void setEng(int eng) {
	this.eng = eng;
}
public int getMath() {
	return math;
}
public void setMath(int math) {
	this.math = math;
}
  

}
public class 문제1 {

}
