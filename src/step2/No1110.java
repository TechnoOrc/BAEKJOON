package step2;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int before_a;
        String before_str;

        int after_a;
        int after_b;
        int after_sum = 0;
        String after_str;



        before_a = sc.nextInt();
        sc.close();

        if (before_a >= 0 && before_a < 99) {

            before_str = Integer.toString(before_a); // 숫자를 문자로
            System.out.println("before_str >>> " + before_str);
            System.out.println("before_str.substring(0,1) >>> " + before_str.substring(0, 1)); // 문자열를 자르기
            if ( before_a < 10 ){
                after_a = 0;
                after_b = Integer.parseInt(before_str.substring(0, 1)); // 문자를 숫자로
                after_sum = after_a + after_b;
            } else {
                after_a = Integer.parseInt(before_str.substring(0, 1)); // 문자를 숫자로
                after_b = Integer.parseInt(before_str.substring(1, 2)); // 문자를 숫자로 
                after_sum = after_a + after_b;
            }
            after_str = Integer.toString(after_b) + Integer.toString(after_sum); // 숫자를 문자로
            System.out.println("after_a >>> " + after_a);
            System.out.println("after_b >>> " + after_b);
            System.out.println("after_str >>> " + after_str);
            System.out.println("after_sum >>> " + after_sum);

            
            



            // while(before_a >= 0 && before_a < 99){
            // for(int i = 1; before_a >= 0 && before_a < 99; i++){
            // System.out.println("i >>> " + i);
            // }//for

            // }//while
        } // if

    }// main
}// class
