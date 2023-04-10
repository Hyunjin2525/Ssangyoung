import java.util.Arrays;

/*
 *   정렬 : ASC(오름차순)/DESC(내림차순) //웹에서는 내림차순이 많음 //순위는 오름차순//높은것은 내림차순(인기순위,TOP100 같은 경우)
 *   ------------------------------
 *   선택정렬 / 버블정렬
 *   
 *   **선택정렬 (select sort)
 *   
 *   10 30 50 20 40 => 10 20 30 40 50, 50 40 30 20 10
 *   -- --
 *   30 10
 *   --    --
 *   50    30
 *   --       --
 *   50       20
 *   --          --
 *   50          40 --------1round => 0 - 4
 *   ---------------
 *   50 10 30 20 40
 *      -- --
 *      30 10
 *      --    --
 *      30    20
 *      --       --
 *      40       30 --------2round => 1 - 3
 *  ----------------
 *  50 40 10 20 30 
 *        -- --
 *        20 10
 *        --     --
 *        30     20 ---------3round => 2 - 2
 * ------------------
 * 50 40 30 10 20
 *          -- --
 *          20 10 ----------4round => 3 - 1
 * ------------------
 * 50 40 30 20 10
 * 
 *   i      j
 * start   횟수
 *   0      4
 *   1      3
 *   2      2
 *   3      1
 *   --------- i+j=4 => j=4-i
 *                        -length-1-i
 *             
 *      
 *    
 *    
 *    
 */
public class 배열응용_알고리즘_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		System.out.println("===== 정렬후(DESC) =====");
		
		for(int i=0;i<arr.length-1;i++) //start //총 4바퀴 돌기 때문에 length-1
		{
		   for(int j=i+1;j<arr.length;j++)//횟수
		   {
			   if(arr[i]<arr[j])
			   {
				     int temp=arr[i];
				     arr[i]=arr[j];
				     arr[j]=temp;             //교환할 때는 임시변수 필요   
			   }
		   }
		   System.out.println("===for"+(i+1)+"회차 ===");
		   System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===== 정렬후(ASC) =====");
		
		for(int i=0;i<arr.length-1;i++) //start
		{
		   for(int j=i+1;j<arr.length;j++)//횟수
		   {
			   if(arr[i]>arr[j])
			   {
				     int temp=arr[i];
				     arr[i]=arr[j];
				     arr[j]=temp;             //교환할 때는 임시변수 필요   
			   }
		   }
		   System.out.println("===for"+(i+1)+"회차 ===");
		   System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));

	}

}
