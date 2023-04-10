/*
 *  알파벳 10개를 저장하는 공간을 만든다
 *    char c1~c10; 
 *    char[] alpha=new char[10];
 *    알파벳 100000개를 저장하는 공간을 만든다
 *    char c1~c100000; => 가장 큰 알파벳을 출력
 *    => if(max<c2)==>99999
 *    char[] alpha=new char[100000]
 *    
 *    *** 배열 = 변수가 3개이상이면 
 *    
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 선언 
		int[] arr=new int[5]; //new =>동적 메모리 할당
		//2. 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//3. 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		//4. 제어
		// 정렬
		
		
		//5. 결과값 출력
		

	}

}
