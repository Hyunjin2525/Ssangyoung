package com.sist.exception;
/*
 *  배열에 데이터를 저장 => 배열범위 초과
 *  나누기를 처리 => 0
 *  기타 에외처리 => 통합
 *  --------------------- RuntimeException
 *  
 *  가장 큰 예외처리는 마지막에 사용한다
 */

public class 예외처리_예외복구_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr=new int[2];
			arr[0]=10;
			arr[1]=2;
			System.out.println(arr[0]/arr[1]);
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
			
		}catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없다");
		}catch (RuntimeException e) {       //계층구조상 가장 큰 Exception을 젤 마지막에 작성한다
			System.out.println("에측 못한 에러!!");
		}                                    
		System.out.println("프로그램 종료");

	}

}
