package step2;

import java.util.Scanner;

public class No2884 {
    
    public static void main(String[] args) {
        
        int h, m = 0;
        Scanner sc = new Scanner(System.in);
        
        h = sc.nextInt();
        m = sc.nextInt();

        sc.close();

        if(m-45 >= 0){
            System.out.println(h + " "+ (m-45));
            
        }else if(m-45 < 0){
            System.out.println( (h-1) + " " + ((m-45)-60) );
        }

    }//main

}//class
