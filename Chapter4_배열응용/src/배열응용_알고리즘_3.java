import java.util.Arrays;

/*
 *  버블 정렬 : 인접한 데이터끼리 비교
 *  => 선택정렬 : 앞에서부터 정렬
 *  => 버블정렬 : 뒤에서부터 정렬
 *    40 30 10 50 20 ==> ASC
 *    -- -- 
 *    30 40
 *       --  --
 *       10  40
 *           -- --
 *           40 50 
 *              -- --
 *              20 50(고정) ----1round
 *    --------------------
 *    30 10 40 20 
 *    -- --
 *    10 30
 *       --  --
 *       30  40 
 *           -- --
 *           20 40(고정) -----2round
 *    ---------------------
 *    10 30 20 
 *    -- --
 *    10 30 
 *       -- --
 *       20 30(고정) ------3round
 *   -----------------------
 *   10 20
 *   -- --
 *   10 20(고정) ----- 4round
 *   ----------------------
 *    i=0 j=4
 *    i=1 j=3
 *    i=2 j=2
 *    i=3 j=1
 *    ------- i+j=4 ==> j=4(length-1)-i
 *               
 *               
 */
public class 배열응용_알고리즘_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println("======= 정렬 전=====");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===== 정렬 후 =====");
		for(int i=0;i<arr.length;i++)
		{
		   for(int j=0;j<arr.length-1-i;j++)
		   {
			   if(arr[j]>arr[j+1]) //인접한 것이기 때문에 j+1
			   {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				   
			   }
		   }
			
		} System.out.println(Arrays.toString(arr));
		

	}

}
