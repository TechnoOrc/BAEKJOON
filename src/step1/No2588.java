package step1;

import java.util.Scanner;

// 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
// 1 초	128 MB	254187	120788	102227	47.918%
// 문제
// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.



// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

// 출력
// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

// 예제 입력 1 
// 472
// 385
// 예제 출력 1 
// 2360
// 3776
// 1416
// 181720

public class No2588 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int A = 0;
        int B = 0;

        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();

        String strB;
        strB = Integer.toString(B);
        int B1 = Integer.parseInt(strB.substring(0,1));
        int B2 = Integer.parseInt(strB.substring(1,2));
        int B3 = Integer.parseInt(strB.substring(2));

       
        
       
             

        System.out.println(A * B3);
        System.out.println(A * B2);
        System.out.println(A * B1);
        System.out.println(A * B);


    }//main
}//clss
