//1~100까지 사이의 반복문 수헹
// 11 , 22, 33, 44, 55...
// 두개는 같은 정수 입니다 / 두개는 다른 정수 입니다
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10;i<=99;i++)
		{
			if(i%11==0)
				System.out.println(i+"두개는 같은 정수");
			else
				System.out.println(i+"는(은) 두개는 다른 정수");
		}

	}

}
