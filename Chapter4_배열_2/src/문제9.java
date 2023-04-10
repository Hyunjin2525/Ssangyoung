import java.util.Arrays;

public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println(Arrays.toString(arr));
		
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f",total/10.0);

	}

}
