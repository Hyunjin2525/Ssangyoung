
public class 문제1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		   int no=0,sum1=0;
			
			 for(int i=100;i<=999;i++)
			 {
				 if(i%7==0)
				 {
					 sum1+=i;
					 no++;
				 }
				 
			 }
			 System.out.println("7의 배수 갯수:"+no);
			 System.out.println("7의 배수 합:"+sum1);
			 

	}

}
