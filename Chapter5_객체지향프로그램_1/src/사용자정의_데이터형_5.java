import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
class Sawon //class는 사물의 공통적인 부분들을 모은다
{
	///// 인스턴스 변수(클래스가 메모리에 저장)
	int sabun;
	String name;
	String dept;//부서
	String job;//직위    //=추상화(단순화) 작업
	String loc;//근무지
	long pay;//연봉
	///////////////////
	static String compony;
	////// 메모리 공간이 1개만 설정 => 컴파일러에 의해 자동 생성
	////// new없이 사용이 가능
	
}
public class 사용자정의_데이터형_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Sawon.compony="kkk"; //static변수는 new 없이도 사용 가능
	    //클래스변수명.변수명 ==> hong.compony 
	    //클래스명.변수명 =>  Sawon.compony
	    //공유변수, 클래스변수 (클래스명으로 접근이 가능)
	    //인스턴스 변수 ==> 인스턴스명.변수
	    
		Sawon hong=new Sawon();
		hong.sabun=1;
		hong.name="홍길동";
		hong.dept="개발부";
		hong.job="대리";
		hong.loc="서울";
		hong.pay=4500;
		hong.compony="ABC";
		Sawon shim=new Sawon();
		shim.sabun=2;
		shim.name="심청이";
		shim.dept="개발부";
		shim.job="사원";
		shim.loc="서울";
		shim.pay=3300;
		shim.compony="ABC";
		Sawon park=new Sawon();
		park.sabun=3;
		park.name="박문수";
		park.dept="개발부";
		park.job="과정";
		park.loc="서울";
		park.pay=6200;
		park.compony="ABC";
		
		hong.compony="BCD"; //static(저장공간이 1개만 생긴다)을 이용해서 회사명 전부 변경
		shim.compony="CDE";
		park.compony="DEF";
		System.out.println("회사명:"+hong.compony);
		System.out.println("회사명:"+shim.compony);
		System.out.println("회사명:"+park.compony);
		
        //ABC회사가 망했다 => 회사명 변경 => BCD		
		hong.loc="부산"; //static이 아니기 때문에 shim,park loc는 그대로 서울(변경 안됨)
		System.out.println("근무지:"+hong.loc);
		System.out.println("근무지:"+shim.loc);
		System.out.println("근무지:"+park.loc);
		
		
		
	}

}
