// << , >> 
/*
 *   10<<2
 *   1010
 *  1010(0)(0)
 *  => 101000 => 40
 *  => 1010=> 0을 뒤에 2개 채운다
 *  => 7<<3
 *    111000
 *    
 *    8<<2
 *    100000
 *    =32
 *   
 *   x<<y ==> x*2^y
 *   --------------
 *   
 *   ==============
 *   10>>2
 *   1010
 *     ---제거 ==> 2
 *   
 *   15>>3
 *   1111 ==> 1
 *   
 *   
 *   27>>3
 *   11011
 *   
 *   x>>y ==> x/2^y
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println(10<<2);
	 System.out.println(7<<3);
	 System.out.println(8<<2);
	 System.out.println(15>>3);
	 System.out.println(10>>2);
	 System.out.println(27>>3);
		
	}

}
