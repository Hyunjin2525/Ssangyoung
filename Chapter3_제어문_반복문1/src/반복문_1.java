/*
 *  자바에서 지원하는 반복문 
 *  ------------------
 *  for : 반복 횟수가 지정된 경우에 주로 사용 => 2차(중첩) => 코테
 *  =일반 for
 *  =for-each : 출력용(웹에서 가장 많이 등장: 향상된 for)
 *  while : 반복 횟수를 모르는 경우(선 조건)
 *  do~while : 반복 횟수를 모르는 경우 (후 조건) => 무조건 1이상은 수행이 가능하다
 *  
 *  => 유사한 내용을 여러번 출력을 할 때 주로 사용
 *  합계구하기, 통계... 목록 출력 ...
 *  
 *  
 *  => 형식)
 *     for
 *     for(int i=1;i,<=10;i++)= 10번 수행
 *     for(int i=0;i,<10;i++)=
 *     {
 *     }
 *     for(초기값;조건식;중감식;)
 *     {
 *      반복 실행문장
 *      }
 *      
 *      초기값 : 시작점 ==> 한번만 수행
 *      조건식: 수행을 중단할 때 (종료점)
 *      증감식: 초기값 ~ 조건식 => false 일때까지 수행
 *      ---- 감소도 가능
 *      for(int i=10;i>=1;i--)
 *      증가는 여러개 증가도 가능하다
 *      for(int i=1;i,=10,i+=2)= 2씩 증가
 *      
 *      
 *      
 *      실행 순서 (****프로그램에서 가장 많이 사용되는 제어문 : for,if)
 *      
 *      => for문은 한문장만 수행이 가능
 *      	여러문장 사용시에는 {}을 이용해서 처리한다
 *          
 *             ① -> ②false (반복문 종료)<- ④
 *      => for(초기값; 조건식; 증감식;)
 *      {          ↓ true     ↗       
 *                 ③
 *        반복 실행문장
 *      }
 *     
 *      1)초기값 => 2)조건식에 대입 => fasle=> 종료(for)
 *                         => true => 3)반복 수행문장 수행  => 4)초기값 증가
 *                         
 *                         2=> 3=> 4
 *                         false면 종료
 *                         
 *                         
 *      
 *      
 *      
 *      
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello Java를 10번 출력
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		

		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		System.out.println("======= for문 이용======");
		//반복문 이용
		for (int i=1;i<=10;i++)
		{
			System.out.println(i+". Hello world");
		}
		for (int i=0;i<10;i++)
		{
			System.out.println(i+1+". Hello world");
		}
	}

}
