
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= 0;
		
		for(int i=2;i<=100;i+=2)//i는 }에서 자동으로 사라진다
		{
			sum= sum+i;
		}
		System.out.println("2+4+...100의 합:"+sum);
	
	
	}

}
