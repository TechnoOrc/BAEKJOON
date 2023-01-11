package step2;

import java.util.Scanner;

public class No2438 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = 0;

        n = sc.nextInt();
        sc.close();

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }//main
}//class
