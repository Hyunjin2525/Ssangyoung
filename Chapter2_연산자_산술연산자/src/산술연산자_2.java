// %
public class 산술연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		
		System.out.println(a+"%"+b+"="+(a%b)); //가로표시가 제일 먼저 계산
		System.out.println(-a+"%"+b+"="+(-a%b)); 
		System.out.println(a+"%"+-b+"="+(a%-b)); 
		System.out.println(-a+"%"+-b+"="+(-a%-b)); 
		System.out.println(-a+"/"+-b+"="+(-a/-b)); 
		//나머지 값 계산 할 때만 왼쪽 부호 따라 감
		

	}

}
