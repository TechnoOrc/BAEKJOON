package step2;

import java.util.Scanner;

public class No14681 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x, y =0;

        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();
        
        if(x > 0 && y > 0){
            System.out.println(1);
        }else if(x < 0 && y > 0){
            System.out.println(2);
        }else if(x < 0 && y < 0){
            System.out.println(3);
        }else if(x > 0 && y < 0){
            System.out.println(4);
        }
        

    }//main

}//class
