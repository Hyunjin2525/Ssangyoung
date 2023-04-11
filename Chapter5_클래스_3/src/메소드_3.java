import java.util.Arrays;

public class 메소드_3 {
	static int[] rand()
	{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		return arr;
	}
	
	static void rand2(int[] arr)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr1=rand();//리턴형으로 값을 채운다
         System.out.println(Arrays.toString(arr1));
         int[] arr2=new int[5];
         rand2(arr2);//매개변수를 이용해서 값을 채운다 ==> 활용도가 높다 //배열은 매개변수를 이용
         System.out.println(Arrays.toString(arr2));
         
	}

}
