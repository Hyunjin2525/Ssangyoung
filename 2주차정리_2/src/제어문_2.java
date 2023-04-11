/*
 *  연산자, 제어문 => 형식, 용도
 *  1) 형식
 *        초기값은 한번 수행
 *                 \ false 종료
 *           1 -> 2     <-------- .
 *                      |4        .
 *     for(초기값;조건식;증가식)      .
 *     {           |true		 .	
 *        반복수행 문장 ----------- .
 *     }                true
 *     초기값 => 조건식 =====>  수행문장 ===> 증가식 => 조건식 => 수행문장 => 증가식
 *               | false (종료)
 *                        true
 *               건식 =====>  수행문장 ===> 증가식
 *               | false (종료)
 *     = while
 *     초기값 =====  1
 *     while(조건문) = 2
 *     {
 *       수행문장   = 3
 *       증가식    = 4 =====> 조건식 2번으로 이동
 *                           --------- false면 종료
 *     }
 *     
 *     필요에 의해 반복문 제어
 *     -----------------
 *     break / continue
 *     
 *      break => 반복 중단 (조건) 게임 => esc
 *      ------  반복문, switch (if x)
 *      continue => 반복문에서만 사용이 가능 (특정부분을 제외하는 경우에 주로 사용)
 *                  종료하는 것이 아니라 => 이동
 *                  for => 증가식으로 이동
 *                  while => 조건식으로 이동
 *      
 *      주의점)
 *          break,continue=> 밑에는 소스 코딩이 불가능하다
 *          break,continue=> 자신 소속 반복문만 제어한다
 *         
 *          for()
 *          {
 *             if()
 *             {
 *             //가능
 *              continue;
 *              System.out.print() => 오류
 *             }
 *          }
 *          
 *          if()
 *          if()
 *          -------
 *          if()
 *          else - 바로 위에 있는 if문만 관련 있음  // 다중 if는 else가 전체 문장 해석한다
 *          --------
 *          
 *               
 */
public class 제어문_2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		
//		while(i<=10)
//		{
//			if(i%2==0)
//			{  i++;
//				continue;
//			}
//			System.out.println(i);
//			i++;
//		}
		
		int[] arr= {1,2,3,4,5};
		System.out.println(arr);
		int[] arr1=arr;
		System.out.println(arr);
		arr1[0]=10;
		System.out.println(arr[0]);
		int[] arr3=arr.clone();// arr크기의 새로운 배열 생성
		System.out.println(arr3);
		// 주소에 의한 참조 ==> 메모리 주소를 이용해서 실제 데이터 관리
		
		

	}

}
