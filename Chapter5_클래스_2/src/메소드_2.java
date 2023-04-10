// ID/PWD를 받아서 로그인 처리
import java.util.Scanner;
/* 
 * 리턴형은 경우수
 * 두개 = boolean
 * 세개 = int, String
 *       ID가 없는 경우 1 => NOID
 *       ID는 존재, Pass Word가 틀리는 경우2 => NOPWD
 *       ID,PWD 3 =LOGIN
 *       --------------------------------------
 *       1. 재사용
 *       2. 견고
 *       3. 가독성 **
 */

public class 메소드_2 {
	static String isLogin(String id,String pwd) 
	{
		String[] ids= {"hong","park","shim","lee","kang"};
		String[] pwds= {"1234","3456","4567","5678","6789"};
		String[] names= {"홍길동","박문수","심청이","이순신","강감찬"};//파일, 오라클 메모리에 저장(휘발성)
		
		//id검색
		int index=0;
		boolean bCheck=false;
		for(int i=0;i<ids.length;i++)
		{
			if(id.equals(ids[i]))
			{
				bCheck=true; //아이디가 존재한다
				index=i;
				break;
			}
		}
		
		String result="";
		if(bCheck==true)
		{
			if(pwd.equals(pwds[index]))
			{
				result=names[index];
			}
			else
			{
				result="NOPWD";
			}
		}
		else
		{
			result="NOID";
		}
		
		return result;   //경우의 수가 3개 이상일 때
	}
	static void process()
	{
		Scanner scan=new Scanner (System.in);
		System.out.print("ID를 입력:");
		String id=scan.next();
		System.out.print("PWD 입력:");
		String pwd=scan.next();
		
		String result=isLogin(id, pwd);
		if(result.equals("NOID"))
		{
			System.out.println("아이디가 존재하지 않습니다");
			
		}
		else if(result.equals("NOPWD"))
		{
			
			System.out.println("비밀번호가 틀립니다");
		}
		else
		{
			System.out.println(result+"님 로그인되었습니다");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
