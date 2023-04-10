// 3의 배수, 5의 배수, 7의 배수의 합 => 갯수
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;
		int c3=0,c5=0,c7=0;
		
	   int i=1;
	   while(i<=100)
	   {   
		   //중복으로 수행 => 단일 조건, 중복이 없는 경우 => 다중 조건
		   if(i%3==0)
		   {
			   a3+=i;//합
			   c3++;//갯수
					   
		   }
		   if(i%5==0)
		   {
			   a5+=i;
			   c5++;
					   
		   }
		   if(i%7==0)
		   {
			   a7+=i;
			   c7++;
					    
		   }
		   i++;
	   }
	   
	   System.out.println("=====결과값=====");
	   System.out.println("1~100 사이의 3의 배수 합:"+c3+"갯수:"+a3+"갯수"+c3);
	   System.out.println("1~100 사이의 5의 배수 합:"+c5+"갯수:"+a5+"갯수"+c5);
	   System.out.println("1~100 사이의 7의 배수 합:"+c7+"갯수:"+a7+"갯수"+c7);

	   
	   int max=c3;
	   if (max<c5)
		   max=c5;
	   if(max<c7)
		   max=c7;
	   System.out.println("가장 많은 갯수는"+ max);
	  
	   int min=c3;
	   if (min>c5)
		   min=c5;
	   if(min>c7)
		   min=c7;
	   
	   System.out.println("가장 작은 갯수는"+ min);

	}

}
