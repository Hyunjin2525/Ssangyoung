package com.sist.seoul;

/*
 * 	1
	|양화진외국인선교사묘원
	|양화진외국인선교사묘원은 서울 마포구 합정동에 위치한 외국인 선교사들의 공동묘지이다.
	|04084 서울 마포구 양화진길 46 (합정동, 양화진홍보관)

 */

public class SeoulVO {
	private int no;
	private String name;
	private String content;
	private String address;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
