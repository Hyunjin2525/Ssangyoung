/*
 *   대입연산자 
 *   (연산순서 (좌-> 우))
 *   대입연산자 = 우->좌
 *              a=10+30
 *                 <-
 *              = 대입연산자   
 *              --------------- 복합대입연산자    
 *              ***+= => 누적(총합)
 *              ***-=
 *              *=
 *              /=
 *              %=
 *              <<=
 *              >>=
 *              &=
 *              |=
 *              ^=
 *              ---------------
 *              +=
 *              ---
 *              int a=10;
 *              a+=10; ==> a =a+10 => 20
 *              ----
 *              여러개 증가 시킬 때 사용 
 *              -------------------------
 *              a+=20 a=a+20
 *              a-=20 a=a-20
 *              a*=10 a=a*10
 *              a/=10 a=a/10
 *              a%=2  a=a%2
 *              
 *              
 *              
 *              
 */
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		a+=3;
//		System.out.println(a);
		int a=10;
		a=a+3;//a+=3
		System.out.println(a);
	}

}
