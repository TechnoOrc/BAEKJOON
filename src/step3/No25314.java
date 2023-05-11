package step3;

import java.util.Scanner;

public class No25314 {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        
        a = sc.nextInt();
        sc.close();
        
        for(int i=1; i <= a; i++){
            if(i % 4 == 0){
                String tmp = "long ";
                System.out.print(tmp);

            }
        }
        System.out.print("int");
    }//main
}//class