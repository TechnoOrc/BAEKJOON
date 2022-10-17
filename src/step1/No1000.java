package step1;

import java.util.Scanner;

/*
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * 예제 입력
 * 1 2
 * 
 * 예제 출력
 * 3
 * 
 */
public class No1000 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		sc.close();
		
		System.out.println((A + B));
	
		
		
	}//main

}//class
