import java.util.Scanner;
/*
 *  method => 140page
 *  1) 메소드 형식 => 기능처리
 *     ----------
 *     웹 => 화면변경
 *     ------------ 메뉴 클릭 , 버튼 클릭, 이미지 클릭....
 *     검색, 글쓰기, 수정, 회원가입,회원탈퇴...
 *     사용자의 동작과 관련
 *     리턴형 메소드면(매개변수..) => 선언부
 *     {
 *      구현부 
 *     }
 *     
 *     =리턴타입 (리턴형)
 *       처리후 결과값 한개만 전송이 가능하다
 *       *** 여러개인 경우 : 배열, 클래스
 *       *** 한개인 경우 : 일반 기본형, string
 *       1) 결과값이 있는 경우
 *         리턴형 메소드명(매개변수...)
 *         ----
 *         {
 *             return 값; 일치 ==> 리턴형 클수도 있다
 *                   ---
 *         }
 *         예)
 *         int method()
 *         {
 *         return 10.5; ==> 오류발생
 *         }
 *         
 *         int[] method()
 *         {
 *           int[] arr={1,2,3};
 *           return arr; //배열 주소만 넘겨준다
 *         }
 *         
 *       2) 결과값이 없는 경우
 *       void method()
 *       ----
 *       {
 *       
 *       return; // 메소드 종료
 *       }
 *       void method1()
 *       {
 *         생략 => 컴파일러가 자동으로 추가 return
 *       }
 *       => import java.lang.* => 자동추가
 *                 System
 *                 String
 *                 Math
 *                 ---------
 *       ==> method()
 *       
 *     =메소드명 => 식별자와 동일 
 *                 길이에 제한이 없다 => 의미를 부여
 *                 aaa(), bbb(), ccc()
 *                 getName(),getTitle(),setName()
 *     =매개변수 : 사용자 요청값 
 */

public class 문제풀이 {
	static void process1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=num%2;
			num=num/2;
			if(num==0)
				break;
			index--;
		}
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
			System.out.print(" ");
			System.out.print(binary[i]);
		}
		
	}
	
	static void process2(int[] arr,int n)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(n==1)
				{ 
					if(arr[i]>arr[j])
					{
				    int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}else
				{
					if(arr[i]<arr[j])
					{
				    int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
					
				}
				{
					
				}
				
			}
			
		}

	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process1();
	}

}
