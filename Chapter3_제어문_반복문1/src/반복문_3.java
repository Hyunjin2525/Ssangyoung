// 3의 배수의 합, 갯수 확인 (1-100)
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				sum+=i;// 합계
				count++;// 갯수 확인
			}
		}
		System.out.println("=======결과값=========");
		System.out.println("1~100까지 3의 배수 합:"+sum);
		System.out.println("1~100까지 3의 배수 갯수"+ count);
		
		int sum1,sum2, count1, count2;
		sum1=0;
		sum2=0;
		count1=0;
		count2=0;
		
		
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				sum1+=i;// 합계
				count1++;// 갯수 확인
			}
			if(i%7==0)
			{
				sum2+=i;// 합계
				count2++;// 갯수 확인
			}
			
		}
		System.out.println("=======결과값=========");
		System.out.println("1~100까지 5의 배수 합:"+sum1);
		System.out.println("1~100까지 7의 배수 합:"+sum2);
		System.out.println("1~100까지 5의 배수 갯수"+ count1);
		System.out.println("1~100까지 7의 배수 갯수"+ count2);
	}

}
