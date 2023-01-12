package step2;

import java.util.Scanner;

public class No2439 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = 0;

        n = sc.nextInt();
        sc.close();

        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
                for(int k = 0; k < n; k++){
                    System.out.println("*");
                }
            }

            System.out.println(" ");
        }

    }//main
}//class
