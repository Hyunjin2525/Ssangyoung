//성적계산

import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("세개의 정수 입력(10 20 30):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		// case는 중복할 수 없다
		// 학점 출력
		char score='A';
		switch(avg/10) {
		
		case 10: // 값 동일 시
		case 9:// 99~90 => 9(avg /10)==10 || (avg/10)==9
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
			
		case 6:
			score='D';
			break;
		default: // 생략이 가능 ==> else
		    score='F';
	
		}
		System.out.println("학점:"+score);
				
	}

}
