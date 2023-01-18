package step2;

import java.util.Scanner;

public class No1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int before_a;
        String str;

        int after_a;
        int after_b;

        before_a = sc.nextInt();
        sc.close();

        if (before_a >= 0 && before_a < 99) {

            str = Integer.toString(before_a);
            System.out.println("str >>> " + str);
            System.out.println("str.substring(0,1) >>> " + str.substring(0, 1));
            System.out.println("str.substring(1,2) >>> " + str.substring(1, 2));
            if ( before_a < 10 ){
                after_a = 0;
                after_b = Integer.parseInt(str.substring(0, 1));
            } else {
                after_a = Integer.parseInt(str.substring(0, 1));
                after_b = Integer.parseInt(str.substring(1, 2));
            }
                

            System.out.println("after_a >>> " + after_a);
            System.out.println("after_b >>> " + after_b);

            // while(before_a >= 0 && before_a < 99){
            // for(int i = 1; before_a >= 0 && before_a < 99; i++){
            // System.out.println("i >>> " + i);
            // }//for

            // }//while
        } // if

    }// main
}// class
