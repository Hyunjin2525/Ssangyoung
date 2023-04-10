//1~100까지의 합
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int sum=0;
	   for(int i=1; i<=100;i++)
	   {
		   sum=sum+i; //sum=+i
		   System.out.println("sum="+sum+",i="+i);
	   }
	   System.out.println("========최종 결과=====");
	   System.out.println("1~100까지의 합:"+sum);
	   
	   sum=0; //곱=>1
	   for(int i=0; i<=100;i+=2)
	   {
		   sum=sum+i; //sum=+i
		   System.out.println("sum="+sum+",i="+i);
	   }
	   System.out.println("========최종 결과=====");
	   System.out.println("1~100까지의 짝수합:"+sum);

	   sum=0;
	   for(int i=1; i<=100;i+=2)
	   {
		   sum=sum+i; //sum=+i
		   System.out.println("sum="+sum+",i="+i);
	   }
	   System.out.println("========최종 결과=====");
	   System.out.println("1~100까지의 홀수 합:"+sum);

	   sum=0;
	   for(int i=3; i<=10;i+=3)
	   {
		   sum=sum+i; //sum=+i
		   System.out.println("sum="+sum+",i="+i);
	   }
	   System.out.println("========최종 결과=====");
	   System.out.println("1~100까지의 3의 배수 합:"+sum);

	}

}
