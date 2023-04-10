/*
 * 반복 제어문
 * => 특정부분을 제외 반복 수행(continue)
 *    whil : 조건식으로 이동
 *    for : 증가식으로 이동
 * => 반복 종료
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, i=1;
		while (i<100) {
		    if(i%3 != 0) {
		        i++;
		        continue;
		    }
		    else sum += i;
		    i++;
		}


	}

}
