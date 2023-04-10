/*
 *  컴퓨터 / 사용자 => 가위 바위 보
 * =>  가정 0-가위 1-바위 2-보
 * 
 */
// 컴퓨터 난수 (0~2)
// 사용자 입력
// 컴퓨터 / 사용자확인
// 결과값
import java.util.Scanner;

public class 삼항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		
		//확인
//		System.out.println(com==0?"컴퓨터:가위":"");
//		System.out.println(com==1?"컴퓨터:바위":"");
//		System.out.println(com==2?"컴퓨터:보":"");
//
//		System.out.println(user==0?"플레이어:가위":"");
//		System.out.println(user==1?"플레이어:바위":"");	
//		System.out.println(user==2?"플레이어:보":"");
//		
//		System.out.println("====결과====");
//		System.out.println(com==0 && user==0?"Same":"");
//		System.out.println(com==0 && user==1?"User Win":"");
//		System.out.println(com==0 && user==2?"Com Win":"");
//		
//		System.out.println(com==0 && user==0?"Com Win":"");
//		System.out.println(com==0 && user==1?"Same":"");
//		System.out.println(com==0 && user==2?"User Win":"");
//		
//		System.out.println(com==0 && user==0?"User Win":"");
//		System.out.println(com==0 && user==1?"Com Win":"");
//		System.out.println(com==0 && user==2?"Same":"");
		int res=com-user;
		System.out.println(res==0?"Same":"");
		System.out.println(res==-1 || res==2?"User Win":"");
		System.out.println(res==1 || res==-2?"Com Win":"");
	}

}
