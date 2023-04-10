import java.util.Scanner;

public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num= {5,10,9,3,2};
//		
//		for(int i:num)
//		{
//			System.out.print(i+" ");
//		}
//		
		
		
		System.out.println();
        
		
		char[] ch= {'A','B','C','D','E','F','G','H','I','J'};
		
		for(char i:ch)
		{
			System.out.print(i);
		}
		
		System.out.println();
		
		int[] a= {5,3,9,6,8,4,2,8,10,1};
		
	System.out.println(a[2]+" "+a[4]+" "+a[a.length-1]);
	
	
	System.out.println();
	
	
	int[] noo= {5, 10, 8, 55, 6, 31, 12, 24, 61,2};
	
	int max=noo[0];
	
	for(int i:noo)
	{
		if(max<i)
			max=i;
	}
	System.out.println("최대값:"+max);
	
		

	}

}
