// 1-2+3-4+5-6+7-8+9-10 ==> 값
// for => 반드시 숫자의 패턴
// 1 2 3 1 2 3 1 2 3 
// 1 2 3 2 3 2 3 4 4 = X
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				score-=i;
			}
			else
			{
				score+=i;
			}
		}			System.out.println("sum="+ score);

	}

}
