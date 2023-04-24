package com.sist.exception;
/*
 *  문자열로 2개의 정수 받아서 => 정수로 변환한 후에 : NumberFormatException
 *  배열에 저장 : ArrrayIndexOutOfBoundsException
 *  나누기 한 값을 구한다 : ArithmeticExceptipn
 */

import java.util.*;

public class 예외처리_예외복구_3 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		String num1=scan.next();
		
		System.out.println("두번째 정수 입력:");
		String num2=scan.next();
		
		int[] arr=new int[2];
		 // 다중 catch => 예상되는 에러가 많은 경우에 주로 처리
		 // catch절은 한개 수행한다 => 다중 조건문
	    try
	    {
	    	int n1=Integer.parseInt(num1); // 문자열을 정수로 변환할 때 사용
	    	int n2=Integer.parseInt(num2);
	    	//배열에 첨부
	    	arr[0]=n1;
	    	arr[1]=n2;
	    	//나누기
	        System.out.println(arr[0]/arr[1]);
	    	
	    }catch(NumberFormatException e)
	    {
	    	System.out.println("정수 변환 에러");
	    }catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("배열 범위를 초과");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		System.out.println("프로그램 종료!!"); //출력 => 정상 종료

	}

}
