package step2;

import java.util.Scanner;

public class No10951 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
        
    }//main
}//class
