package step2;

import java.util.Scanner;

public class No2480 {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,c = 0;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int maxNum = 0;
        int sameNum = 0;
        int sameCount = 0;
        sc.close();

        maxNum = a > b ? a : b;
        maxNum = maxNum > c ? maxNum : c;

        if( a == b && b == c ){
            sameCount = 3;
            sameNum = a;
        } else if ( a == b && b != c ){
            sameCount = 2;
            sameNum = a;
        } else if ( a != b && b == c ){
            sameCount = 2;
            sameNum = b;
        }  else if ( a == c && b != c ){
            sameCount = 2;
            sameNum = a;
        } else if ( a != c && b == c ){
            sameCount = 2;
            sameNum = b;
        } else sameCount = 1;

        if(sameCount == 3){
            System.out.println( 10000 + (sameNum * 1000) );
        } else if(sameCount == 2){
            System.out.println( 1000 + (sameNum * 100) );
        } else System.out.println( maxNum * 100 );
        
    }//main

}//class
