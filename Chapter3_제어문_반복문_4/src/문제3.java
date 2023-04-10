
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int sum1=0, sum2=0;
	
	 for(int i=1;i<=30;i++)
	 {
		 if(i%2==0)
		 {
			 sum1+=i;
		 }
		 else
		 {
			sum2+=i; 
		 }
	 }
	 System.out.println("짝수합:"+sum1);
	 System.out.println("홀수합:"+sum2);
	 
	}

}
