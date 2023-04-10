// char를 한개 보내서 => 대문자,소문자 => boolean
import java.util.Scanner;
public class 메소드_3 {
    static String isAlpha(char c)
    {
    	String result="";
    	if(c>= 'A' && c<='Z')
    		result="대문자";
    	else if (c>= 'a' && c<='z')
    		result="소문자입니다";
    	else
    		result="알파벳이 아닙니다";
    		
    	return result;
    }
    static void process()
    {
    	Scanner scan=new Scanner(System.in);
        System.out.println("알파벳 입력:");
        String s=scan.next();
        char c=s.charAt(0); // 문자한개를 읽어와서 char로 전환
        /*
         *  String s="Hello"
         *            01234
         *            =>s.charAt(2) ==> l 
         */
        String result=isAlpha(c);
        System.out.println(c+"는(은)"+result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
