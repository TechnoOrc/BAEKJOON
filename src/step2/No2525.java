package step2;

import java.util.Scanner;

public class No2525 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        sc.close();

        int j = m + n;
        int i = 0;
        int k = 0;
        
        if( j >= 60 ){ // 60부터 시간이 1씩증가한다
            for(i=1; j >= 60; i++){
                j = j - 60;
                k = i;
            }
            if( (k + h) - 24 >= 0){
                System.out.println((k + h) - 24 + " " + j);

            } else System.out.println((k + h) + " " + j);

        } else System.out.println(h + " " + j);
 
    }//main

}//class
