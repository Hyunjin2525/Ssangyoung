import java.util.Arrays;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(a));
		for(int a2:a)
		{
			if(a2%3==0)
			{
				System.out.print(a2+" ");
			}
		}
		

	}

}
