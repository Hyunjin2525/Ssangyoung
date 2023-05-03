package com.sist.io;
//한글 깨짐 방지 => UTF-8 => AWS(리눅스)
import java.io.*;
import java.util.*;
// Properties => Spring / Spring~Boot => 파서기
//MyBatis
// .properties
// 형식 => Map
// 키=값 ==> 데이터베이스 정보 저장 => 사용자 계정 / 비밀번호

public class 입출력_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\src\\com\\sist\\io\\db.properties"));
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		//시스템 정보
		//setProperty(String key, String value);
		Properties prop2=System.getProperties();
		System.out.println(prop2.getProperty("java.version"));
		System.out.println(prop2.getProperty("user.language"));
		Properties prop3=new Properties();
		prop2.setProperty("name", "홍길동");
		prop2.setProperty("sex", "남자");
		prop2.setProperty("age", "25");
		prop2.store(new FileOutputStream("info.properties"),"회원정보");
		
		Properties prop4=new Properties();
		prop4.load(new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_IO_1\\info.properties"));
		String name=prop4.getProperty("name");
		String sex=prop4.getProperty("sex");
		String age=prop4.getProperty("age");
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		//키가 중복되면 안된다 (Map)
		// 이동 화면 board.list=http://localhost~
		// properties => xml => json
		// ---------------- spring/mybatis/maven
		
		
	}

}
