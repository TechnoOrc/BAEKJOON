package step3;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        
        int totalPrice = 0;
        int sumPrice = 0;
        int n = 0;
        int a = 0;
        int b = 0;
        
        Scanner sc = new Scanner(System.in);
        totalPrice = sc.nextInt();
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sumPrice = ( a * b ) + sumPrice;
        }
            sc.close();

        if(totalPrice == sumPrice){
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }


    }//main
}//class