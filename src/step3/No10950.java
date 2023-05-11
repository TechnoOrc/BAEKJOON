package step3;

import java.util.Scanner;

public class No10950 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,t = 0;

        t = sc.nextInt();

        for(int i = 0; i < t ; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a + b);
        }
        sc.close();
        

    }//main
}//class
