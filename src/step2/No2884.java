package step2;

import java.util.Scanner;

public class No2884 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if(m < 45){
            m = 60 + (m-45);
            if(h < 1){
                h = 23;
            }else h = h-1;
            
        }else{
            m = m - 45;
        } 

        System.out.println(h + " " + m);

    }//main

}//class