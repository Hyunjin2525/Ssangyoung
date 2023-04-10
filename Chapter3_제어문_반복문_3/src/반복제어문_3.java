// 세개의 정수를 받아서 총점 / 평균
import java.util.Scanner;
public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor,eng,math;
		while(true)
		{
			System.out.println("국어 점수 입력(0~100):");
			kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				System.out.println("잘못된 정수입니다");
			   continue;
			}
		
			break;
		}
			while(true)
			{
				System.out.println("영어 점수 입력(0~100):");
				eng=scan.nextInt();
				if(eng<0 || eng>100)
				{
					System.out.println("잘못된 정수입니다");
				   continue;
				}
			
				break;
			}
				while(true)
				{
					System.out.println("수학 점수 입력(0~100):");
					math=scan.nextInt();
					if(math<0 || math>100)
					{
						System.out.println("잘못된 정수입니다");
					   continue;
					}
					break;
			

	
		        }
				int total=kor+eng+math;
				double avg=total/3.0;
				System.out.println("총점:" +total);
				System.out.printf("평균:%.2f",avg);
		
		
	}
			

}
