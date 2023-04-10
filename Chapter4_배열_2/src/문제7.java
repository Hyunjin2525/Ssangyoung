import java.util.Arrays;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no=new int[10];
		
		
		for(int i=0;i<no.length;i++)
		{
			no[i]=(int)(Math.random()*10)+1;
	
		}
		System.out.println(Arrays.toString(no));
		
		int total=0;
	
		for(int i:no)
		{
			total+=i;
		}
		
		
	    System.out.printf("평균:%.2f",(total/10.0));

	}

}
