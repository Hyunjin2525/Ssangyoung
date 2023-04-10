import java.util.Scanner;

// 한개의 점수를 받아서 60이상 합격 아니면 불합격
//import java.util.Scanner;
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		//입력 => 저장
		int num=scan.nextInt();
		
		//요청 -> 처리
		
		if(num>=60)
			{
			
			System.out.println(num+"는(은) 합격입니다");
			
			}
		else
			{
			
			System.out.println("불합격입니다");
			
			}
				
				

	}

}
