package com.sist.gn;
import java.util.*;
// A a= (A에 있는 데이터 관리)
// Object o ==> o.sabun

class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	
}

public class 라이브러리_제네릭_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Sawon> list=new ArrayList<Sawon>();
		//데이터 추가
		list.add(new Sawon(1, "홍길동", "개발부", "대리", 4500));
		list.add(new Sawon(2, "박문수", "총무부", "과장", 5500));
		list.add(new Sawon(3, "이순신", "기획부", "사원", 3500));
		list.add(new Sawon(4, "강감찬", "자재부", "부장", 6500));
		list.add(new Sawon(5, "심청이", "영업부", "부장", 6500));
		
		
		// 출력
		for(Sawon s:list)
		{
			System.out.println(s.getName()+" "+s.getSabun()+" "+s.getDept()+" "+s.getJob()+" "+s.getPay()+" ");
		}
		System.out.println("===============================");
		// 삭제 => remove 인덱스 2번 삭제 => 속도가 느려진다
		// List => 데이터 첨부 => 데이터 읽기 => 데이터 갯수
		// 수정, 삭제 => 오라클
		// Set은 많이 사용하지 않음 (중복을 제거하기 때문에)
		list.remove(2); //많이 사용하지 않음
		for(Sawon s:list)
		{
			System.out.println(s.getName()+" "+s.getSabun()+" "+s.getDept()+" "+s.getJob()+" "+s.getPay()+" ");
		}
		System.out.println("===================================");
		System.out.println("현재 인원:"+list.size());
		System.out.println("===================================");
		Sawon sa=new Sawon(6, "춘향이", "개발부", "사원", 3500);
		list.set(3, sa); //많이 사용하지 않음
		for(Sawon s:list)
		{
			System.out.println(s.getName()+" "+s.getSabun()+" "+s.getDept()+" "+s.getJob()+" "+s.getPay()+" ");
		}
		System.out.println("===================================");
		list.clear();
		System.out.println("현재 인원:"+list.size());
		
		/* add, size, get, clear(clear = 장바구니 기능에 주로 사용) => 웹에서 사용
		 * 
		 * 
		 */

	}

}
