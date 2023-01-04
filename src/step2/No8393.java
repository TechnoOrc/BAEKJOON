package step2;

import java.util.Scanner;

public class No8393 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        int num = 0;
       
        for(int i = 1; i <= n ; i++){
           num = num + i;
        }
        System.out.println(num);

    }//main
}//class
