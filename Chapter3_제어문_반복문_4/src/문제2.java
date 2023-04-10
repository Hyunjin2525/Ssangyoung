
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int no=0,sum1=0;
			
		 for(int i=100;i<=999;i++)
		 {
			 if(i%4!=0)
			 {
				 sum1+=i;
				 no++;
			 }
			 
		 }
		 System.out.println("4의 배수가 아닌 갯수:"+no);
		 System.out.println("4의 배수가 아닌 합:"+sum1);
		 

	}

}
